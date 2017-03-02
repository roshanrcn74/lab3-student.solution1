/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.ArrayList;

/**
 *
 * @author roshann
 */
public class Startup {
    public static void main(String[] args) {
        //instantiate new keyboard reader 
        Reader keyboardReader = new KeyboardReader();
        //instantiate  console writer
        Writer consoleWriter = new ConsoleWriter();
        
        //instantiate new GUI writer
        Writer guiWriter = new GUIWriter();
        
        //instantiate new array list
        ArrayList<String>  arrayList = new ArrayList();
        arrayList.add("Good Morning");
        arrayList.add("Good Evening");
        arrayList.add("Happy Valentine to You all");
        arrayList.add("Merry X'Max");
        arrayList.add("Happy New Year");
        arrayList.add("Happy B'day !!!");
     
        //instantiate new array reader 
        ArrayReader arrayReader = new ArrayReader(arrayList);
        
        //instantiate message handler with array reader and gui writer
        MessageHandler messageHandler = new MessageHandler(arrayReader, guiWriter);
        messageHandler.readWriteMessage();
        
        //instantiate message handler with array reader and console writer
        MessageHandler messageHandler1 = new MessageHandler(arrayReader, consoleWriter);
        messageHandler1.readWriteMessage();
        
        //instantiate message handler with keyboard reader and gui writer
        MessageHandler messageHandler2 = new MessageHandler(keyboardReader, guiWriter);
        messageHandler2.readWriteMessage();
        
        //instantiate message handler with keyboard reader and console writer
        MessageHandler messageHandler3 = new MessageHandler(keyboardReader, consoleWriter);
        messageHandler3.readWriteMessage();
    }    
}
