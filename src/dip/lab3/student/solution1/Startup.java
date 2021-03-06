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
public class Startup {
    public static void main(String[] args) {
        //instantiate new keyboard reader 
        MessageReader keyboardReader = new KeyboardReader();
        //instantiate  console writer
        //MessageWriter consoleWriter = new ConsoleWriter();
        
        //instantiate new GUI writer
        MessageWriter guiWriter = new GUIWriter();
        
        //MessageReader guiReader = new GUIReader();
        
        //MessageWriter arrayWriter = new ArrayWriter();
        
        //instantiate new array list
        List<String>  arrayList = new ArrayList();
        arrayList.add("Good Morning");
        arrayList.add("Good Evening");
        arrayList.add("Happy Valentine");
        arrayList.add("Merry X'Max");
        arrayList.add("Happy New Year");
        arrayList.add("Happy B'day !!!");
     
        //instantiate new array reader 
        //ArrayReader arrayReader = new ArrayReader(arrayList);
        
        //instantiate message handler with array reader and gui writer
        
        MessageReader fileReader = new FileReader();
        
        MessageExchangeCenter messageHandler = new MessageExchangeCenter(fileReader, guiWriter);
        messageHandler.sendMessage();
        
//        //instantiate message handler with array reader and console writer
//        MessageHandler messageHandler1 = new MessageHandler(guiReader, consoleWriter);
//        messageHandler1.readAndWriteMessage();
//        
//        //instantiate message handler with keyboard reader and gui writer
//        MessageHandler messageHandler2 = new MessageHandler(keyboardReader, guiWriter);
//        messageHandler2.readAndWriteMessage();
//        
//        //instantiate message handler with keyboard reader and console writer
//        MessageHandler messageHandler3 = new MessageHandler(arrayReader, arrayWriter);
//        messageHandler3.readAndWriteMessage();
//        System.out.println("Message written to Array List :" + arrayWriter.getMessage());
    }    
}
