package bitManupulation;

public class reversebitleetcode {
    public static void main(String[] args) {
        int n = 14;
        boolean flag= false;
        int rev=0;
        int j=0;
        for(int i=31;i>=0;i--){
            int mask=(1<<i);
            if(flag){
                if((n & mask) != 0){
                    System.out.println(1);
                    int smask = (1<<j);
                    rev |= smask;
                }
                else{
                    System.out.println(0);
                }
                j++;
            }
            else{
                if((n & mask) != 0){
                    System.out.println(1);
                    flag=true;
                    int smask=(1<<j);
                    rev |= smask;
                    j++;

                }
                else{
                }
            }

        }
        System.out.println();
        System.out.println(Integer.toBinaryString(rev));
    }
}
