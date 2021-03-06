/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;


/**
 * @author roshann
 * This class write message to console
 */
public class ConsoleWriter implements MessageWriter{   
    /**
     * @param message
     * this method write a message to console
     */
    @Override
    public final void doWrite(String message) {
        if (message == null || message.trim().length() == 0){
            throw new IllegalArgumentException("This is not valid message, Please check");            
        }
        System.out.println("Message :" + message);    
    }

}
