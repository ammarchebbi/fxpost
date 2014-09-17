package epostfx;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import epostfx.code.MailLayoutController;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/MailLayout.fxml"));
			BorderPane rootLayout = (BorderPane) loader.load();
			
			Scene scene = new Scene(rootLayout);
			scene.getStylesheets().add("epostfx/epostfx.css");
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			MailLayoutController mlc = loader.getController();
			mlc.setMainClass(this);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void addDraggableNode(Node node)
	{
		System.out.println(":)");
	}
}
