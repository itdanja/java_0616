package day05;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Day05_5_�������� {
	
	// �ܺ� API : �⺻������ ���� ���� �ʴ� ���̺귯�� �ٿ�ε� �޾� ����ϱ� 
	
	// SMTP : Simple Mail Transfer Protocol 
		// Protocol : ��� �Ծ� [ ����Ҷ� ���ѾߵǴ� �Ծ�(���) ]
	
	// 1. STMP Ŭ������ ����ϱ� ���� ���̺귯�� �ٿ�ε� 
		// 1. activation.jar 	2. mail-1.4.7.jar 
	
	// 2. ���� ������Ʈ�� ���̺귯�� �߰�[���]
		// 1. ���� ������Ʈ ������Ŭ�� 
		// 2. build path => configure build path
		// 3. ��[�޴�]���� libraries => add external jars
		// 4. ������ �ٿ�ε� ���� ���� 2�� ���� �߰� 
			// ** 1.8 ���� �̻� 
				// 1. ��[�޴�]���� libraries => classpath���� => add external jars
				// 2.  module-info ���Ͽ� �Ʒ� �߰� 
					/*
					  		requires activation; 
							requires mail;
							
							//opens ���̺귯���� �������Ű���� to activation , mail;
					 		opens day05 to activation , mail;
					 */
		// 5. ���̹� ���� ���� 
			// 1. ���̹� ���� ȯ�漳��
			// 2. POP3/IMAP ����
			// 3. IMAP/SMTP ����
			// 4. �����  => Ȯ�� 
	
	public static void main(String[] args) {
				
		// 1. ���� [ ���̹� ���� ] 
		String host ="smtp.naver.com"; // ���� ȸ�� ȣ��Ʈ�� [ �ش� ����Ʈ������ Ȯ�ΰ��� ] 
		String fromemail = "�����»�����̵�@naver.com"; 
		String frompassword = "�н�����";
		String toemail = "�޴»�� �̸���";
		
		Properties properties = new Properties(); // ���� ���� [ map �÷��� ] 
		
		properties.put("mail.smtp.host", host ); // host : ����ȸ�� ȣ��Ʈ[ ��� �̸� ] 
		properties.put("mail.smtp.prot", 587 ); // port : ����ȸ�� ȣ��Ʈ�� smtp port[ ��� ��ȣ ] 
		properties.put("mail.smtp.auth", "true"); // �����ޱ� ��
		
		// 2. ���� 
		//Session session = Session.getDefaultInstance(properties , new Authenticator() { } );
		Session session = Session.getDefaultInstance(properties , new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication( fromemail , frompassword );
			}
		});
		
		// 3. ���Ϻ����� 
		try {
			MimeMessage message = new MimeMessage( session ); // �޽����� ���� ó�� 
			message.setFrom( new InternetAddress(fromemail) ); // ����ó�� �߻� 
			message.addRecipient(Message.RecipientType.TO , new InternetAddress(toemail) ); // �޴� ��� 
			message.setSubject("java���� ���Ϻ����� ���� "); // ���� ���� 
			message.setText("java���� ���Ϻ����� �����Դϴ�"); // ���� ���� 
			
			Transport.send(message);// ��������
			
		}catch (Exception e) {}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
