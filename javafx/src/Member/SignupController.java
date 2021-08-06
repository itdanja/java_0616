package Member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SignupController implements Initializable {
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Label btnsignup;

    @FXML
    private Label lblinfo;

    @FXML
    private PasswordField txtpasswordconfirm;

    @FXML
    private TextField txtemail;

    @FXML
    void signup(MouseEvent event) {
    	
    	String id = txtid.getText(); // 입력된 텍스트 가져오기
    	String password =txtpassword.getText();
    	String passwordconfirm = txtpasswordconfirm.getText();
    	String email = txtemail.getText();
    	
    	// 1. 동일한 아이디 [ 중복체크 ]
    	
    	// 2. 비밀번호가 일치하지 않을경우 
    	if( !password.equals(passwordconfirm) ) {
    		lblinfo.setText(" 경고 : 두 패스워드가 일치하지 않습니다 " );
    		return; // 메소드 종료
    	}
    	// 3. 이메일에 @가 포함되어 있지 않을경우 
    	if( email.indexOf("@") == -1 ) {		// 문자열.indexOf("검색문자") : 해당 문자열에 검색문자가 없으면 -1 
    		lblinfo.setText(" 경고 : 이메일형식으로 입력해주세요 [@포함] ");
    		return; // 메소드 종료 
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
