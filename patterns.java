public class patterns {
    public static void main(String[] args) {
        int n = 4;
        pattern6(n);
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

}
