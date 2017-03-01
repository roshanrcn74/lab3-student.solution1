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
public class FileReader implements Reader{
    private String message;

    @Override
    public String readMessage() {
        
        Scanner filePath = new Scanner(System.in);
        System.out.print("Enter file path :" + readFile(filePath.nextLine()));
        
        return this.message;
    }
    
    private String readFile(String filePath){
        String message = "";
        if(filePath != null && !filePath.isEmpty()){
            File file = new File("filePath");
        }
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        
        return this.message;
    }
    
}
