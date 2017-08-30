import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class View extends Application {
	
	//Encapsulation of JavaFX components
	
	private Label topText;
	private TextField oldString;
	private Button flipButton;
	private Label newString;
	

	public void start(Stage primaryStage) throws Exception {
		
		GridPane layout = new GridPane(); //Creating the layout for the stage
		layout.setPadding(new Insets(10, 10, 10, 10));
		layout.setHgap(15);
		layout.setVgap(15);
		
		
		Scene mainScene = new Scene(layout, 350, 300);
		mainScene.getStylesheets().add("stylesheet.css"); // External stylesheet to override default
		
		
		
		topText = new Label("Enter a String");
		GridPane.setConstraints(topText, 0, 0);
		
		
		oldString = new TextField();
		GridPane.setConstraints(oldString, 0, 1);
		
		
		newString = new Label();
		newString.getStyleClass().add("label-2");
		GridPane.setConstraints(newString, 0, 3);
		
	
		flipButton = new Button("FLIP");
		GridPane.setConstraints(flipButton, 0, 2);
		
		
		/*This uses a lambda expression to pass a string from the text field
		 * to the Controller constructor and passes back the newString to display
		 *  as a Label below 
		 */
		
		flipButton.setOnAction(e -> {
			Controller control = new Controller(oldString.getText());
			control.handle(e);
			newString.setText(control.setNewString());
		});
		
		
		
		layout.getChildren().addAll(topText, oldString, flipButton, newString);
		primaryStage.setScene(mainScene);
		primaryStage.setTitle("String Flipper");
		primaryStage.show();
		
	}
	
	
}
