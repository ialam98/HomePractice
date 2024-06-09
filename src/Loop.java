public class Loop {
    static int k = 007;

    public static void main(String[] args) {

        System.out.println(k);
        for (int i = 2; i <= 100; i = i + 3) {
            System.out.println(i);
        }

//        run a forloop which starts from 1 to 10. Show only even numbers

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//
//            if (i % 2 == 0) {
//                sum = sum + i;
//            }
//            System.out.println(sum);
//        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum+i;
            if (sum >= 3000) {
                break;
            }
        } System.out.println(sum);


        for (int i = 1; i<=5; i++) {
            System.out.print(i);
        }


    }
}





