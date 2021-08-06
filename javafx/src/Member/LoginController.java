package Member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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
    	try {
    		Parent parent = FXMLLoader.load( getClass().getResource("findid.fxml") );
    		Stage stage = new Stage();
    		Scene scene = new Scene(parent);
    		stage.setScene(scene);
    		stage.setTitle("아이다스 아이디찾기");
    		stage.setResizable(false);
    		stage.show();
    	}
    	catch (Exception e) {} 
    }

    @FXML
    void findpassword(MouseEvent event) {
    	System.out.println("[[ 패스워드 찾기 페이지로 이동 ]]");
    }

    @FXML
    void login(MouseEvent event) {
    	// 1. 로그인창에서 입력한 아이디와 비밀번호가 리스트내 존재하면 로그인 성공 
    	
	    for( User user : Main.userlist ) {
	    	
	    	if( txtid.getText().equals( user.getId() ) &&  		
		    		txtpassword.getText().equals( user.getPassword() ) ) {
	    		
	    		System.out.println(" [[[ 로그인 성공 ]]]");
	    		// 페이지 변경 
	    		return;
	    	}
	    }
	    	// 레이블에 메시지 넣기 
	    	lblinfo.setText("동일한 회원정보가 없습니다");
    }

    @FXML
    void signup(MouseEvent event) {
    	try {
    		// 1. fxml 가져오기
    		Parent parent = FXMLLoader.load( getClass().getResource("signup.fxml") ); // 무조건 예외처리
    		// 2. 스테이지 만들기
    		Stage stage = new Stage();
    		// 3. 씬 만들기 => parent 넣기 
    		Scene scene = new Scene(parent);
    		// 4. 스페이지 => 씬 넣기 
    		stage.setScene(scene);
    		stage.setTitle("아디다스 회원가입");
    		stage.setResizable(false);
    		stage.show();
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}    	
    }
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
