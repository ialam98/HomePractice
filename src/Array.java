public class Array {
    public static void main(String[] args) {

        int [] nums = {9,6,3,2,5,4,9};
        System.out.println(nums[1]);

        int sum = 0;
        for (int i = 0; i< nums.length; i++) {
            sum = sum + nums[i];
            System.out.println(nums[i]);
        }
        System.out.println(sum);

    }
}
