package Member;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	
	@Override
	public void start(Stage stage) throws Exception {
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
