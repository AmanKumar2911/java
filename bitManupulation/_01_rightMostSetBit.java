package bitManupulation;

import java.util.Scanner;

public class _01_rightMostSetBit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // writing code .
        int rmsb=n & -n;   // because -n mean n's 2 compliment. we can also write like this n & (~n + 1)
        System.out.println(Integer.toBinaryString(rmsb));
        System.out.println(rmsb);
    }
}