public class ContaionsDuplicate {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,7,7};
       boolean ans=isDuplicate(arr);
        System.out.println(ans);
    }

    //this method is time taking
    //time complexity is not good.
    //it is O(n^2) time complexity because of two for loops.
    //leetcode will not accept this solution.
    static boolean isDuplicate(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;

    }

}
