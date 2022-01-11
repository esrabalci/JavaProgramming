package day23_CustomMethods_Void;

public class CustomMethodWithParameters {

    public static void main(String[] args){

        oddOrEven(7);//method demands additional info to complete it task
        System.out.println("-------------");
        ageOfPerson(1991);






    }


    //create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){//call this method will assigned to value
     if (number % 2==0){
         System.out.println(number+ " is even number");
     }else{
         System.out.println(number+ " is odd number");
     }

    }

    //create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){

        int age=2021-birthYear;
        System.out.println("Your age is: "+age);


    }







}
