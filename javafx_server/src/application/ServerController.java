package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ServerController implements Initializable {
	
	// 1. ������Ǯ ���
	
	// 2. ���ӵ� Ŭ���̾�Ʈ �����ϱ� ���� ����Ʈ 
	
	// 3. �������� 
	
	// 4. ���� ���� �޼ҵ� 
	
	// 5. ���� ���� �޼ҵ� 
	
	
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
    				// �̱���
    			// 2. �޽���â�� ���� ���� 
    				//Platform.runLater( () -> {�����ڵ�});
    						// ���ٽ�[�͸��޼ҵ�] : �μ� -> �����ڵ�
    			Platform.runLater( () -> {
    				String msg = "[��������]\n";	
    				txtserver.appendText(msg);	// �޽���â�� �޽��� �߰�
    				btnstart.setText("��������"); // ��ư �̸� �ٲٱ� 
    			} );
    	}else { // ��ư�� ������ ���������� �ƴϸ� 
    			// 1. �������� 
    				// �̱���
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