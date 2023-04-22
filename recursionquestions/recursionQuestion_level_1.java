package recursionquestions;

public class recursionQuestion_level_1 {
    public static void main(String[] args) {
        // funct1(5);
        // funct2(5);
        // funct3(5);
        // System.out.println(factorial(5));
        // System.out.println(sum(5));
        // System.out.println(sumOfDigits(55));
        // System.out.println(productOfDigits(525));
        // System.out.println(countZeros(34050));
        System.out.println(numberOfSteps(14));
        
    }

    // question1 print 5 to 1 with help of recursion.
    static void funct1(int n) {
        System.out.println(n);
        if (n == 1) {
            return;
        }
        funct1(n - 1);

    }
    // question2 print 1 to 5 with help of recursion.
    static void funct2(int n) {
        if (n == 0) {
            return;
        }
        funct2(n - 1);
        System.out.println(n);

    }
    // question3 print 5 to 1 and 1 to 5 with help of recursion.
    static void funct3(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        funct3(n - 1);
        System.out.print(n+" ");
    
    }
    // question4 find factorial of n
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }

    // question5 find sum of n numbers via recursion.
    static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n + sum(n-1);
    }
    // question6 sum 'of the digits' like n=4578    ans = 4+5+7+8= 24
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
    // question7 product 'of the digits' like n=4578    ans = 4+5+7+8= 24
    static int productOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return n%10 * productOfDigits(n/10);
    }
    // question8 count zeros in number.

    //
    static int countZeros(int n){
        return helper(n, 0);
    }
    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem =n%10;
        if(rem==0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }

    //


    // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

    static int numberOfSteps(int n){
        return help(n,0);
    }
    private static int help(int num,int steps){
        if(num==0){
            return steps;
        }
        if((num & 1) == 1){
            return help(num-1, steps+1);
        }
        else{
            return help(num/2, steps+1);
        }
    }
}
