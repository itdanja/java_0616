package Member;

import java.io.FileInputStream;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	
	public static ArrayList<User> userlist = new ArrayList<User>();
	
	
	
	@Override
	public void start(Stage stage) throws Exception {
	
		// 파일에서 회원 불러오기 
		FileInputStream fileInputStream = new FileInputStream("C:/Users/User/git/java_0616/javafx/src/Member/userlist.txt");
		byte[] bs = new byte[1024]; // 바이트 배열 선언 
		fileInputStream.read( bs ); // 읽기
		String string = new String(bs);// 바이트배열 => 문자열 변환

		String[] string2 = string.split("\n"); // 회원별 분류
		for( int i = 0 ; i<string2.length-1 ; i++ ) {
			String[] string3 = string2[i].split(","); // 각 회원의 필드 분류 
			User user = new User( string3[0] , string3[1] , string3[2] ); // 객체 
			userlist.add(user); // 리스트에 객체 담기 
		}
		fileInputStream.close(); // 파일 닫기 

		Parent parent = FXMLLoader.load(getClass().getResource("login.fxml") );
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false); // 스테이지 크기변경 불가 
		stage.setTitle("아이다스 회원제"); // 스테이지 이름
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
		
	/*
	 *  login.fxml 
	 * 	
	 * 		fx:id [ java 사용되는 객체명 ] 
	 * 		
	 * 		1.txtid
	 * 		2.txtpassword
	 * 		3.btnlogin
	 * 			OnMouseClicked : login
	 * 		4.btnsignup
	 * 			OnMouseClicked : signup
	 * 		5.btnfindid
	 * 			OnMouseClicked : findid
	 * 		6.btnfindpassword
	 * 			OnMouseClicked : findpassword
	 * 		7. lblinfo
	 * 
	 */
	
	/*
	 * 	signup.fxml
	 * 
	 * 		fx:id 
	 * 
	 * 		1. txtid
	 * 		2. txtpassword
	 * 		3. txtpasswordconfirm
	 * 		4. txtemail
	 * 		5. btnsignup
	 * 			OnMouseClicked : signup
	 * 		6. lblinfo
	 * 
	 */
	
	/*
	 * 	findid.fxml
	 * 
	 * 	fx :id
	 * 		1.txtemail
	 * 		2.btnfindid
	 * 			OnMouseClicked : findid
	 * 		3.lblinfo
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
