package application;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class ServerController implements Initializable {
	
	// 1. 스레드풀 사용
		// 여러명의 클라이언트가 동시에 요청 => 과부하 => 순서 매기기 
		// 여러개의 쓰레드의 요청에 순서 매겨서 하나씩 처리 
	public static ExecutorService threadpool;
			// 스레드풀 구현 인터페이스 :  ExecutorService
	// 2. 접속된 클라이언트 저장하기 위한 리스트 
	public static Vector<Client> clients = new Vector<>();  
		// vector 사용한 이유 : 멀티스레드[동기화:스레드 처리순서 ]
			// arraylist : 단일스레드[동기화x]
	// 3. 서버소켓 
	ServerSocket serversocket; // 서버소켓 선언 
	
	// 4. 서버 실행 메소드 [ 1.서버소켓 => 2.서버바인딩(ip,port할당) 3.클라이언트 접속 기다림 => 4.클라이언트 리스트 담기 ]
	public void serverstart() {
		try {
			// 1. 서버실행시 서버소켓의 메모리 할당
			serversocket = new ServerSocket();
			// 2. 서버 바인딩 [ 서버소켓 구축 ip , port ]
			serversocket.bind( new InetSocketAddress("127.0.0.1" , 1234));
		}catch (Exception e) {}
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						// 1. 클라이언트 접속 요청시 허가 
						Socket socket = serversocket.accept();
						// 2. 허가된 클라이언트를 리스트에 담기 
						clients.add( new Client(socket) ); 
						// *
						Platform.runLater( () -> txtserver.appendText(socket.getLocalAddress()+"\n"));
						Platform.runLater( () -> txtserver.appendText("현재 접속한 클라이언트수 : " + clients.size()) );
						
					}
				}catch (Exception e) {
					System.out.println("[[ 오류 발생 : 서버 종료 ]]");
					serverstop();
				}				
			}
		}; // runnable end
		
		threadpool = Executors.newCachedThreadPool(); // 스레드풀 인터페이스에 메모리 할당 
		threadpool.submit(runnable); // 스레드풀에 멀티스레드 추가
	}
	// 5. 서버 종료 메소드 
	public void serverstop() {
		try {
			// 1. 현재 접속된 클라이언트 소켓 모두 종료
			for( Client client : clients ) {
				client.socket.close();
			}
			// 2.서버소켓 종료
			serversocket.close();
			// 3. 스레드풀 종료
			threadpool.shutdown();
		}catch (Exception e) {
		}
	}
	
	// 씬빌더 fx:id 불러오기
    @FXML
    private TextArea txtserver;

    @FXML
    private Button btnstart;

    @FXML
    void start(ActionEvent event) {
    	
    	if( btnstart.getText().equals("서버실행") ) {
    		// 버튼의 내용이 서버실행이면
    			// 1. 서버실행 메소드 시작 
    				serverstart();
    			// 2. 메시지창에 내용 띄우기 
    				//Platform.runLater( () -> {실행코드});
    						// 람다식[익명메소드] : 인수 -> 실행코드
    			Platform.runLater( () -> {
    				String msg = "[서버시작]\n";	
    				txtserver.appendText(msg);	// 메시지창에 메시지 추가
    				btnstart.setText("서버중지"); // 버튼 이름 바꾸기 
    			} );
    	}else { // 버튼의 내용이 서버실행이 아니면 
    			// 1. 서버중지 
    				serverstop();
    			// 2. 메시지창에 내용 띄우기 
    			Platform.runLater( () -> { 
    				String msg ="[서버중지]\n";
    				txtserver.appendText(msg);
    				btnstart.setText("서버실행");
    			});
    	}
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 스테이지가 열릴때 초기값 
	}
	
	
}
