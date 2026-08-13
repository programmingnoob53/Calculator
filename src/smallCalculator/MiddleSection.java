package smallCalculator;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class MiddleSection extends VBox{
	
	private TextField txtAnswer = new TextField();
	private Button btnCancel = GUIFactory.getButton("CA", this::cancel);
	private KeyPad keyPad = new KeyPad(5, 5, txtAnswer);
	
	public MiddleSection() {
		super(5);
		setPadding(new Insets(3));
		getChildren().addAll(txtAnswer, btnCancel, keyPad);
	}
	
	
	private void cancel(ActionEvent event) {
		txtAnswer.clear();
	}
}
