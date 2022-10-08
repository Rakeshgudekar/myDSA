import java.util.*;

public class ContainDuplicateOPT {
    public static void main(String[] args) {

    }

    //to optimse this problem we first sorted the array
    //then we remove inner(j) for loop

    static boolean search(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-1 ; i++) {

            if(nums[i]==nums[i+1]){
                return true;
            }


        }
        return false;
    }

}
