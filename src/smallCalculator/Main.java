package smallCalculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{
	
	private Image icon = new Image("assets/icon.jpg");

	@Override
	public void start(Stage stage) throws Exception {
		GUIPane pane = new GUIPane();
		Scene scene = new Scene(pane, 500, 500);
		stage.getIcons().add(icon);
		stage.setScene(scene);
		stage.setTitle("Calculator");
		stage.setResizable(false);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
