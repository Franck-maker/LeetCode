import java.util.*;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
 * each unique element appears once. the relative order of the elements should be kept the same.
 *
 * If there are K elements after removing the duplicates. then the first k elements uof nums should hold the final
 * result, it does not matter what you leave beyond the first k elements
 */


public class removeDuplicate {

    public static int removeDuplicates(int [] nums){
        if(nums.length == 0){
            return 0;
        }

        int lastUniqueIndex = 0;
        for (int i =1; i <= nums.length-1; i++){
            if(nums[lastUniqueIndex] != nums[i]){
                nums[lastUniqueIndex + 1] = nums[i];
                lastUniqueIndex++;

            }
        }
        return lastUniqueIndex + 1;
    }
    public static void main(String [] args){
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates(nums);
        System.out.println("le nombre d'éléments unique du tableau est:" +length);
        System.out.println("Le tableau modifié est: ");
        for (int i =0; i< length; i++){
            System.out.print(nums[i] + " ");
        }

    }
}
