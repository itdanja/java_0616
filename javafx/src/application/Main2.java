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

//javfx : Stage[ ������â ] -> Scene[ ������ �ȿ� ȭ�� ] -> Graph[ ���̾ƿ� , ��Ʈ�� ]
public class Main2 extends Application {
				// 1. javafx ��Ű������ application Ŭ�����κ��� ��ӹޱ� 
					// javafx ���õ� �޼ҵ带 ��밡�� 
	
	// 2.application Ŭ������ start�޼ҵ� ������
	@Override 
	public void start(Stage stage) throws Exception {
						// 4. Stage ��ü�� ����
		VBox box = new VBox(); // ���̾ƿ� ���� 
		box.setAlignment(Pos.CENTER); // ��� ���� 
			// ��ư ��Ʈ�� ���� 
			Button button = new Button();
			// ��ư ��Ʈ�� ���� 
			button.setText("Ŭ��");
			button.setOnAction( i -> Platform.exit() );
								// ���ٽ�[�͸�޼ҵ�] :   �μ� -> �����ڵ� 
		
			// ���̺� ��Ʈ�� ����
			Label label = new Label();
			label.setText("�ȳ��ϼ��� fx �Դϴ�" );
			label.setFont( new Font(20));
			
		// ���̾ƿ��� ��Ʈ�� �ֱ� 
		box.getChildren().add(button);
		box.getChildren().add(label);
		
		// ���� ���̾ƿ� �߰� 
		Scene scene = new Scene(box);
		// ���������� �� �߰� 
		stage.setScene(scene);
		// �������� ���� 
		stage.show();
			
	}
	
	public static void main(String[] args) {
		launch(args); // 3. start �޼ҵ� ���� 
	}
	
}
