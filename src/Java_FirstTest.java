public class Java_FirstTest {
    public static void main(String[] args) {


//        Scanner scanN = new Scanner(System.in);
//
//        System.out.println("input value of n: ");
//        int n = scanN.nextInt();
//
//        for (int i = 0; i <=n; i++) {
//            if (i%2 ==1) {
//                System.out.println(i);
//            }
//        }


//            Scanner total = new Scanner(System.in);
//
//            System.out.println("How many odd number you want to see? ");
//            int totalodd = total.nextInt();
//
//            long till = 0;
//            int count = 0;
//
//            if (totalodd > 50) {
//                till = 1000000000;
//            } else till = 100000000;
//
//            for ( int i = 0; i <= till; i++) {
//                if (i % 2 == 1) {
//                    System.out.println(i);
//                    count++;
//                }
//                if (count == totalodd)
//                    break;
//            }


//            Scanner newscan = new Scanner(System.in);
//            System.out.println("How many odd? ");
//
//            int totalOdd = newscan.nextInt();
//            int i = 0;
//            int count2 = 0;
//
//
//            do {
//                if (i%2 == 1) {
//                    System.out.println(i);
//                    count2++;
//                } i++;
//            } while (count2 != totalOdd) ;


//        int[] nums = {2, 6, 9, 8, 2, 3, 6, 2, 2};
//            int i = 0;
//        int count3 = 0;

//          Q. How many 2 are there?

//            do {
//                if (nums[i] ==2 ) {
//                    count3++;
//                } i++;
//            } while (i< nums.length);
//            System.out.println(count3);

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 2) {
//                count3++;
//            }
//        }
//        System.out.println(count3);



        int[] nums1 = {2, 6, 9, 8, 2, 3, 11, 2, 2};

        int p = 0;
        int countx = 0;

        do {
            if (nums1[p] ==2 && nums1[p+1] ==2) {

            } countx++;
            p++;
        } while (p < nums1.length); {
            System.out.println(countx);
        }

    }

}






