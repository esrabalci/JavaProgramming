package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1); // 121, concatenation because ""
        System.out.println(10 + 20); // 30 Addition
        System.out.println(100 - 50); // 50, Subtraction
        System.out.println(10 * 6);// 60 Multiplication



        System.out.println( 100 / 3 );//33
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);
        System.out.println( 10d/4 ); //2.5


        int a =100;
        double b = a/6; //16 is integer. integer is being double that will be 16.0
        System.out.println(b);
    //double b = 16;



        double c = a/6.0; // 16.6666
        System.out.println(c);

        double d = (double)a/6;  //16.6666
        System.out.println(d);


        System.out.println(1000);



    }

}
/*

+ : Addition
- : Subtract
* : Multiplication
/ : Divisions

      integer / integer ====> integer
      decimal/integer=====>decimal
      integer / decimal=====> decimal
      decimal/decimal=====>decimal


       in math:
       10/4 = 2.5
       100/3 = 33.333...

       in java: // because integer number we take 2
       10/4 =2
       10.0/4 = 2.5 // we can take because our one number has 10.0
       100/3 = 33


% : Remainder




 */