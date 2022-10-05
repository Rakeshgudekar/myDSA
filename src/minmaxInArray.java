public class minmaxInArray {

    public static void main(String[] args) {
      int[] arr={22,3,4,5,24,6,7,4,3,56,64,23,57,44};
      int maxans=searchmax(arr);
      int minans=searchmin(arr);
        System.out.println("max =  "+maxans+ " and min = " + minans );
    }

    static int searchmax(int[] arr){
        int max=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }



       return max;
    }

    static int searchmin(int[] arr ) {
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }

        return min;
    }



}
