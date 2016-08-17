/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.timeduration;

/**
 *
 * @author mathilda
 */
public class BadBadValueException  extends Exception{
    
    public BadBadValueException(){
        System.out.println("Vous devrez donner une durée positive");
    }
    
}
