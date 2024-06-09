import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        for (int i = 1; i<=10 ;) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("You wanna start? ");
        System.out.println(" (Press 1 to start or 0 to Exit)");
        int yes = scanner.nextInt();
        int no = 0;

        if (yes>no && yes<2) {

            System.out.println("Enter number");
            double num1 = scanner.nextInt();
            System.out.println("Enter 2nd Number");
            double num2 = scanner.nextInt();

            if (num1 > num2) {
                System.out.println(num1 + " is the higher Number" + " & " + num2 + " is the lower number");
            } else {
                System.out.println(num2 + " is the higher Number" + " & " + num1 + " is the lower number");
            }
        } else {
            System.out.println("BYE BYE");
        }
        }




    }
}











