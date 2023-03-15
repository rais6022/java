package com.rais;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);


//        String fruit = in.next();

//        if (fruit.equals("mango")){
//            System.out.println("King of fruit");
//        }
//
//        if (fruit.equals("apple")) {
//            System.out.println("a sweet red fruit");
//        }

//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple": // we cannot put mango over here
//                System.out.println("A sweet red fruit");
//                break;  // if we remove break from here then the next one will also print
//            case "Orange":
//                System.out.println("Round fruit");
//                break;  // same case here as the above case
//            case "Grapes":
//                System.out.println("Small fruit");
//                break;
//            default:  // if we put default above then next will not print s
//                System.out.println("Please enter valid fruit");
//        }


//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter valid fruit");
//        }
        // there is a break condition after each and every thing above


//        int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println(" Nothing!");
//        }


//        int day = in.nextInt();
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }


        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}
