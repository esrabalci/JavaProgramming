package day09_IfStatements;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;

        boolean leapYear = year % 4 == 0; //leap year artik yil onun icin 4e bol

        if(leapYear){
            System.out.println("Year "+year+" is a leap year");
        }

        if(!leapYear){
            System.out.println("Year "+year+" is NOT a leap year");
        }


        System.out.println("-----------------------------------");

        if(leapYear){
            System.out.println("Year "+year+" is a leap year");
        }else{
            System.out.println("Year "+year+" is NOT a leap year");
        }



    }

}