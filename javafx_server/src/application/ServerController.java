package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ServerController implements Initializable {
	
	// 1. 스레드풀 사용
	
	// 2. 접속된 클라이언트 저장하기 위한 리스트 
	
	// 3. 서버소켓 
	
	// 4. 서버 실행 메소드 
	
	// 5. 서버 종료 메소드 
	
	
	// 씬빌더 fx:id 불러오기
    @FXML
    private TextArea txtserver;

    @FXML
    private Button btnstart;

    @FXML
    void start(ActionEvent event) {
    	
    	if( btnstart.getText().equals("서버실행") ) {
    		// 버튼의 내용이 서버실행이면
    			// 1. 서버실행 메소드 시작 
    				// 미구현
    			// 2. 메시지창에 내용 띄우기 
    				//Platform.runLater( () -> {실행코드});
    						// 람다식[익명메소드] : 인수 -> 실행코드
    			Platform.runLater( () -> {
    				String msg = "[서버시작]\n";	
    				txtserver.appendText(msg);	// 메시지창에 메시지 추가
    				btnstart.setText("서버중지"); // 버튼 이름 바꾸기 
    			} );
    	}else { // 버튼의 내용이 서버실행이 아니면 
    			// 1. 서버중지 
    				// 미구현
    			// 2. 메시지창에 내용 띄우기 
    			Platform.runLater( () -> { 
    				String msg ="[서버중지]\n";
    				txtserver.appendText(msg);
    				btnstart.setText("서버실행");
    				
    			});
    	}
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 스테이지가 열릴때 초기값 
	}
	
	
}
