package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] myGroup= new String[5];//["Gunay," "Neira," "Suat,"  "Hulya,"  "Mikael"
        //it can contain only 5 person 0~4

        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";






        //System.out.println(myGroup);//hashcode,it'll give Null when you print
        System.out.println(Arrays.toString(myGroup));//5times print of null
        //null is default value that means no object










    }
}
//create a variable that's capable enough to contain 5 names