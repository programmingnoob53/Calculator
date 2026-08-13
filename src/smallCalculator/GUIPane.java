package smallCalculator;

import javafx.scene.layout.VBox;

public class GUIPane extends VBox{
	private TopSection topSection = new TopSection();
	private MiddleSection middleSection = new MiddleSection();
	
	public GUIPane() {
		this.getChildren().addAll(topSection, middleSection);
	}
	
}
