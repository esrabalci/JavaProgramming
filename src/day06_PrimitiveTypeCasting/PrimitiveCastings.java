package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {

    public static void main(String[] args) {


        byte a = 100;
        short b = a;
        //short b = (short)a;
        //         (short)a

        int c = (int) b; // implicit costing
        // int c = (int)b

        long d = c;
        //       (long)c

        float e = d;
        double f = e;

        System.out.println("-------------------");


        int x = 55;
        short y = (short) x; // explicit casting

        System.out.println(x + " : " + y);


        long j = 1000000;
        short k = (short) j;

        System.out.println(j + " : " + k);



        double l = 2.5;
        float m = (float)l;

        System.out.println(l + ":" +m);


        double n = 10.8;    // int is not gonna take 10.8 because its not range of the integer
        int s = (int)n;

        System.out.println(n + ":" +s);  // it takes 10 because of the integer number

        /*
        explicit casting for short cut is hold OPTION buttom and hit to enter
        choose the short cut is version of the range

         */

         double d1 = 20.5; // short is not ganna take 20.5 because of the range of short
         short s1 = (short) d1;  // its take 20 because of the short range

        System.out.println(d1 + ":" +s1);



        float f1 = 30.05f;
        long l1 = (long) f1;

        System.out.println(f1 + ":" +l1);


    }






















    }


