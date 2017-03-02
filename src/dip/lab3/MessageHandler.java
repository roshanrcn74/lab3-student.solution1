/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 * @author roshann
 * this class handle the read message from reader 
 * this class handle the write message to writer
 */
public class MessageHandler {
    private final Reader readMessage;
    private final Writer writeMessage;

    public MessageHandler(Reader reader, Writer writer) {
        this.readMessage = reader;
        this.writeMessage = writer;
    }
    
    // read the message from type of reader 
    public String readMessage(){
        readMessage.setMessage(readMessage.readMessage());
        return readMessage.getMessage();
        
    }
    
    //out put the message of type of writer
    public void writeMessage(){
        writeMessage.writer(readMessage.getMessage());
    }
    
    // first read the message from perticular readr and write message from relavent writer
    public void readWriteMessage(){
        readMessage();
        writeMessage();
        
    }
    
}
