package com.company;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter no. 1 ");
//        float a = sc.nextFloat();
     //   int a = sc.nextInt();
//        System.out.println("Enter no. 2 ");
//        float b = sc.nextFloat();
      //  int b = sc.nextInt();
//        float sum = a +b;
     //   int sum = a + b;
//        System.out.print("The sum of these number's is: ");
//        System.out.print(sum);

//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

        String str = sc.nextLine();  // agar koi word read karna hai to hum sirf next lagayenge ya fir hume puri line read karni hai to hum uske aage line lagayenge
        System.out.println(str);



    }
}
