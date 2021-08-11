package application;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClientController implements Initializable {

	// 1. 클라이언트 소켓 
	Socket socket;
	
	// 2. 클라이언트 시작 메소드
	public void clientstart() {
		// 1. 소켓생성 --> 2.서버소켓으로 부터 연결요청 
			
		Thread thread = new Thread() { // 멀티스레드 
			@Override // 재정의
			public void run() {
				try {
					socket = new Socket("127.0.0.1" , 1234); // 서버소켓의 ip와 post 
					receive();
				}catch (Exception e) {}
			}
			
		}; // 스레드 괄호 end 
		thread.start(); // run메소드(멀티스레드 로직 ) <---- start( run메소드호출 ) 
		
	}
	// 3. 클라이언트 종료 메소드 
	public void clientstop() {
		try {
			socket.close(); // 소켓 닫기 
		}catch (Exception e) {}
	}
	
	// 4. 메시지 보내는 메소드 
	public void send( String msg ) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream();
					byte[] bytes = msg.getBytes(); // 문자열 -> 바이트 
					outputStream.write(bytes); // 해당 바이트 내보내기 
					outputStream.flush(); // 스트림 초기화
				}catch (Exception e) {}
			}
		}; // 쓰레드 끝 
		thread.start();
	}
	
	// 5. 메시지 받는 메소드 
	public void receive() {
		while(true) {
			try {
				InputStream inputStream = socket.getInputStream();
				byte[] bytes = new byte[1000];
				inputStream.read(bytes); // 바이트 가져와서 
				String msg  = new String(bytes); // 바이트 => 문자열 
				// 받은 메시지를 메시지창에 띄우기 
					//Platform.runLater( () -> {실행코드} );
				Platform.runLater( () -> { txtcontents.appendText(msg); } );
			
			}catch (Exception e) {}
		}
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// fxml 처음  열렸을때 
		txtmsg.setDisable(true);
		btnsend.setDisable(true);
	}

    @FXML
    private TextArea txtcontents;

    @FXML
    private TextField txtmsg;

    @FXML
    private Button btnsend;

    @FXML
    private Button btnconnect;

    @FXML
    private TextField txtname;

    @FXML
    void connect(ActionEvent event) {
    	if( btnconnect.getText().equals("접속") ) {
    		//1. 클라이언트 실행 
    			clientstart();
    		Platform.runLater( () -> txtcontents.appendText("[채팅방 접속]\n"));
    		// 2. 접속후 
    		btnconnect.setText("종료");
    		txtmsg.setDisable(false);
    		btnsend.setDisable(false);
    		txtmsg.requestFocus(); 
    	}else {
    		
    		// 1.클라이언트 종료
    			clientstop();
    		Platform.runLater( () -> txtcontents.appendText("[채팅방 퇴장]\n"));
    		// 2. 종료후 
    		btnconnect.setText("접속");
    		txtmsg.setDisable(true);
    		btnsend.setDisable(true);
    	}
    }

    @FXML
    void send(ActionEvent event) {

    	// 메시지 보내기 
    	send( txtname.getText() + " : " + txtmsg.getText()+"\n" );
    	
    	// 보내기후 
    	txtmsg.setText(""); // 입력창 초기화
    	txtmsg.requestFocus(); // 포커스 : 커서
    	
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	
	
}
