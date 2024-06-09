public class nestedLoop {
    public static void main(String[] args) {


        for (int i = 1; i <= 8; i++) {
            System.out.print("#");
            for (int j = 1; j <= 7; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = 1; i <= 8; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//        for (int i = 1; i<=8;i++ ) {
//            for (int j= 1; j<=8; j++) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }
    }
}

