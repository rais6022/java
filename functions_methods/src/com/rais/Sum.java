package com.rais;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        sum();
        sum();
        sum();
        sum();

    }


    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

      /*

        access modifiers (we'll look in OOP) return_type  name (arguments) {
               // body
                return statement;
        }


     */

}
