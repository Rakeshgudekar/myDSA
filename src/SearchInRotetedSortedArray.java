public class SearchInRotetedSortedArray {
    public static void main(String[] args) {
        int[] arr={8,9,10,1,2,3,4,5,6,7};
        int target=1;
        int ans= search(arr,target,0,arr.length-1);
        System.out.println(ans);

    }
    static int search(int[] arr, int target, int start,int end){
        int mid;
        while(start<=end){
            mid=start+((end-start)/2);
            if(target==arr[mid]){
                return mid;
            }

            if(arr[mid]<=arr[end]){
                if(target > arr[mid] && target <= arr[end]){
                    start= mid+1;
                }else{
                    end=mid-1;
                }
            }
            else{
                if(arr[start]<= target  && target < arr[mid] ){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
