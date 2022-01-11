package day13_String;

public class StringMethod {
    public static void main(String[] args) {

        String word = "Cydeo"; //5 characters but we can have maximum numbers 4
         //index:      01234

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

/*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
 */

        System.out.println("--------------------------------");

        String s1 = "Batch 25 is the best banch";// 26 // how many total number of characters

        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

        //index total number -1 gives you last character of find last index number
        char lastChar = s1.charAt( totalChars - 1);// return you last character
        // or char lastChar = s1.charAt(s1.length() -1)
        System.out.println("lastChar = " + lastChar);//h

        System.out.println("---------------------------------");

        String str = "wooden spoon"; // it's immutuable
        //System.out.println(str);//wooden spoon
        str=str.toUpperCase();// "WOODEN SPOON"// you need to assigned it to new veriable

        System.out.println(str);//WOODEN SPOON

        System.out.println("----------------------");

        //Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
              sentence= sentence.toUpperCase();
        System.out.println(sentence);






    }
}
