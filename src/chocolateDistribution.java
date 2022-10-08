import java.util.Arrays;

public class chocolateDistribution {
    public static void main(String[] args) {
    int[] arr={16,3,4,6,90,43,44,65,78,49,2,};
    int ans=find(arr,arr.length,5); // m=minimum packets;
        System.out.println(ans);
    }
    static int find(int[] arr, int n, int m){
        int minDiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<=n-m;i++){
            int low=arr[i];
            int high= arr[i+m-1];
            int newdiff=high-low;
            if(newdiff<minDiff){
                minDiff=newdiff;
            }
        }
        return minDiff;
    }
}
