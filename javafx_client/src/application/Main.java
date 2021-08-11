package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent parent = FXMLLoader.load( getClass().getResource("client.fxml"));
		Scene scene = new Scene( parent);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("kakao talk");
		// �̹��� �������� 
			Image image = new Image("file:C:/Users/User/Desktop/H/java0616/javafx_/src/application/kakao.png");
			// �������� ������ �ֱ� 
			primaryStage.getIcons().add( image);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/*  
	 * 
	 * 1. ������ UI �ۼ� [ FX:ID ]
	 * 2. Parent Ŭ���� [ fxml������ ����ִ� ��ü ] 
	 * 		* load �ȵǴ°�� => ��������� ���̺귯�� ���
	 * 
	 * fx:id
	 * 
	 * 		btnconnect
	 * 			connect
	 * 		btnsend
	 * 			send
	 * 		txtname
	 * 		txtcontents
	 * 		txtmsg
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
