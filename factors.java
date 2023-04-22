import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        factors3(36);
    }

    // O(n)
    public static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    // O(sqrt(n))
    public static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " ");
                }

            }
        }
    }

    // sorted version of factors2
    public static void factors3(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" ");
                    arr.add(n/i);
                }
                
            }
        }
        for(int i = arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+ " ");
        }
    }

}