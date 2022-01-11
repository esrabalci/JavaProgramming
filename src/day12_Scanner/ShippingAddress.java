package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();//Java Programming


        System.out.println("Enter your building number:");
        String buildingNumber =scan.next(); //7925A

          scan.nextLine();

        System.out.println("Enter your street name:");
        String street = scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName= scan.nextLine();
        /*
        no need to change nextLine to next because we already used use
        nextLine before so we don't need to change again
         */

        System.out.println("Enter your state:");
        String state = scan.next();

        System.out.println("Enter your zipcode:");
        String zipCode = scan.next();

        System.out.println("fullName=" + fullName);
        System.out.println("buildingName=" + buildingNumber);
        System.out.println("street=" + street);
        System.out.println("cityName=" + cityName);
        System.out.println("state=" + state);
        System.out.println("zipCode=" + zipCode);


        scan.close();


    }
}
/*
1. Enter your full name( nextLine())
2.Enter your building number(next())
3.Enter your street name(nextLine())
4.Enter your city name(nextLine())
5.Enter your state(next())
6.Enter your zipcode(next())

Display the shipping address

 */