public class patterns {
    public static void main(String[] args) {
        int n=4;
        pattern3(n);
    }
    /* pattern 1
      *
      * *
      * * *
      * * * *
     */
    static void  pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
    /* pattern 2
       * * * *
       * * * *
       * * * *
       * * * *
     */
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
    /*  patter 3

     ****
     ***
     **
     *
     
     */
    static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}  
