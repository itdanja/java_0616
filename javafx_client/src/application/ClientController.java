package application;

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
	public void clientstart() {}
	// 3. 클라이언트 종료 메소드 
	public void clientstop() {}
	// 4. 메시지 보내는 메소드 
	public void send( String msg ) {}
	// 5. 메시지 받는 메소드 
	public void receive() {}
	
	
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
    			// 미구현
    		Platform.runLater( () -> txtcontents.appendText("[채팅방 접속]\n"));
    		// 2. 접속후 
    		btnconnect.setText("종료");
    		txtmsg.setDisable(false);
    		btnsend.setDisable(false);
    		txtmsg.requestFocus(); 
    	}else {
    		
    		// 1.클라이언트 종료
    			// 미구현
    		Platform.runLater( () -> txtcontents.appendText("[채팅방 퇴장]\n"));
    		// 2. 종료후 
    		btnconnect.setText("접속");
    		txtmsg.setDisable(true);
    		btnsend.setDisable(true);
    	}
    }

    @FXML
    void send(ActionEvent event) {

    }

	
	
	
	
}
