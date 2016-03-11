package script.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import script.ScriptTratamento;

public class VisualizadorScriptController {
	ScriptTratamento scriptTratamento;

	@FXML
	private Button botaoNovoMetodo;

	@FXML
	private TextArea visualizacaoScript;

	@FXML
	private void handleNovoMetodo() {
		visualizacaoScript.setText("teste visualização");
	}

	@FXML
	private void initialize() {
		criaScript();
	}
	
	private void criaScript(){
		scriptTratamento = new ScriptTratamento();
	}

}
