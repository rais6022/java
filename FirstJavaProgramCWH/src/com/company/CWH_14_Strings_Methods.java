package com.company;

import java.util.Locale;

public class CWH_14_Strings_Methods {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println(name);

        // Method 1
        //int vlaue = name.length();
        //System.out.println(vlaue);

        // Method 2
        //String lstring = name.toLowerCase(Locale.ROOT);
        //System.out.println(lstring);

        // Method 3
        //String ustring = name.toUpperCase(Locale.ROOT);
        //System.out.println(ustring);

        // Method 4
        //String nonTrimmedString = "    Harry    ";
        //System.out.println(nonTrimmedString);
        //String trimmedString;
        //System.out.println(nonTrimmedString.trim());

        // Method 5
        //System.out.println(name.substring(1));

        // Method 6
        //System.out.println(name.substring(1,5));

        // Method 7
        //System.out.println(name.replace('r' ,'p'));
        //System.out.println(name.replace("rry" , "ier"));

        // Method 8
        //System.out.println(name.startsWith("har"));
        // Method 9
        //System.out.println(name.endsWith("rry"));

        // Method 10
        //System.out.println(name.charAt(2));

        // Method 11
        //System.out.println(name.indexOf("rr"));
        // Method 12
        //String modifiedName = "Harryrry";
        //System.out.println(modifiedName.indexOf("rry", 4));
        // Method 13
        //System.out.println(modifiedName.lastIndexOf("rry" ,4));

        // Method 14
        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("haRRy"));



        System.out.println("I am escape sequence character \" double quote");




    }
}
