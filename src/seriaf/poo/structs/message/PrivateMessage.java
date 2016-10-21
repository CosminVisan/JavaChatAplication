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
public class PrivateMessage {
    private String sender;
    private String destination;
    private String content;
    
    @Override
     public String toString(){
         return sender + ":" + content;
     }
     public PrivateMessage(String sender, String destination, String content){
    
}
     public String getRecipient(){
        return destination;
     }
}
