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
    	// 1.리스트에서 입력받은 아이디와이메일이 동일한 경우 레이블 표시 
    	for( User user : Main.userlist ) {
    		if( user.getId().equals( txtid.getText() )) {
    			// 리스트내 아이디와 입력받은 아이디와 동일하면 
    			if( user.getEmail().equals(txtemail.getText())) {
    				lblinfo.setText("아이디의 비밀번호 : " + user.getPassword() );
    				return;
    			}
    		}
    	}
    	lblinfo.setText("[ 알림 ] : 동일한 회원정보가 없습니다."); 
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
}
