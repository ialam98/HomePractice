public class if_else {
    public static void main(String[] args) {

        int num1 = 9;
        int num2 = 5;
        int num3 = 10;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }




//        if the value is within 90-100 it will print  grade a
//        80-89 print B
//        70-79 print c
//        60-69 print D
//                else print F


        int grade = 63;

        if (grade>=90 && grade<=100) {
            System.out.println("Grade A");
        } else if (grade>=80 && grade<=89) {
            System.out.println("Grade B");
        } else if (grade>=70 && grade<=79) {
            System.out.println("Grade C");
        } else if (grade>=60 && grade<=69) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

        int x = 30;
        int y = 55;
        int z = 50;

        if (x >y || x>z) {
            System.out.println( "jingalala");
        } else if (y>x || y>z) {
            System.out.println("Ujala");
        } else {
            System.out.println("POla");
        }



        //if the salary is more than 10000 print "higher salary" else print "lower salary"
        // salary can not be more than 50000 and less than 3000


        int sal = 2000;

        if (sal < 50000 && sal > 3000) {
            if (sal > 10000) {
                System.out.println("Higher Salary");
            } else {
                System.out.println("Low Salary");
            }
        } else {
            System.out.println("Invalid Salary");
        }
    }
}
