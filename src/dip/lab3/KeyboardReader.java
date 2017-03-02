/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 * @author roshann
 * this class read the message from keyboard and store in message variable
 */
public class KeyboardReader implements Reader {
    
    private String message;

    public KeyboardReader() {
        this.message = "";
    }  
    /**
     * @return
     *  this methods return the message
     */
    @Override
    public final String getMessage() {
       return this.message;
    }

    /**
     * @param message
     * this method set the message as per constrain
     */
    @Override
    public final void setMessage(String message) {
        if (message == null || message.trim().length() <= 0 ){
            throw new IllegalArgumentException("Empty message not accepted , Please key enter the message");
        }
        this.message = message;  
    }
    /**
     * @return
     * this method key input the message
     */
    @Override
    public final String readMessage() {
        Scanner inputMessage = new Scanner(System.in);
        System.out.print("Please enter the message :");  
        return inputMessage.nextLine();
    }


}
