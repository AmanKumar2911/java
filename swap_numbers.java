import java.util.Arrays;

public class swap_numbers {
    public static void main(String[] args) {
        int[] arr={1,2};
        swap(arr);
    }
    static void swap(int[] arr){
        int temp=0;
        temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
