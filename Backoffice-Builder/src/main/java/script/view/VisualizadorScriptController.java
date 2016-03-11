package script.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class VisualizadorScriptController {

	
	@FXML
	private	Button botaoNovoMetodo;
	
	@FXML
	private	TextArea visualizacaoScript;
	
	@FXML
	private void handleinsertText(){
		visualizacaoScript.setText("teste visualização");
	}
	
	@FXML
	private void initialize(){
		
	}

}
