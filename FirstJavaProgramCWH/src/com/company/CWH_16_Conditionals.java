package com.company;
import java.util.Scanner;
public class CWH_16_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("What is your age: ");
//        int age = sc.nextInt();
        int age = 19;
        boolean cond = (age == 18);
        if (cond){
            System.out.println("Yes boy you can drive!");
        }
        else{
            System.out.println("No boy you cannot drive yet!");
        }

    }
}
