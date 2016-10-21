/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriaf.poo.structs;

/**
 *
 * @author student
 */
public class PrivateMessage extends Message {

    private final String destination;

    @Override
    public String toString() {
        return "(priv) " + super.toString();
    }

    public PrivateMessage(String destination, String sender, String content) {

        super(sender, content);
        this.destination = destination;

    }

    public String getRecipient() {
        return destination;
    }
}
