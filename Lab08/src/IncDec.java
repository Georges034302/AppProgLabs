
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author George
 */
public class IncDec extends Application{
    //Leafs declarations
    private Label label;
    private TextField field;
    private Button minus;
    private Button plus;
    private Button clear;


    @Override
    public void start(Stage stage) throws Exception {
        //Create the leafs
        label = new Label("Value");
        field = new TextField("0");
        minus = new Button("-");
        plus  = new Button("+");
        clear = new Button("C");
        
        //Create the branch and attach the leafs
        HBox box = new HBox(10,label,field,minus,plus,clear);
        
        //Activate the leafs (or components)
        plus.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                //add 1 to the current value
                setValue(getValue()+1);
            }        
        });
        
        minus.setOnAction(event -> setValue(getValue()-1));
        clear.setOnAction(new ButtonHandler());
        
        //set the scene and show the stage
        stage.setScene(new Scene(box));
        stage.setTitle("IncDec");
        stage.show();
    }    
    
    public int getValue(){
        return Integer.parseInt(field.getText());
    }
    
    public void setValue(int value){
        field.setText(""+value);
    }
    
    private class ButtonHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            setValue(0);
        }        
    }
}
