package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//javfx : Stage[ 윈도우창 ] -> Scene[ 윈도우 안에 화면 ] -> Graph[ 레이아웃 , 컨트롤 ]
public class Main2 extends Application {
				// 1. javafx 패키지에서 application 클래스로부터 상속받기 
					// javafx 관련된 메소드를 사용가능 
	
	// 2.application 클래스내 start메소드 재정의
	@Override 
	public void start(Stage stage) throws Exception {
						// 4. Stage 객체명 설정
		VBox box = new VBox(); // 레이아웃 생성 
		box.setAlignment(Pos.CENTER); // 가운데 정렬 
			// 버튼 컨트롤 생성 
			Button button = new Button();
			// 버튼 컨트롤 설정 
			button.setText("클릭");
			button.setOnAction( i -> Platform.exit() );
								// 람다식[익명메소드] :   인수 -> 실행코드 
		
			// 레이블 컨트롤 생성
			Label label = new Label();
			label.setText("안녕하세요 fx 입니다" );
			label.setFont( new Font(20));
			
		// 레이아웃에 컨트롤 넣기 
		box.getChildren().add(button);
		box.getChildren().add(label);
		
		// 씬에 레이아웃 추가 
		Scene scene = new Scene(box);
		// 스테이지에 씬 추가 
		stage.setScene(scene);
		// 스테이지 실행 
		stage.show();
			
	}
	
	public static void main(String[] args) {
		launch(args); // 3. start 메소드 실행 
	}
	
}
