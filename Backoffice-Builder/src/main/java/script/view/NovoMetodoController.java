package script.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class NovoMetodoController {
	@FXML
	private TextArea textInsertMetodo;
	
	@FXML
	private Button buttonAdicionar;
	
	private void handleAdicionarMetodo(){
		textInsertMetodo.getText();
	}
}
