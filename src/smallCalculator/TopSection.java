package smallCalculator;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class TopSection extends HBox{
	private Label modeLabel = new Label("Label top");
	private Button menuBtn = GUIFactory.getButton("Menu", null);
	private Button historyBtn = GUIFactory.getButton("History", null);
	
	public TopSection() {
		setSpacing(160);
		setPadding(new Insets(10));
		this.getChildren().addAll(menuBtn, modeLabel, historyBtn);
	}
}
