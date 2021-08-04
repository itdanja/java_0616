package Member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController implements Initializable {
									// 초기값 인터페이스 
	@Override // initialize 재정의
	public void initialize(URL arg0, ResourceBundle arg1) {
		// fxml 새로 열릴때  fxml 초기값 설정하는 메소드 
	}

	//fx:id 가져오기 
		// 씬빌더 => 메뉴 => view => 
	@FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Label btnlogin;

    @FXML
    private Label btnsignup;

    @FXML
    private Label btnfindid;

    @FXML
    private Label btnfindpassword;
    
    @FXML
    private Label lblinfo;

    @FXML
    void findid(MouseEvent event) {
    	System.out.println("[[ 아이디 찾기 페이지로 이동 ]]");
    }

    @FXML
    void findpassword(MouseEvent event) {
    	System.out.println("[[ 패스워드 찾기 페이지로 이동 ]]");
    }

    @FXML
    void login(MouseEvent event) {
    	System.out.println("[[ 로그인 처리 ]]");
    	// 아이디가 admin 이고 비밀번호가 1234인경우 
    	
    	if( txtid.getText().equals("admin") &&  		
    		txtpassword.getText().equals("1234") ) {

    		System.out.println(" [[[ 로그인 성공 ]]]");
    		// 페이지 변경 
    		return;
    	}
    	// 레이블에 메시지 넣기 
    	lblinfo.setText("동일한 회원정보가 없습니다");
    
    }

    @FXML
    void signup(MouseEvent event) {
    	System.out.println("[[ 회원가입 페이지로 이동 ]]");
    }
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
