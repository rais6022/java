package com.company;

public class CWH_08_Operators {
    public static void main(String[] args) {
        // arithmetic operator
        int a = 2;    // same here = assigns the value 2 in the a ya phir 2 ko store kar do in the a
        //int b = 6+a;  // for assignment operator = is assigns the value 6 + a in the b


        int c = 6% a ;  // % ko hum modulo operator kehte hai yeh reminder ko show karne k kaam aata hai
        //4.8%1.1 ----> Returns the Decimal Remainder

        // Assignment operators
        int b = 9;
        b += 1; //  '+=' k matlab hota hai k 'b' k ander 1 jod do and same rule for the every operator like +-*/ etc

        // Comparison operator
        System.out.println(6==8);  // '=' is a assignment operator but == is a comparison operator this checks the value whether it is true or false
        System.out.println(6>9); // like these all are the same as comparison operator

        //logical operators
        System.out.println(64>5 && 64>8); // this 'and' operator is evaluates the true value only if all condition evaluates true if one of them is false then the whole condition/statement is false
        System.out.println(64>5 || 64>8); // this 'or' operator is evaluates the true value if one of them are satisfies the condition if the don't then the false is evaluates



    }
}
