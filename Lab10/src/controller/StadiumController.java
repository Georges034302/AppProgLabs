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
import javafx.scene.input.MouseEvent;
import model.*;

public class StadiumController extends Controller<Stadium>{  
    @FXML private Button openBtn;
    @FXML private ListView<Group> groupsLv;
    
    public final Stadium getStadium(){return model;}
    
    private Group getGroup(){return groupsLv.getSelectionModel().getSelectedItem(); }
    
    @FXML public void initialize(){}
            
    @FXML private void handleOpen(ActionEvent event) throws IOException{
        ViewLoader.showStage(getGroup(), "/view/group.fxml", "Group View", new Stage());
    }
}
