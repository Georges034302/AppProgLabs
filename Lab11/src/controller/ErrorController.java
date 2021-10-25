package controller;

import au.edu.uts.ap.javafx.*;
import javafx.event.*;
import javafx.fxml.*;

/**
 *
 * @author George
 */
public class ErrorController extends Controller<Exception>{
    public final Exception getException(){return model;}
    
    @FXML private void handleOK(ActionEvent event){
        stage.close();
    }    
}
