package src;

public class FirstArray {
    public static void main(String[] args) {
        int[] daysInMoths = new int[12];
        daysInMoths[0] = 31;
        daysInMoths[1] = 28;
        daysInMoths[2] = 31;
        daysInMoths[3] = 30;
        daysInMoths[4] = 31;
        daysInMoths[5] = 30;
        daysInMoths[6] = 31;
        daysInMoths[7] = 31;
        daysInMoths[8] = 30;
        daysInMoths[9] = 31;
        daysInMoths[10] = 30;
        daysInMoths[11] = 31;

//        int march = daysInMoths[2];
//        System.out.println(march);

//        for (int i = 0; i < 12; i++) {
//            System.out.println(daysInMoths[i]);
//        }

        for (int i = 0; i < daysInMoths.length; i++) {
            System.out.println(daysInMoths[i]);
        }

        int[] nums = new int[100];
//
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 10;
        }
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

//        for (int i : nums) {
//            System.out.println(i);
//        }

        char[] chars = new char[10];
        for (char ch : chars){
            System.out.println(ch);
        }
    }
}
