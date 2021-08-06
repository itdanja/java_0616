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
    	try {
    		Parent parent = FXMLLoader.load( getClass().getResource("findid.fxml") );
    		Stage stage = new Stage();
    		Scene scene = new Scene(parent);
    		stage.setScene(scene);
    		stage.setTitle("���̴ٽ� ���̵�ã��");
    		stage.setResizable(false);
    		stage.show();
    	}
    	catch (Exception e) {} 
    }

    @FXML
    void findpassword(MouseEvent event) {
    	System.out.println("[[ �н����� ã�� �������� �̵� ]]");
    }

    @FXML
    void login(MouseEvent event) {
    	// 1. �α���â���� �Է��� ���̵�� ��й�ȣ�� ����Ʈ�� �����ϸ� �α��� ���� 
    	
	    for( User user : Main.userlist ) {
	    	
	    	if( txtid.getText().equals( user.getId() ) &&  		
		    		txtpassword.getText().equals( user.getPassword() ) ) {
	    		
	    		System.out.println(" [[[ �α��� ���� ]]]");
	    		// ������ ���� 
	    		return;
	    	}
	    }
	    	// ���̺� �޽��� �ֱ� 
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
