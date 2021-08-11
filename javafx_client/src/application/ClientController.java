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

	// 1. Ŭ���̾�Ʈ ���� 
	Socket socket;
	// 2. Ŭ���̾�Ʈ ���� �޼ҵ�
	public void clientstart() {}
	// 3. Ŭ���̾�Ʈ ���� �޼ҵ� 
	public void clientstop() {}
	// 4. �޽��� ������ �޼ҵ� 
	public void send( String msg ) {}
	// 5. �޽��� �޴� �޼ҵ� 
	public void receive() {}
	
	
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
    			// �̱���
    		Platform.runLater( () -> txtcontents.appendText("[ä�ù� ����]\n"));
    		// 2. ������ 
    		btnconnect.setText("����");
    		txtmsg.setDisable(false);
    		btnsend.setDisable(false);
    		txtmsg.requestFocus(); 
    	}else {
    		
    		// 1.Ŭ���̾�Ʈ ����
    			// �̱���
    		Platform.runLater( () -> txtcontents.appendText("[ä�ù� ����]\n"));
    		// 2. ������ 
    		btnconnect.setText("����");
    		txtmsg.setDisable(true);
    		btnsend.setDisable(true);
    	}
    }

    @FXML
    void send(ActionEvent event) {

    }

	
	
	
	
}
