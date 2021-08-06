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
	
		// ���Ͽ��� ȸ�� �ҷ����� 
		FileInputStream fileInputStream = new FileInputStream("C:/Users/User/git/java_0616/javafx/src/Member/userlist.txt");
		byte[] bs = new byte[1024]; // ����Ʈ �迭 ���� 
		fileInputStream.read( bs ); // �б�
		String string = new String(bs);// ����Ʈ�迭 => ���ڿ� ��ȯ

		String[] string2 = string.split("\n"); // ȸ���� �з�
		for( int i = 0 ; i<string2.length-1 ; i++ ) {
			String[] string3 = string2[i].split(","); // �� ȸ���� �ʵ� �з� 
			User user = new User( string3[0] , string3[1] , string3[2] ); // ��ü 
			userlist.add(user); // ����Ʈ�� ��ü ��� 
		}
		fileInputStream.close(); // ���� �ݱ� 

		Parent parent = FXMLLoader.load(getClass().getResource("login.fxml") );
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false); // �������� ũ�⺯�� �Ұ� 
		stage.setTitle("���̴ٽ� ȸ����"); // �������� �̸�
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
		
	/*
	 *  login.fxml 
	 * 	
	 * 		fx:id [ java ���Ǵ� ��ü�� ] 
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
