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
    @FXML private TableView<Group> groupsTv;
   
    
    //add an FXML openBtn

    public final Stadium getStadium() { return model; }
    
    private Group getGroup() { return groupsTv.getSelectionModel().getSelectedItem(); }
   
    @FXML private void handleOpen(ActionEvent event) throws Exception {
        ViewLoader.showStage(getGroup(), "/view/group.fxml", "Group View", new Stage());
    }
}
