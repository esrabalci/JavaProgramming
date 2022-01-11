package day24_CustomMethods;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("cydeo", "school"); //

        System.out.println("----------------------------");

        domain("Cydeo.School@amazon.com");

        System.out.println("-----------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            domain(email);
        }

        System.out.println("-----------------------------");

        nameOfMonth(11);

        System.out.println("--------------------------");

        nameOfDay(5);

        System.out.println("---------------------------");

        daysInMonth(5);

        System.out.println("----------------------------");

        ageGroups(30);


    }

    //1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);


    }


    //2. Create a method that can display the domain of the email.  domain(String email)
    public static void domain(String email) { // Cydeo.School@gmail.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){  // 95

        String name = "";

        if(number >= 1 && number <= 12){

            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";

        }else{
            name = "Invalid";
        }

        System.out.println("Month name = " + name);

    }


    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        String nameOfDays="";

        if (number>=1&& number<=7){

           nameOfDays=(number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday"
                   :(number==4)?"Thursday":(number==5)?"Friday":(number==6)?"Saturday":"Sunday";


        }else{
            nameOfDays="Inavalid";
        }

        System.out.println("Name of day is: "+nameOfDays);

    }

    //5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){

        String dayInMonth="";

        if(number >= 1 && number <= 12){ // number: 1~12
            switch (number){
                case 2:
                    dayInMonth = "29 days";
                    break;

                case 4: case 6: case 9: case 11:
                    dayInMonth = "30 days";
                    break;

                default: //1, 3, 5,7,8, 10, 12
                    dayInMonth = "31 days";
            }



        }else{
            dayInMonth= "Invalid days";
        }


        System.out.println("dayInMonth = " + dayInMonth);

    }


    public static void ageGroups(int age){// ageGroups(int age)

        String ageResult="";

        if (age<=0 && age>=150) {

            ageResult =  (age >= 1 ) ? "infant" : (age >= 3 ) ? "toddler" : (age >= 6 ) ? "kid" :
            (age >= 10 ) ? "pre-teen" : (age >= 13) ? "teenager" : (age >= 18) ? "young adult" :
            (age >= 21 ) ? "adult" : (age >= 40 ) ? "Young Middle-Aged Adult":(age >= 50 ) ?
            "Middle-Aged Adult":(age >= 55 ) ?"Very Young Senior Citizen":(age >= 65 ) ?"Young Senior Citizen":
            (age >= 65 ) ?"Young Senior Citizen":(age >= 75 ) ?"Senior citizen":"Old Senior Citizen";


        }else{
          ageResult  ="Invalid age";
        }


        System.out.println("ageResult = " + ageResult);






    }



}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
                        */

