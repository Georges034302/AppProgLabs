package solution;

import java.net.URL;
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.beans.property.*;
import java.io.*;

public class StadiumController {
    private Stadium stadium = new Stadium();
    @FXML private Button sellBtn;
    @FXML private TextField amountTf;

    public final Stadium getStadium() { return stadium; }
    private final int getAmount() { return Integer.parseInt(amountTf.getText()); }
    private final void setAmount(int amount) { amountTf.setText(""+amount); }

    @FXML private void initialize() {
        amountTf.textProperty().addListener((o, oldTxt, newTxt) ->
                sellBtn.setDisable(!newTxt.matches("^0*(?:[1-9][0-9]?|300)$")));
    }

    @FXML private void handleSell(ActionEvent event) {
        Group group = getStadium().getGroup();
        int amount = getAmount();
        if (group.canSell(amount))
            group.sell(amount);
        setAmount(0);
    }
}
