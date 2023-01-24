import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        // selection sort works on 0 to n numbers of array.
        int[] arr={1,5,4,3,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr){
       for(int i=0;i<arr.length;i++){
        //Find the max item in the remaining array and swap with correct index
        int last = arr.length-i-1;
        int max_index = getmaxindex(arr,0,last);
        getswap(arr,max_index , last);

       }
    }
    static int getmaxindex(int[] arr, int start, int last) {
        int max = start;
        for(int i=start;i<=last;i++){
            if(arr[i]>arr[max]){
                max=i;
            }

        }
        return max;
    }
    static void getswap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
  
}
