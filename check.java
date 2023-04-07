import java.util.Arrays;

public class check {
    public static void main(String[] args) {
        int arr[]={1,1,0};
        for(int i =0 ;i < arr.length;i++){
            int s=0;
            int e=arr.length-1;
            while(s<e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
