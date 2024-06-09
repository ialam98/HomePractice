public class variables2 {
    public static void main(String[] args) {


        int i = 10;

        System.out.println(++i);

        System.out.println(i);


//       int myAge = 28;
//
//       System.out.println(++myAge);
//
//       System.out.println(myAge);
//
//        System.out.println(myAge++);
//
//        System.out.println(myAge);


        System.out.println(4%2);
        System.out.println(2024%4);


//        how to find odd or even number?

        int num = -80;

        if (num%2==0) {
            System.out.println(num+" is an even number");
        } else {
            System.out.println(num+" is an odd number");
        }

//     Write to program to tell if it is a positive number or negative number.

        i = 10;

        if (i>=0) {
            System.out.println(i+ " is a positive number");
        } else {
            System.out.println(i+ " is a negative number");
        }

//      Find out the week days name program

        int day = 5;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid entry");
        }


    }
}
