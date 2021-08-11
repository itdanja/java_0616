package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClientController implements Initializable {

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

    @FXML
    private TextArea txtcontents;

    @FXML
    private TextField txtmsg;

    @FXML
    private Button btnsend;

    @FXML
    private Button btnconnect;

    @FXML
    private TextField txtname;

    @FXML
    void connect(ActionEvent event) {

    }

    @FXML
    void send(ActionEvent event) {

    }

	
	
	
	
}
