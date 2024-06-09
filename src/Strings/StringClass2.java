package Strings;

public class StringClass2 {
    public static void main(String[] args) {


        int num1 = 12;
        int num2 = 16;

        int num3 = (num1 > num2) ? num1 : num2;
        System.out.println(num3);

        String color1 = "White";
        String color2 = "Black";
        String num4 = "1212";

        System.out.println(10 + num4);

        printStringLength("eijhghethlkfpewthewtgb");

        totalcharCount("wkrjghfuoewrgh", 'e');

    }

    public static void printStringLength(String strng) {
        System.out.println("Length of the string is " + strng.length());

    }

    //Create a method which will take 2 param (String and Char)
    //print total number of character present in the string

//    String[] stn = {"uefgeytoguew5ghe5jtg"};
//    char chr = 'e';



    public static void totalcharCount(String stn, char chr) {

        int count = 0;
        for (int i = 0; i < stn.length(); i++) {
            if (stn.charAt(i) == chr)
                count++;
        }
        System.out.println("Total char count is "+ count);
    }



}



