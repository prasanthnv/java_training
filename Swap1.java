package java_training;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Swap1 {
    // swapping 2 numbers with out introducing a new variable
     public static void main(String[] args) {
        // crating variables
        int a = 5;
        int b = 6;
        
        //print before swap
        System.out.println("Before Swapping");
        System.out.println("A = " + a + " and B = " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After Swapping");
        System.out.println("A = " + a + " and B = " + b);
    }
}
