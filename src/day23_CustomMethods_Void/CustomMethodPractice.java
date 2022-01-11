package day23_CustomMethods_Void;

public class CustomMethodPractice {

    public static void main(String [] args) {

        helloWorld5Times();
        System.out.println("--------------");
        helloCydeo5Times();
        System.out.println("--------------");
        evenNumbers();
    }

    //create a function that can print hello word 5 times==>helloWorld5Times()
    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }


    }

    //create a function that can print hello Cydeo word 5 times==>helloCydeo5Times()

     public static void helloCydeo5Times(){

         System.out.println("\nHello Cydeo ".repeat(5));

     }

     //create a function that can print all the even numbers from 1~10==>evenNumbers
    public static void evenNumbers(){

        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);

        }


    }





}