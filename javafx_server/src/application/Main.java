package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//1. fxml ���� �����ͼ� ��üȭ
		Parent parent = FXMLLoader.load( getClass().getResource("server.fxml")); //*������ ����ó�� 
		//2. �� ���� => fxml ��ü �ֱ�
		Scene scene = new Scene(parent);
		//3. �������� => ���ֱ�
		primaryStage.setScene(scene);
		//4. �������� ���� 
		primaryStage.setTitle("[kakao_s]"); // �������� �̸�
		primaryStage.setResizable(false); // ȭ��ũ�� ���� �Ұ� 
			// �̹��� �������� 
			Image image = new Image("file:C:/Users/User/Desktop/H/java0616/javafx_server/src/application/kakao.png");
			// �������� ������ �ֱ� 
			primaryStage.getIcons().add( image);
		//5. �������� ����
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
