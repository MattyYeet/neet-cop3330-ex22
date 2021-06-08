/*
 *  UCF COP3330 Summer 2021 Assignment 22 Solution
 *  Copyright 2021 Matthew Neet
 */
package reee;

import java.util.Scanner;

public class example22 {
    public static void main(String[] args) {
        int a, b, c, d = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = input.nextInt();
        System.out.print("Enter the second number: ");
        b = input.nextInt();
        System.out.print("Enter the third number: ");
        c = input.nextInt();
        if(d < a)
        {
            d = a;
        }
        if(d < b)
        {
            d = b;
        }
        if(d < c)
        {
            d = c;
        }
        System.out.println("The largest number is "+d+".");
    }
}
