package controller;

import model.Group;
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.beans.property.*;
import java.io.*;
import au.edu.uts.ap.javafx.*;

public class GroupController extends Controller<Group> {

    @FXML
    private Button sellBtn;
    @FXML
    private TextField amountTf;

    public final Group getGroup() {
        return model;
    }

    private final int getAmount() {
        return Integer.parseInt(amountTf.getText());
    }

    private final void setAmount(int amount) {
        amountTf.setText("" + amount);
    }
    
    @FXML private void initialize() {
         amountTf.textProperty().addListener((o, oldTxt, newTxt) ->
                sellBtn.setDisable(!newTxt.matches("^0*(?:[1-9][0-9]?|300)$")));      
    }
     
    @FXML
    private void handleSell(ActionEvent event) {
        int amount = getAmount();
        if (getGroup().canSell(amount)) {
            getGroup().sell(amount);
        }
        setAmount(0);
    }
}
