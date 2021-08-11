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

	// 1. Ŭ���̾�Ʈ ���� 
	Socket socket;
	
	// 2. Ŭ���̾�Ʈ ���� �޼ҵ�
	public void clientstart() {
		// 1. ���ϻ��� --> 2.������������ ���� �����û 
			
		Thread thread = new Thread() { // ��Ƽ������ 
			@Override // ������
			public void run() {
				try {
					socket = new Socket("127.0.0.1" , 1234); // ���������� ip�� post 
					receive();
				}catch (Exception e) {}
			}
			
		}; // ������ ��ȣ end 
		thread.start(); // run�޼ҵ�(��Ƽ������ ���� ) <---- start( run�޼ҵ�ȣ�� ) 
		
	}
	// 3. Ŭ���̾�Ʈ ���� �޼ҵ� 
	public void clientstop() {
		try {
			socket.close(); // ���� �ݱ� 
		}catch (Exception e) {}
	}
	
	// 4. �޽��� ������ �޼ҵ� 
	public void send( String msg ) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream();
					byte[] bytes = msg.getBytes(); // ���ڿ� -> ����Ʈ 
					outputStream.write(bytes); // �ش� ����Ʈ �������� 
					outputStream.flush(); // ��Ʈ�� �ʱ�ȭ
				}catch (Exception e) {}
			}
		}; // ������ �� 
		thread.start();
	}
	
	// 5. �޽��� �޴� �޼ҵ� 
	public void receive() {
		while(true) {
			try {
				InputStream inputStream = socket.getInputStream();
				byte[] bytes = new byte[1000];
				inputStream.read(bytes); // ����Ʈ �����ͼ� 
				String msg  = new String(bytes); // ����Ʈ => ���ڿ� 
				// ���� �޽����� �޽���â�� ���� 
					//Platform.runLater( () -> {�����ڵ�} );
				Platform.runLater( () -> { txtcontents.appendText(msg); } );
			
			}catch (Exception e) {}
		}
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// fxml ó��  �������� 
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
    	if( btnconnect.getText().equals("����") ) {
    		//1. Ŭ���̾�Ʈ ���� 
    			clientstart();
    		Platform.runLater( () -> txtcontents.appendText("[ä�ù� ����]\n"));
    		// 2. ������ 
    		btnconnect.setText("����");
    		txtmsg.setDisable(false);
    		btnsend.setDisable(false);
    		txtmsg.requestFocus(); 
    	}else {
    		
    		// 1.Ŭ���̾�Ʈ ����
    			clientstop();
    		Platform.runLater( () -> txtcontents.appendText("[ä�ù� ����]\n"));
    		// 2. ������ 
    		btnconnect.setText("����");
    		txtmsg.setDisable(true);
    		btnsend.setDisable(true);
    	}
    }

    @FXML
    void send(ActionEvent event) {

    	// �޽��� ������ 
    	send( txtname.getText() + " : " + txtmsg.getText()+"\n" );
    	
    	// �������� 
    	txtmsg.setText(""); // �Է�â �ʱ�ȭ
    	txtmsg.requestFocus(); // ��Ŀ�� : Ŀ��
    	
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	
	
}
