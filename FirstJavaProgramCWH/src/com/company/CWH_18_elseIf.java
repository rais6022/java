package com.company;
import java.util.Scanner;
public class CWH_18_elseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");

        String  var = "Shubham";

        switch (var){
            case "Shubham":
                System.out.println("You are going to become an adult!");
                break;
            case "lucky":
                System.out.println("You are going to join job!");
                break;
            case "Andy":
                System.out.println("You are going to retired!");
                break;
            default:
                System.out.println("Enjoy you life!");
        }
        System.out.println("Thanks fot using my java code");





//        int age;
//        age = sc.nextInt();
//        switch (age){
//            case 18:
//                System.out.println("You are going to become an adult!");
//                break;
//            case 23:
//                System.out.println("You are going to join job!");
//                break;
//            case 60:
//                System.out.println("You are going to retired!");
//                break;
//            default:
//                System.out.println("Enjoy you life!");
//        }
//        System.out.println("Thanks fot using my java code");






        /*
        int age;
        age = sc.nextInt();
        if (age>56){
            System.out.println("you are experienced!");
        }
        else if (age>46){
            System.out.println("you are semi-experienced!");
        }
        else if(age>36){
            System.out.println("you are semi-semi-experienced");
        }
        else {
            System.out.println("you are not experienced");
        }
*/

    }
}
