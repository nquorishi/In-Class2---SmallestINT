/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.smallestinteger;

import java.util.Scanner;

/**
 *
 * @author Naweed
 */
public class SmallestInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        // INPUT:
        System.out.print("Enter the number of integers: ");
        int numInts = input.nextInt();
        
        // DECLARATION:
        int smallest = Integer.MAX_VALUE;
        int currentNum;
        
        // FOR LOOP:
        // Loops for the ammount of numbers chosen by the user.
        for (int i = 0; i < numInts; i++) {
            System.out.print("Enter an integer: ");
            currentNum = input.nextInt();
            if (currentNum < smallest) {
                smallest = currentNum;
            }
        }
        
        // OUTPUT:
        System.out.println("The smallest integer is the number: " + smallest);
    }
}
