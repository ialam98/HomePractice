import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; ) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Find Month");
            int month = scanner.nextInt();

            if (month <= 12 && month >= 1) {
                switch (month) {
                    case 1: {
                        System.out.println(month+" is the month of January");
                        break;
                    }
                    case 2: {
                        System.out.println(month+ " is the month of February");
                        break;
                    }
                    case 3: {
                        System.out.println(month+ " is the month of March");
                        break;

                    }
                    case 4: {
                        System.out.println(month+ " is the month of April");
                        break;

                    }
                    case 5: {
                        System.out.println(month+ " is the month of May");
                        break;
                    }
                    case 6: {
                        System.out.println(month+ " is the month of June");
                        break;
                    }
                    case 7: {
                        System.out.println(month+ " is the month of July");
                        break;
                    }
                    case 8: {
                        System.out.println(month+ " is the month of August");
                        break;
                    }
                    case 9: {
                        System.out.println(month+ " is the month of September");
                        break;
                    }
                    case 10: {
                        System.out.println(month+ " is the month of October");
                        break;
                    }
                    case 11: {
                        System.out.println(month+ " is the month of November");
                        break;
                    }
                    case 12: {
                        System.out.println(month+ " is the month of December");
                        break;
                    }
                }
            } else {
                System.out.println(month+" is Invalid");
                break;
            }
        }
    }
}





