package Member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class FindidController implements Initializable {
	
    @FXML
    private Label btnfindid;

    @FXML
    private Label lblinfo;

    @FXML
    private TextField txtemail;

    @FXML
    void findid(MouseEvent event) {
    	// 1. ȸ������Ʈ���� �Է��� email ã�� => �ش� ȸ�� ���̵� ���̺� ǥ�� 
    	for( User user : Main.userlist ) {
    		if( user.getEmail().equals( txtemail.getText() ) ) {
    			lblinfo.setText("ȸ������ ���̵� : "+ user.getId() );
    			return;
    		}
    	}
    	lblinfo.setText("[ �˸� ] : ������ ȸ�������� �����ϴ�.");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	
}
