package epostfx.code;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import epostfx.Main;

public class MailLayoutController
{
	public Main mainClass;
	
	@FXML
	public TableColumn<String, Integer> columnDate;
	
	@FXML
	public ScrollPane scrollPane;
	
	@FXML
	public void initialize()
	{
		scrollPane.setFitToWidth(true);
		scrollPane.setFitToHeight(true);
	}
	
	public void setMainClass(Main main)
	{
		mainClass = main;
	}

}
