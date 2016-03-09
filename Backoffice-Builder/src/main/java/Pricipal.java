
import java.awt.TextField;

import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;

public class Pricipal extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(400, 300);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
		
	}

}
