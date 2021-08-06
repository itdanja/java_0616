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
    	// 1. 회원리스트에서 입력한 email 찾기 => 해당 회원 아이디 레이블 표시 
    	for( User user : Main.userlist ) {
    		if( user.getEmail().equals( txtemail.getText() ) ) {
    			lblinfo.setText("회원님의 아이디 : "+ user.getId() );
    			return;
    		}
    	}
    	lblinfo.setText("[ 알림 ] : 동일한 회원정보가 없습니다.");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	
}
