import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr={4,1,9,2,3,6};
        Insertionsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Insertionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }

            }
        }
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}