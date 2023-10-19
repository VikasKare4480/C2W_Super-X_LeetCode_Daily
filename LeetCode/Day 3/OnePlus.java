

import java.util.*;

public class OnePlus {


    static int[] onePlus(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--) {

            if(digits[i] <  9) {
                
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
     
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i = 0; i < nums.length; i++) {

            System.out.print("Enter " + (i + 1)  + " element : ");
            nums[i] = sc.nextInt();
        }

        onePlus(nums);

        for(int i = 0; i < nums.length; i++) {

            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
