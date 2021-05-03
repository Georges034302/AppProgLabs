
import javafx.application.*;
import javafx.stage.*;
import au.edu.uts.ap.javafx.*;
import static javafx.application.Application.launch;
import model.*;

public class StadiumApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ViewLoader.showStage(new Stadium(), "/view/stadium.fxml", "Stadium", stage);
    }
}
