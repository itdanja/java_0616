package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main3 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// 씬빌더 만든 fxml 파일 가져오기 
		Parent parent = FXMLLoader.load( getClass().getResource("Main3.fxml") );
			// 1. Parent 모든 레이아웃과 컨르롤 담아주는 클래스 
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
