package com.company;
import java.util.Scanner;
public class CWH_13_Strings {
    public static void main(String[] args) {
        //String name = new String("Rais");
        //String name = "Rais";
        //System.out.print("The name is: ");
        //System.out.print(name);
        int a = 6;
        float b = 5.6454f;
//        System.out.printf("The value of a is %d and value of b is %f", a, b);  // %d,f,c,s are format specifiers
        System.out.format("The value of a is %d and value of b is %8.2f", a, b); // f se phele apn .2 laga de to ye sirf 2 decimal ko print karega or 8.2 laga de to ye 8 spaces lega or 2 decimal dikhayega
        Scanner sc = new Scanner (System.in);
//        String st = sc.next();
//        String st = sc.nextLine();
//        System.out.println(st);
    }
}
