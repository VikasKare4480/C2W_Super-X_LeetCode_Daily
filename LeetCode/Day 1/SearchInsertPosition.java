

import java.util.Scanner;
public class SearchInsertPosition {
    

    static int searchInsert(int[] nums, int target) {

        int index = 0; 

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == target) {

                return i;

            }else if(nums[i] > target) {

                return i;

            }else if(i == nums.length - 1) {

                return nums.length;
            }
        }
        return -1;
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

        System.out.print("Enter the taget sum : ");
        int target = sc.nextInt();

        System.out.println("Insert index is : " + searchInsert(nums, target));

        

    }
}
