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
		
		//1. fxml 파일 가져와서 객체화
		Parent parent = FXMLLoader.load( getClass().getResource("server.fxml")); //*무조건 예외처리 
		//2. 씬 만들어서 => fxml 객체 넣기
		Scene scene = new Scene(parent);
		//3. 스테이지 => 씬넣기
		primaryStage.setScene(scene);
		//4. 스테이지 설정 
		primaryStage.setTitle("[kakao_s]"); // 스테이지 이름
		primaryStage.setResizable(false); // 화면크기 조절 불가 
			// 이미지 가져오기 
			Image image = new Image("file:C:/Users/User/Desktop/H/java0616/javafx_server/src/application/kakao.png");
			// 스테이지 아이콘 넣기 
			primaryStage.getIcons().add( image);
		//5. 스테이지 실행
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
