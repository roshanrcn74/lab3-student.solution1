/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 * @author roshann
 * this class handle the read message from reader 
 * this class handle the write message to writer
 */
public class MessageExchangeCenter {
    private MessageReader messageReader;
    private MessageWriter messageWriter;

    public MessageExchangeCenter(MessageReader reader, MessageWriter writer) {
        setReadMessage(reader);
        setWriteMessage(writer);
    }
    
    //out put the message of type of writer
    public final void sendMessage(){
        messageWriter.doWrite(messageReader.readMessage());
    }
    
    public void setReadMessage(MessageReader messageReader) {
        if (messageReader == null){
            throw new IllegalArgumentException("Null object not accept,"
                    + " please instanciate your object");
        }
        this.messageReader = messageReader;
    }

    public void setWriteMessage(MessageWriter messageWriter){
        if (messageWriter == null){
            throw new IllegalArgumentException("Null object not accept,"
                    + " please instanciate your object");
        }
        this.messageWriter = messageWriter;
    }  
}
