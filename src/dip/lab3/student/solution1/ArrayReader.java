/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.List;
import java.util.Random;

/**
 *
 * @author roshann
 */
public final class ArrayReader implements MessageReader
{
    private  List<String> arrayList;
    private String message = "";

public ArrayReader(List<String> arrayList) {
        setArrayList(arrayList);
    }
    
    /**
     *
     * @return
     */
    @Override
    public final String readMessage() {
        Random randomNum = new Random();
        int index = randomNum.nextInt(arrayList.size()) + 0;
        return validateMessage(arrayList.get(index));
    }

    @Override
    public final String validateMessage(String message) {
        if (message == null || message.trim().length() <= 0 ){
            throw new IllegalArgumentException("Empty message not accepted,"
                    + "retry to valid message");
        }
        return message;    
    }
    
    public final void setArrayList(List<String> arrayList) {
        if (arrayList.isEmpty()) {
           throw new IllegalArgumentException("Empty array list not  accepted,"
                   + " send valid array list"); 
        }
        this.arrayList = arrayList;
    }
}
