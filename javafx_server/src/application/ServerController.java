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
	
	// 1. ������Ǯ ���
		// �������� Ŭ���̾�Ʈ�� ���ÿ� ��û => ������ => ���� �ű�� 
		// �������� �������� ��û�� ���� �Űܼ� �ϳ��� ó�� 
	public static ExecutorService threadpool;
			// ������Ǯ ���� �������̽� :  ExecutorService
	// 2. ���ӵ� Ŭ���̾�Ʈ �����ϱ� ���� ����Ʈ 
	public static Vector<Client> clients = new Vector<>();  
		// vector ����� ���� : ��Ƽ������[����ȭ:������ ó������ ]
			// arraylist : ���Ͻ�����[����ȭx]
	// 3. �������� 
	ServerSocket serversocket; // �������� ���� 
	
	// 4. ���� ���� �޼ҵ� [ 1.�������� => 2.�������ε�(ip,port�Ҵ�) 3.Ŭ���̾�Ʈ ���� ��ٸ� => 4.Ŭ���̾�Ʈ ����Ʈ ��� ]
	public void serverstart() {
		try {
			// 1. ��������� ���������� �޸� �Ҵ�
			serversocket = new ServerSocket();
			// 2. ���� ���ε� [ �������� ���� ip , port ]
			serversocket.bind( new InetSocketAddress("127.0.0.1" , 1234));
		}catch (Exception e) {}
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						// 1. Ŭ���̾�Ʈ ���� ��û�� �㰡 
						Socket socket = serversocket.accept();
						// 2. �㰡�� Ŭ���̾�Ʈ�� ����Ʈ�� ��� 
						clients.add( new Client(socket) ); 
						// *
						Platform.runLater( () -> txtserver.appendText(socket.getLocalAddress()+"\n"));
						Platform.runLater( () -> txtserver.appendText("���� ������ Ŭ���̾�Ʈ�� : " + clients.size()) );
						
					}
				}catch (Exception e) {
					System.out.println("[[ ���� �߻� : ���� ���� ]]");
					serverstop();
				}				
			}
		}; // runnable end
		
		threadpool = Executors.newCachedThreadPool(); // ������Ǯ �������̽��� �޸� �Ҵ� 
		threadpool.submit(runnable); // ������Ǯ�� ��Ƽ������ �߰�
	}
	// 5. ���� ���� �޼ҵ� 
	public void serverstop() {
		try {
			// 1. ���� ���ӵ� Ŭ���̾�Ʈ ���� ��� ����
			for( Client client : clients ) {
				client.socket.close();
			}
			// 2.�������� ����
			serversocket.close();
			// 3. ������Ǯ ����
			threadpool.shutdown();
		}catch (Exception e) {
		}
	}
	
	// ������ fx:id �ҷ�����
    @FXML
    private TextArea txtserver;

    @FXML
    private Button btnstart;

    @FXML
    void start(ActionEvent event) {
    	
    	if( btnstart.getText().equals("��������") ) {
    		// ��ư�� ������ ���������̸�
    			// 1. �������� �޼ҵ� ���� 
    				serverstart();
    			// 2. �޽���â�� ���� ���� 
    				//Platform.runLater( () -> {�����ڵ�});
    						// ���ٽ�[�͸�޼ҵ�] : �μ� -> �����ڵ�
    			Platform.runLater( () -> {
    				String msg = "[��������]\n";	
    				txtserver.appendText(msg);	// �޽���â�� �޽��� �߰�
    				btnstart.setText("��������"); // ��ư �̸� �ٲٱ� 
    			} );
    	}else { // ��ư�� ������ ���������� �ƴϸ� 
    			// 1. �������� 
    				serverstop();
    			// 2. �޽���â�� ���� ���� 
    			Platform.runLater( () -> { 
    				String msg ="[��������]\n";
    				txtserver.appendText(msg);
    				btnstart.setText("��������");
    			});
    	}
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// ���������� ������ �ʱⰪ 
	}
	
	
}
