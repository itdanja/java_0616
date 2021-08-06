package Member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class FindpasswordController implements Initializable {


    @FXML
    private Label btnfindpassword;

    @FXML
    private Label lblinfo;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtid;

    @FXML
    void findpassword(MouseEvent event) {
    	// 1.����Ʈ���� �Է¹��� ���̵���̸����� ������ ��� ���̺� ǥ�� 
    	for( User user : Main.userlist ) {
    		if( user.getId().equals( txtid.getText() )) {
    			// ����Ʈ�� ���̵�� �Է¹��� ���̵�� �����ϸ� 
    			if( user.getEmail().equals(txtemail.getText())) {
    				lblinfo.setText("���̵��� ��й�ȣ : " + user.getPassword() );
    				return;
    			}
    		}
    	}
    	lblinfo.setText("[ �˸� ] : ������ ȸ�������� �����ϴ�."); 
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
}
