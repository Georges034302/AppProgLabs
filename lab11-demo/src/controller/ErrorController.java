/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 *
 * @author george
 */
public class ErrorController extends Controller<Exception> {

    public final Exception getException() {
        return model;
    }

    @FXML
    private void handleOK(ActionEvent event) {
        stage.close();
    }
}
