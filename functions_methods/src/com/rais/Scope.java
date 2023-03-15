package com.rais;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Rais";
//        System.out.println(num);
        {
//            int a = 78;  // already initialised outside the block in the same method, hence cannot initialise it again
            a = 100; // reassign the ref variable to some other value
            System.out.println(a);
            int c = 99;
            // values that are initialised in this block that remain in block
            name = "Rahul";
            System.out.println(name);
        }
        System.out.println(a); // now it will print 100 only
       // System.out.println(c);  // cannot use outside the block
        System.out.println(name);

//        scoping in for loop
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            //int a = 10;
        }
        //System.out.println(i); // i can't access the for loop outside the loop
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);

    }
}
