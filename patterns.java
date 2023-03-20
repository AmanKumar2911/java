public class patterns {
    public static void main(String[] args) {
        pattern8(4);
    }

    /*
     * pattern 1
     *
     * *
     * * *
     * * * *
     */
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }

    /*
     * pattern 2
     * * * *
     * * * *
     * * * *
     * * * *
     */
    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }

    /*
     * pattern 3
     ****
     ***
     **
     *
     * 
     * 
     */
    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * pattern 4
     * 
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     * 
     */
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    /*
        pattern 5
     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *
    
    */
    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalCloInRow = row > n ? 2*n-row : row ;
            for(int col=0;col<totalCloInRow;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*  pattern6

        *
       * *
      * * *
     * * * * 
      * * *
       * *
        *
      

    */
    static void pattern6(int n){
        for(int row=0;row<2*n;row++){
            int totalCloInRow = row > n ? 2*n-row : row ;
            int numOfSpaces= n - totalCloInRow;
            for(int space=0;space<numOfSpaces;space++){
                System.out.print(" ");
            }
            for(int col=0;col<totalCloInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /* pattern7 
             1
           2 1 2
         3 2 1 2 3
       4 3 2 1 2 3 4
     5 4 3 2 1 2 3 4 5 
    */ 
    static void pattern7(int n){
        for(int i=1;i<=n;i++){
            for(int space=0;space<n-i;space++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.err.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        int originalN=n;
        n=2*n;
        for(int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                int atEveryIndex=originalN-Math.min(Math.min(i, j), Math.min(n-i, n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
