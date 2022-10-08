import java.util.HashSet;

public class containsDuplicateHashset {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,8};
        boolean ans=search(arr);
        System.out.println(ans);

    }
    static boolean search(int[] arr){
        HashSet<Integer> myset= new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(myset.contains(arr[i])){
                return true;
            }else myset.add(arr[i]);
        }
        return false;
    }
}


