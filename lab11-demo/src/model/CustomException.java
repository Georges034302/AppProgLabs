/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author george
 */
public class CustomException extends Exception{
    public CustomException(String error){
        super(error);
    }
}
