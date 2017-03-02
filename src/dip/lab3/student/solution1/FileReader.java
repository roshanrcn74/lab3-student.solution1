/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author roshann
 */
public class FileReader implements MessageReader{
    private String message;

    @Override
    public String readMessage() {
        
        Scanner filePath = new Scanner(System.in);
        System.out.print("Enter file path :");
        
        return readFile(filePath.nextLine());
    }
    
    private String readFile(String filePath){
        String message = "";
        if(filePath != null && !filePath.isEmpty()){
            File file = new File("filePath");
            
        }
        return validateMessage(message);
    }

    @Override
    public String validateMessage(String message) {
        return message;
    }   
}
