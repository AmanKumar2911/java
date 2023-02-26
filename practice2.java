import java.util.Arrays;

// https://leetcode.com/problems/first-missing-positive/

public class practice2 {
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i] < arr.length && arr[i]!=i){
                System.out.println(i);
            }
        }
        // System.out.println(arr.length);
    }
    static void cyclic(int[]arr){
        int i=0;
        while(i<arr.length){
           int correct=arr[i];
           if(arr[i]>0 && arr[i] < arr.length && arr[i]!=arr[correct]){
            swap(arr,i,correct);
           }
           else{
            i++;
           }
            
        }
    }
    static void swap(int[]arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
