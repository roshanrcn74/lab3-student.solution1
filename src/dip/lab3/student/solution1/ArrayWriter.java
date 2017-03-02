/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roshann
 */
public class ArrayWriter implements MessageWriter{
    private final List<String> arrayList;

    public ArrayWriter() {
        this.arrayList = new ArrayList();
    }
    
    @Override
    public void doWrite(String message) {
        if (message == null || message.trim().length() == 0){
            throw new IllegalArgumentException("This is not valid message");            
        }
        this.arrayList.add(message);       
    }   
}
