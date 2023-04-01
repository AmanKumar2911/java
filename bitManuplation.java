import java.util.Scanner;

public class bitManuplation {
    public static void main(String[] args) {
        /*
         * Question
         * 
         * 1. You are given a number n.
         * 2. print the number produced on setting its i-th bit.
         * 3. print the number produced on unsetting its j-th bit.
         * 4. print the number produced on toggling its k-th bit.
         * 5. Also , check if its m-th bit is on or off. print 'true' if it is on ,
         * otherwise print 'false'.
         * 
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();

        // write your code here

        int onmask = (1 << i);
        int offmask = ~(1 << j);
        int tmask = (1 << k);
        int cmask = (1 << m);

        System.out.println(n | onmask);
        System.out.println(n & offmask);
        System.out.println(n ^ tmask);
        System.out.println((n & cmask) == 0 ? false : true);

    }
}