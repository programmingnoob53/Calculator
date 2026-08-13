package smallCalculator;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public final class GUIFactory {
	
	public static Button getButton(String label, EventHandler<ActionEvent> eventHandler) {
		Button newButton = new Button(label);
		newButton.setOnAction(eventHandler);
		return newButton;
	}
	
	
}
