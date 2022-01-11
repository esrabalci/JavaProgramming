package day05Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Ugur";
        String lastName = "Mamac";
        int age = 30;
        String jobTitle = " Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;


        String fullName = firstName + " " + lastName;


        // full name of the person is _____
        System.out.println("Full name of the person is " + fullName );

        //___ is __ years old

        System.out.println(fullName + " is " + 30 +" years old");

        // FullName is jobTitle, works at CompanyName, and fullName salary is salary

        System.out.println(fullName + " is " + jobTitle +", works at " + companyName
                +", and "+ fullName +"'s salary is $"+salary);System.out.println("full name is jobTitle " + jobTitle );


    }




}
