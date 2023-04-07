package bitManupulation;


import java.util.Scanner;

public class _02_kernighanAlgorithm {
    public static void main(String[] args) {
        // in this algo we check how many bits are on (1).
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // writing code.
        int counter=0;
        while(n != 0){
            int rmsb = n & -n;
            n -= rmsb;
            counter++;
        }
        System.out.println(counter);   
    }
}
