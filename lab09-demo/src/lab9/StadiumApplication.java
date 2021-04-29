package lab9;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.fxml.*;

public class StadiumApplication extends Application {
	public static void main(String[] args) { launch(args); }
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("stadium.fxml"));
		Parent root = loader.load();
		stage.setTitle("Stadium");
		stage.setScene(new Scene(root));
		stage.sizeToScene();
		stage.show();
	}
}
