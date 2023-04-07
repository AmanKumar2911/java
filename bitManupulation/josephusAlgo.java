package bitManupulation;
import java.util.Scanner;

public class josephusAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value n : ");
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    public static int powerof2(int n){
        int i = 1;
        while(i*2 <=n ){
            i = i*2;
        }
        return i;
    }
    public static int solution(int n){
        int hp2 = powerof2(n);
        int l = n - hp2 ;
        return 2 * l + 1;
    }

}
