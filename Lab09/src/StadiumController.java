

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
    //#Fields:
    //create a stadium field instance.
    private Stadium stadium = new Stadium();
    
    //declare an FXML sellBtn   
    @FXML private Button sellBtn;
    
    //declare an FXML amountTf    
    @FXML private TextField amountTf;
        
    //define a constant get method to return stadium.   
    public final Stadium getStadium(){return stadium;}
    
    //define a constant get method to return amountTf parsed amount.
    private final int getAmount(){return Integer.parseInt(amountTf.getText());}
    //define a constant set that takes an integer amount method to modify amountTf .    
    private final void setAmount(int value){amountTf.setText(""+value);}
    //define an FXML initialize method 
    //- this method load FXML components after an instance is created.
    @FXML private void initialize(){
        amountTf.textProperty().addListener((event,oldTxt,newTxt) -> sellBtn.setDisable(!newTxt.matches("^0*(?:[1-9][0-9]?|300)$")));
    }
    
    //define an FXML handleSell method that captures ActionEvents
    //-create a group instance using getStadium()
    //-create local integer amount from getAmount()
    //-test if a group can sell an amount
    //-reset amount sold to zero
    @FXML private void handleSell(ActionEvent event){
        Group g = getStadium().getGroup();
        int amount = getAmount();
        if(g.canSell(amount))
            g.sell(amount);
        setAmount(0);
    }
    
}
