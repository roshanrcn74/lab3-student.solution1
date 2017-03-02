/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 * @author roshann
 * this class read the message from keyboard and store in message variable
 */
public class KeyboardReader implements MessageReader {

    /**
     * @param message
     * this method set the message as per constrain
     * @return 
     */
    @Override
    public final String validateMessage(String message) {
        if (message == null || message.trim().length() <= 0 ){
            throw new IllegalArgumentException("Empty message not accepted , Please key enter the message");
        }
        return message;
    }
    /**
     * @return
     * this method key input the message
     */
    @Override
    public final String readMessage() {
        Scanner inputMessage = new Scanner(System.in);
        System.out.print("Please enter the message :");  
        return validateMessage(inputMessage.nextLine());
    }
}
