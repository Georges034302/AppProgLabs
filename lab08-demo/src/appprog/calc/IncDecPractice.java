package appprog.calc;

import javafx.application.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.layout.*;

public class IncDecPractice extends Application{

    public static void main(String[] args){
        launch(args);
    }
    
    private Label valueLbl;
    private TextField valueTf;
    private Button addBtn;
    private Button subBtn;
    private Button clear;
    
    @Override
    public void start(Stage stage) throws Exception {
        //create all components
        valueLbl = new Label("Value");
        valueTf = new TextField("0");
        addBtn = new Button("+");
        subBtn = new Button("-");
        clear = new Button("C");
        
        //set the layout
        HBox box = new HBox(10,valueLbl,valueTf,addBtn,subBtn,clear);
        box.setPadding(new Insets(10,10,10,10));
        
        addBtn.setOnAction(new ButtonHandler());        
        subBtn.setOnAction(new ButtonHandler());        
        clear.setOnAction(event->{setValue(0);});
        
        //set the scene and show the stage
        stage.setScene(new Scene(box));
        stage.setTitle("IncDec");
        stage.show();
    }
    private int getValue(){
        return Integer.parseInt(valueTf.getText());
    }
    private void setValue(int value){
        valueTf.setText(""+value);
    }
    
    private class ButtonHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Object obj = event.getSource();
            
            if(obj == subBtn){
                setValue(getValue()-1);
            }else if(obj == addBtn){
                setValue(getValue()+1);
            }
        }
        
    }
}