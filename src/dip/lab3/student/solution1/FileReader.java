/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author roshann
 */
public class FileReader implements MessageReader{

    @Override
    public String readMessage() {
        
        Scanner filePath = new Scanner(System.in);
        System.out.print("Enter file path :");
        
        return readFile(filePath.nextLine());
    }
    
    private String readFile(String filePath){
        String message = "";
        if(filePath != null && !filePath.isEmpty()){
            File file = new File(filePath);
            try{
                try (Scanner inputFile = new Scanner(file)) {
                    while(inputFile.hasNext()){
                        message += inputFile.nextLine() + "\n";
                        
                    }
                    inputFile.close();
                }
            }
            catch(IOException e){
             e.getStackTrace();
            }
            
        }
        return validateMessage(message);
    }

    @Override
    public String validateMessage(String message) {
        if (message == null || message.isEmpty()){
            throw new IllegalArgumentException("Null or empty message not accepted,"
                    + "retry to valid message");
        }
        return message;
    }   
}
