/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author roshann
 */
public class GUIReader implements Reader{
    private String message;

    public GUIReader() {
        this.message = "";
    }
    
    @Override
    public String readMessage() {
        String response = JOptionPane.showInputDialog(null, "Please enter message here : ");
        return response;
    }

    @Override
    public void setMessage(String message) {
        if (message == null || message.trim().length() == 0 ){
            throw new IllegalArgumentException("Please enter valid message ");             
        }
        this.message = message;
        
    }

    @Override
    public String getMessage() {
        return this.message;
    }
    
}
