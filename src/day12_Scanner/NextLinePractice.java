package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();//if you are change nextInt to nextLine, you need to add this one

        System.out.println("Enter your fullName:");
        String fullName = input.nextLine();


        System.out.println("Enter your GPA:");
        double gpa = input.nextDouble(); //3.5Enter

        input.nextLine();

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();


        System.out.println("age= "+ age);
        System.out.println("fullName= " +fullName);
        System.out.println("gpa= " +gpa);
        System.out.println("schoolName= " + schoolName);


        input.close();


        /*
        1.Ask the user to enter age(nextInt() )
        2.Ask the user to enter full name (nextLine() )
         */


    }

}
