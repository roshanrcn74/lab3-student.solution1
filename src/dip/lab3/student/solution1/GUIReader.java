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
public class GUIReader implements MessageReader{
    
    @Override
    public String readMessage() {
        String response = JOptionPane.showInputDialog(null, "Please enter message here : ");
        return validateMessage(response);
    }

    @Override
    public String validateMessage(String message) {
        if (message == null || message.trim().length() == 0 ){
            throw new IllegalArgumentException("Please enter valid message ");             
        }
        return message;       
    }
}
