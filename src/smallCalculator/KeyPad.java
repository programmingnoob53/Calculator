package smallCalculator;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class KeyPad extends GridPane{
	
	private TextField txtField;
	private final String[] labels = {
			"pi", "e","log", "^2",
			"(", ")", "!", "/",
			"7", "8", "9", "X",
			"4", "5", "6", "-",
			"3", "2", "1", "+",
			"ln", "0", ",", "="
	};
	
	public KeyPad(double hgap, double vgap, TextField txtField){
		super(hgap, vgap);
		this.setAlignment(Pos.CENTER);
		this.txtField = txtField;
		pupulateLabels(3);
	}
	
	
	private void addButton(String label, EventHandler<ActionEvent> eventHandler, int colIndex, int rowIndex) {
		Button button = GUIFactory.getButton(label, eventHandler);
		this.add(button, colIndex, rowIndex);
	}
	
	public void appendString(ActionEvent event) {
		 String value = ((Button)event.getSource()).getText();
		 this.txtField.appendText(value);
	}
	
	private void pupulateLabels(int stopX) {
		int county = 0;
		int countx = 0;
		for(String label : labels) {
			this.addButton(label, this::appendString, countx, county);
			if(countx == stopX) {
				countx = 0;
				county++;
			}
			else {
				countx++;
			}
		}
	}
}
