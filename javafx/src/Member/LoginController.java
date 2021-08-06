package Member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController implements Initializable {
									// �ʱⰪ �������̽� 
	@Override // initialize ������
	public void initialize(URL arg0, ResourceBundle arg1) {
		// fxml ���� ������  fxml �ʱⰪ �����ϴ� �޼ҵ� 
	}

	//fx:id �������� 
		// ������ => �޴� => view => 
	@FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Label btnlogin;

    @FXML
    private Label btnsignup;

    @FXML
    private Label btnfindid;

    @FXML
    private Label btnfindpassword;
    
    @FXML
    private Label lblinfo;

    @FXML
    void findid(MouseEvent event) {
    	System.out.println("[[ ���̵� ã�� �������� �̵� ]]");
    }

    @FXML
    void findpassword(MouseEvent event) {
    	System.out.println("[[ �н����� ã�� �������� �̵� ]]");
    }

    @FXML
    void login(MouseEvent event) {
    	System.out.println("[[ �α��� ó�� ]]");
    	// ���̵� admin �̰� ��й�ȣ�� 1234�ΰ�� 
    	
    	if( txtid.getText().equals("admin") &&  		
    		txtpassword.getText().equals("1234") ) {

    		System.out.println(" [[[ �α��� ���� ]]]");
    		// ������ ���� 
    		return;
    	}
    	// ���̺��� �޽��� �ֱ� 
    	lblinfo.setText("������ ȸ�������� �����ϴ�");
    
    }

    @FXML
    void signup(MouseEvent event) {
    	try {
    		// 1. fxml ��������
    		Parent parent = FXMLLoader.load( getClass().getResource("signup.fxml") ); // ������ ����ó��
    		// 2. �������� �����
    		Stage stage = new Stage();
    		// 3. �� ����� => parent �ֱ� 
    		Scene scene = new Scene(parent);
    		// 4. �������� => �� �ֱ� 
    		stage.setScene(scene);
    		stage.setTitle("�Ƶ�ٽ� ȸ������");
    		stage.setResizable(false);
    		stage.show();
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}    	
    }
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}