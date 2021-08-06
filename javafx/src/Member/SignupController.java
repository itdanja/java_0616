package Member;

import java.io.FileOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SignupController implements Initializable {
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Label btnsignup;

    @FXML
    private Label lblinfo;

    @FXML
    private PasswordField txtpasswordconfirm;

    @FXML
    private TextField txtemail;

    @FXML
    void signup(MouseEvent event) {
    	
    	String id = txtid.getText(); // �Էµ� �ؽ�Ʈ ��������
    	String password =txtpassword.getText();
    	String passwordconfirm = txtpasswordconfirm.getText();
    	String email = txtemail.getText();
    	
    	// 1. ������ ���̵� [ �ߺ�üũ ] : ����Ʈ���� ������ ���̵� ã�� 
    	for( User user : Main.userlist ) {
    		// for( �ӽð�ü : ����Ʈ/�迭 ) : ����Ʈ�� ��� ���[��ü] �ϳ��� �ӽ� ��ü ����
    		if( user.getId().equals(id) ) {
    			// ����Ʈ�� ����� id �� ��� �Է��� ���̵�� ������ 
    			lblinfo.setText(" ��� : �̹� ������� ���̵� �Դϴ� " );
    			return; // �޼ҵ� ����
    		}
    	}
    	// 2. ��й�ȣ�� ��ġ���� ������� 
    	if( !password.equals(passwordconfirm) ) {
    		lblinfo.setText(" ��� : �� �н����尡 ��ġ���� �ʽ��ϴ� " );
    		return; // �޼ҵ� ����
    	}
    	// 3. �̸��Ͽ� @�� ���ԵǾ� ���� ������� 
    	if( email.indexOf("@") == -1 ) {		// ���ڿ�.indexOf("�˻�����") : �ش� ���ڿ��� �˻����ڰ� ������ -1 
    		lblinfo.setText(" ��� : �̸����������� �Է����ּ��� [@����] ");
    		return; // �޼ҵ� ���� 
    	}
   
    	// ����ó�� 
    		// 1. �Է¹��� ������ => ��ü 
    		User user = new User(id, password, email);
	        	// ����Ʈ ��� 
	        	Main.userlist.add(user);
    		// 2. ��ü => ���Ͽ� ���� 
    		try {
    			FileOutputStream fileOutputStream = new 	
    					FileOutputStream("C:/Users/User/git/java_0616/javafx/src/Member/userlist.txt" , true); // ������ ���ܹ߻�
    																				// ���ϸ��� , true : �̾�� 
    																				// ���ϸ��� , false[����] : �����ۼ� 
    			// ��Ʈ�� [ ���α׷� -> �ܺ���ġ[����] ��� �帧 ]
    				// �̵����� : ����Ʈ 
    			String string = id+","+password+","+email+"\n";
    					// �ʵ屸�п� [,]		ȸ�����п�[\n]
    			fileOutputStream.write( string.getBytes() ); // ���ڿ��� ����Ʈ���� ��ȯ�� �������� 
    			fileOutputStream.close();
    		}catch (Exception e) {} 
    		
    	lblinfo.setText(" [ ȸ������ �Ϸ� ] �����մϴ� " );
    	
    	
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
