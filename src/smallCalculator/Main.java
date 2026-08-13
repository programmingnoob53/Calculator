package smallCalculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		GUIPane pane = new GUIPane();
		Scene scene = new Scene(pane, 500, 500);
		stage.setScene(scene);
		stage.setTitle("Calculator");
		stage.setResizable(false);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
