import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={12,34,23,45,67,43,67,87,978,34,57,32,11};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] reverse(int[] arr){
        int start=0;
        int end=arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

        }

        return arr;
    }

}

