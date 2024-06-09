public class Method_2 {
    public static void main(String[] args) {


        int[] numbers = {4, 6, 7, 5, 3, 9, 12};
        int[] numbers2 = {2,5,9,3,5,9,6};

        int sum = getSum(numbers);
        System.out.println(sum);

       largeArnum(numbers,numbers2);


    }
    public static int getSum(int[] nums ){
        int i = 0;
        int sum = 0;

        do {
            sum = sum + nums[i];
            i++;
        } while (i < nums.length); {
            return (sum);
        }

    }

    //create a method which will take 2 int [] params
    //and print which array contain more numbers.

    public static void  largeArnum (int [] nums1, int [] nums2) {
        if (nums1.length > nums2.length) {
            System.out.println("first array is larger array");
        } else if (nums1.length < nums2.length) {
            System.out.println("2nd array is larger array");
        } else {
            System.out.println( "Equal");

        }

    }

}


