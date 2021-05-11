package controller;

import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.beans.property.*;
import java.io.*;
import au.edu.uts.ap.javafx.*;
import model.*;

public class StadiumController extends Controller<Stadium> {
    
    //Change ListView to TableView
    @FXML private ListView<Group> groupsLv;
   
    
    //add an FXML openBtn

    public final Stadium getStadium() { return model; }
    
    private Group getGroup() { return groupsLv.getSelectionModel().getSelectedItem(); }
   
    @FXML private void handleOpen(ActionEvent event) throws Exception {
        ViewLoader.showStage(getGroup(), "/view/group.fxml", "Stadium", new Stage());
    }
}
