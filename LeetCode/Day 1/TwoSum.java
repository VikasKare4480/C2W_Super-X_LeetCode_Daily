
import java.util.*;
public class TwoSum {


    static int[] twoSum(int[] nums, int target) {

        int[] ret = new int[2];
    
        for(int i = 0; i < nums.length; i++) {


            for(int j = 0; j < nums.length; j++) {

                if(i == j) {
                    continue;
                }
                if(nums[i] + nums[j] == target) {
                    
                    ret[0] = j;
                    ret[1] = i;
                }
            }
        }

        return ret;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i = 0; i < nums.length; i++) {

            System.out.print("Enter " + (i + 1)  + " element : ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the taget sum : ");
        int target = sc.nextInt();

         int[] arr = twoSum(nums, target);

         for(int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
         }
        
    }
}
