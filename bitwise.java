public class  bitwise{
    public static void main(String[] args) {
        // int a = 10;
        // System.out.println(a<<4);  // a << 1 = 2a  or a<<b=a*2^b  bitwise operater.
        // // a>>b=a/2^b

        // int num=68;
        // System.out.println(isodd(num));


        // int[] arr={2,3,3,4,2,6,4};
        // System.out.println(numberIsApperingEvenTime(arr));

        // 5 magicnumber on n
        // int n=3;
        // System.out.println(_5_maigicnumber(n));

        // int n = 10;
        // System.out.println(numberofdigits(n));

        // int n = 4;
        // System.out.println(pascalTrianle(n));


        // int n=16;
        // System.out.println(ismorthanOneisOne(n));


        // System.out.println(power(6, 3));

        System.out.println(getSetBit(6));



          
        
    }
    static boolean isodd(int n){
        return(n & 1)==1;
    }
    static int numberIsApperingEvenTime(int[]arr){
        int unique=0;
        for(int n:arr){
            unique ^=n;
        }
        return unique;
    }
    static int _5_maigicnumber(int n){
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n & 1;
            n = n >> 1;
            ans+= last*base;
            base=base*5;

        }
        return ans;
    }
    static int numberofdigits(int n){
        int b=2;
        int ans=(int)(Math.log(n)/Math.log(b))+1;
        return ans;
    }
    /*
     pascal's triangle
     1
     1 1
     1 2 1
     1 3 3 1
     1 4  6  4  1
     1 5 10 10 5 1


      sum of each row in pascal's triangle = n^C base 0 + n^C base 1 + n^C base 2 + n^C base 3 + n^C base 4 + ..........n^C base n = 2^n


      for nth row, sum = 2^n-1

     */
    static int pascalTrianle(int n){
        return 1 << (n-1);
    }
    static boolean ismorthanOneisOne(int n){
        return (n & (n-1)) == 0 ? false : true;
    }
    static int power (int power,int base){
        int ans = 1;
        while(power >0 ){
            if((power & 1) == 1){
                ans = ans * base;
            }
            base*=base;
            power = power >> 1;
        }
        return ans;
    }
    static int getSetBit(int n){
        int counter=0;
        while(n != 0){
            int rmsb = (n & -n);
            n = n-rmsb;
            counter++;
        }
        return counter;
        
    }

    

}
