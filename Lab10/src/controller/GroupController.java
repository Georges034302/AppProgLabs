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
    private Group group = new Group("front", 300, 400.0);

    @FXML private Button sellBtn;
    @FXML private TextField amountTf;

    public final Group getGroup() { return model; }
    private final int getAmount() { return Integer.parseInt(amountTf.getText()); }
    private final void setAmount(int amount) { amountTf.setText(""+amount); }

    
    @FXML private void initialize() {
        amountTf.textProperty().addListener((o, oldTxt, newTxt) ->
                sellBtn.setDisable(!newTxt.matches("[1-9]{1,3}")));      
    }
    
    @FXML private void handleSell(ActionEvent event) {
        int amount = getAmount();
        if (getGroup().canSell(amount))
            getGroup().sell(amount);
        setAmount(0);
    }
}
