/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_training;

/**
 *
 * @author HP
 */
public class Swap {

    public static void main(String[] args) {
        // crating variables
        int a = 5;
        int b = 6;
        
        //print before swap
        System.out.println("Before Swapping");
        System.out.println("A = " + a + " and B = " + b);
        
        //crating variable c
        int c = a; // creating variable c and setting it as a
        
        a = b; // setting a as b
        b = c;// setting b as c
        
        System.out.println("After Swapping");
        System.out.println("A = " + a + " and B = " + b);
    }
}
