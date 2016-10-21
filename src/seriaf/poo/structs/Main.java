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
public class Main {
    
    public static void main(String[] args){
        Message m1;
        m1 = new Message("Alex", "Te salut!");
        
        PrivateMessage a1;
        a1 = new PrivateMessage("Alex", "Cosmin", "Salut!");
        
        System.out.printf("%s\n", m1);
        System.out.printf("%s\n", a1);
    }
}
