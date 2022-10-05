public class Maximum_subArray {


    public static void main(String[] args) {
    int[] arr={1,2,-2,3,-5,3,4,-2,3};
    int ans=sum(arr);
        System.out.println(ans);
    }
    // kadane's algorithm
    //to find sum of maximum subArray
   static int sum(int[]arr){
        int sum=0;
        int max=arr[0];
       for (int i = 0; i < arr.length; i++) {
           sum+=arr[i];
           if(sum>max) max=sum;
           if(sum<0) sum=0;
       }
       return max;
   }

}
