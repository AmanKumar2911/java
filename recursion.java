// public class recursion {
//     public static void main(String[] args) {
//         // write a function that prints hello world 5 times
//         // message();

//         // write a function that takes in a number and prints it
//         // print first 5 numbers: 1 2 3 4 5 

//         print1(1);
//     }
//     // static void message(){
//         // System.out.println("hello world");
//         // message1();
//         // // System.out.println("hello world");
//         // // System.out.println("hello world");
//         // // System.out.println("hello world");
//         // // System.out.println("hello world");
//         // // System.out.println("hello world");
//     // }
//     // static void message1(){
//     //     System.out.println("hello world");
//     //     message2();
//     // }
//     // static void message2(){
//     //     System.out.println("hello world");
//     //     message3();
//     // }
//     // static void message3(){
//     //     System.out.println("hello world");
//     //     message4();
//     // }
//     // static void message4(){
//     //     System.out.println("hello world");
//     // }
//     static void print1(int n){
//         System.out.println(n);
//         print2(2);
//     }
//     static void print2(int n){
//         System.out.println(n);
//         print3(3);
//     }
//     static void print3(int n){
//         System.out.println(n);
//         print4(4);
//     }
//     static void print4(int n){
//         System.out.println(n);
//         print5(5);
//     }
//     static void print5(int n){
//         System.out.println(n);
//     }
// }

public class recursion{
    public static void main(String[] args) {
        // print1(1);
        System.out.println(fibo(20));
    }
    static void print1(int n){
        System.out.println(n);
        if(n==5){
            return;
        }
        print1(n+1);
    }
    static int fibo(int n){
        // base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
