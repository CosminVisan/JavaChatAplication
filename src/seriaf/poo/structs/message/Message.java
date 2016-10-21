/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriaf.poo.structs.message;

/**
 *
 * @author student
 */
public class Message {
    
    private final String content;
    private final String sender;
    
    public String toString(){
        return sender + ":" + content;
       
    }
    
    public Message(String content, String sender){
        this.content = content;
        this.sender = sender;
    }
}
