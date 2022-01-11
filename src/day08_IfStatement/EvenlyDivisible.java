package day08_IfStatement;

public class EvenlyDivisible {


    public static void main(String[] args) {

        int number = 65;

        boolean isdivisibleby2 = number % 2 == 0; // if the remainder of a number divided by 2 is zero, then it's eventually

        boolean isdivisibleby3 = number % 3 == 0 ;

        boolean isivisibleby5 = number % 5 == 0 ;


        System.out.println(number + " is divisible by 2 : " + isdivisibleby2);
        System.out.println(number + " is divisible by 3 : " + isdivisibleby3);
        System.out.println(number + " is divisible by 5 : " + isivisibleby5);

        System.out.println("------------------------------");

        int year = 2000;

        boolean isLeapYear = year % 4 == 0;
        System.out.println(year+" is leap year: " +isLeapYear);










    }
}
/*
2. Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
 */