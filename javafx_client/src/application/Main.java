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
		// 이미지 가져오기 
			Image image = new Image("file:C:/Users/User/Desktop/H/java0616/javafx_/src/application/kakao.png");
			// 스테이지 아이콘 넣기 
			primaryStage.getIcons().add( image);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/*  
	 * 
	 * 1. 씬빌더 UI 작성 [ FX:ID ]
	 * 2. Parent 클래스 [ fxml파일을 담아주는 객체 ] 
	 * 		* load 안되는경우 => 모듈인포에 라이브러리 등록
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
