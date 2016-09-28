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
		
	}

	@FXML
	private void initialize() {
		criaScript();
		atualizarVisualizacao();
	}

	private void criaScript() {
		scriptTratamento = new ScriptTratamento("src/main/resources/Template.tpt");
	}

	private void atualizarVisualizacao() {
		visualizacaoScript.setText(scriptTratamento.getScript().toString());		
	}
}
