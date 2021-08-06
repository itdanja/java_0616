package Member;

import java.io.FileOutputStream;
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
    	
    	// 1. 동일한 아이디 [ 중복체크 ] : 리스트에서 동일한 아이디 찾기 
    	for( User user : Main.userlist ) {
    		// for( 임시객체 : 리스트/배열 ) : 리스트내 모든 요소[객체] 하나씩 임시 객체 대입
    		if( user.getId().equals(id) ) {
    			// 리스트내 요소의 id 와 방금 입력한 아이디와 같으면 
    			lblinfo.setText(" 경고 : 이미 사용중인 아이디 입니다 " );
    			return; // 메소드 종료
    		}
    	}
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
   
    	// 파일처리 
    		// 1. 입력받은 데이터 => 객체 
    		User user = new User(id, password, email);
	        	// 리스트 담기 
	        	Main.userlist.add(user);
    		// 2. 객체 => 파일에 저장 
    		try {
    			FileOutputStream fileOutputStream = new 	
    					FileOutputStream("C:/Users/User/git/java_0616/javafx/src/Member/userlist.txt" , true); // 무조건 예외발생
    																				// 파일명경로 , true : 이어쓰기 
    																				// 파일명경로 , false[생략] : 새로작성 
    			// 스트림 [ 프로그램 -> 외부장치[파일] 통신 흐름 ]
    				// 이동단위 : 바이트 
    			String string = id+","+password+","+email+"\n";
    					// 필드구분용 [,]		회원구분용[\n]
    			fileOutputStream.write( string.getBytes() ); // 문자열을 바이트열로 변환후 내보내기 
    			fileOutputStream.close();
    		}catch (Exception e) {} 
    		
    	lblinfo.setText(" [ 회원가입 완료 ] 감사합니다 " );
    	
    	
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
