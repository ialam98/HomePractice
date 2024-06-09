import java.util.Scanner;

public class SxCanner {
    public static void main(String[] args) {


        int operator = 100;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input first number");
            double num1 = scanner.nextInt();

            System.out.println("input 1 for '+', 2 for '-', 3 for '*' and 4 for '/'");
            operator = scanner.nextInt();

            System.out.println("Input Second number");
            double num2 = scanner.nextInt();

            switch (operator) {
                case 1:
                    System.out.println(num1 + num2);
                   break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                default:
                    System.out.println("invalid");
            }
        } while ( operator != 5);

    }
}




