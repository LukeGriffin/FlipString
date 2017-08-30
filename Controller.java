import javafx.event.ActionEvent;

public class Controller {

	private Model model = new Model();
	private String oldString;
	
	
	Controller(String oldString)
	{
		this.oldString = oldString;
	}
	
	public void handle(ActionEvent e) // Handles the button event
	{
		model.flipString(this.oldString); // If input validation is needed it goes here
	}
	
	public String setNewString() // Calls Accessor from Model so View can avoid interacting with Model
	{
		return model.getNewString(); 
	}


}
