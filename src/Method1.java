public class Method1 {
    public static void main(String[] args) {


//        int[] nums1 = {2, 6, 9, 8, 2, 3, 6, 2, 2};
//
//        int count10 = 0;
//
//        for (int i = 0; i< nums1.length-1; i++) {
//            if (nums1[i] == 2 && nums1[i+1] == 2) {
//                count10++;
//            }
//        }
//        System.out.println(count10);



        addSum(16);
        largeNum(51,69);
        int lnum= largernum(56,96);

        int xnum = 100;
        System.out.println(xnum-lnum);


    }


    public static void addSum (int num1) {
        int multiply = num1 * num1;
        System.out.println( multiply);

    }

    public static void largeNum(int num1, int num2) {

        if (num1>num2) {
            System.out.println(num1 + " is the larger number");
        } else {
            System.out.println(num2 + " is the larger number");
        }

    }

    public static int largernum (int num1 , int num2) {
        if (num1>num2) {
            return num1;
        } else {
           return num2;
        }

    }
}
