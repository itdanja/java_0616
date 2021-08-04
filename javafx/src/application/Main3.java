package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main3 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// ������ ���� fxml ���� �������� 
		Parent parent = FXMLLoader.load( getClass().getResource("Main3.fxml") );
			// 1. Parent ��� ���̾ƿ��� ������ ����ִ� Ŭ���� 
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
