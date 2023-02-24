import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[]arr=new int[8];
        arr[0]=4;arr[1]=3;arr[2]=2;arr[3]=7;arr[4]=8;arr[5]=2;arr[6]=3;arr[7]=1;
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.println(i+1);
            }
        }

    }
    static void cyclic(int[]arr){
        int i=0;
        while(i<arr.length){
           int correct=arr[i]-1;
           if(arr[i]!=arr[correct]){
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
