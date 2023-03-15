package com.company;
import java.util.Scanner;
import java.util.Locale;

public class CWH_Ch3_PS {
    public static void main(String[] args) {
        // Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase(Locale.ROOT);
        System.out.println(name);

        // Problem 2
        String text = "To My Friend ";
        text = text.replace(" " , "_");
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|> , Thanks a lot!";
        letter = letter.replace("<|name|>" , "Rais");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contais   double and   triple spaces ";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String letter2 = "Dear Harry, \n\tThis Java Course is Nice.\n Thanks!";
        System.out.println(letter2);





    }
}
