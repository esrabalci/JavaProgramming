package practice_12_15_2021;

public class SwapTwoNumbers {


    public static void main(String[] args) {


        int a=10;
        int b=15;

        //swap means a=15, b=10.


      /*
        a=b;//a=15
        b=a;//b=15

       */

       int temp=a;
       a=b;//a=15
        b=temp;//b=10

        System.out.println("a:"+a);
        System.out.println("b:"+b);



    }
}
