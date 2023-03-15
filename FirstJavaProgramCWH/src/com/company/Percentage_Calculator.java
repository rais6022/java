package com.company;
import java.util.Scanner;
public class Percentage_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float total = 500;
        System.out.println("Enter the marks of given subjects which are as follows: ");
        System.out.println("Enter the marks of subject 1");
        float maths  = sc.nextFloat();
        System.out.println("Enter the marks of subject 2");
        float Phy  = sc.nextFloat();
        System.out.println("Enter the marks of subject 3");
        float chem  = sc.nextFloat();
        System.out.println("Enter the marks of subject 4");
        float hin  = sc.nextFloat();
        System.out.println("Enter the marks of subject 5");
        float english  = sc.nextFloat();
        float sum = maths + Phy + chem + hin + english ;
        float percentage = (sum/total)*100;
        System.out.print("The percentage is : ");
        System.out.print(percentage);


    }
}
