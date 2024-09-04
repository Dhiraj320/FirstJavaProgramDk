package DSA.patterns;


public class Pattern {
    public static void main(String[] args) {
        System.out.println("Pattern1");
//        pattern1(5);
//        System.out.println("Pattern2");
//        pattern2(4);
//        System.out.println("Pattern3");
//        pattern3(4);
//        System.out.println("Pattern4");
//        pattern4(5);
//        System.out.println("Pattern5");
//        pattern5(5);
//        System.out.println("Pattern28");
//        pattern28(5);
//        System.out.println("Pattern30");
//        pattern30(5);
   System.out.println("Pattern17");
      pattern17(4);

        //pattern31(4);


    }

    /*
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *

     */

    public static void pattern1(int n){
        for (int row = 1; row <=n; row++){
            //for every row run the column
            for (int col = 1; col <=n; col++){
                System.out.print("* ");
            }
            // when one row is printed we add to newline
            System.out.println();
        }

    }



    /*
     *
     * *
     * * *
     * * * *

     */

    public static void pattern2(int n){
        for (int row = 1; row <=n; row++){
            //for every row run the column
            for (int col = 1; col <=row; col++){
                System.out.print("* ");
            }
            // when one row is printed we add to newline
            System.out.println();
        }
    }


    /*
     * * * *
     * * *
     * *
     *

     */
    public static void pattern3(int n){
        for (int row = 1; row <=n; row++){
            for (int col = 4; col >=row; col--){
                System.out.print("* ");

            }
            System.out.println();

        }

    }

    public static void pattern4(int n){
        for (int row = 1; row <=n; row++){
            //for every row run the column
            for (int col = 1; col <=row; col++){
                System.out.print(col +" ");
            }
            // when one row is printed we add to newline
            System.out.println();
        }

    }


    public static void pattern5(int n){
        /*
        //1st part
        for (int row = 1; row <=n; row++){
            //for every row run the column
            for (int col = 1; col <=row; col++){
                System.out.print("* ");
            }
            // when one row is printed we add to newline
            System.out.println();
        }

        //2nd part

        for (int row = 1; row <=n-1; row++){
            //for every row run the column
            for (int col = n-1; col >=row; col--){
                System.out.print("* ");
            }
            // when one row is printed we add to newline
            System.out.println();
        }

         */

        //way2 //or
        for (int row = 1; row <=2*n; row++){
            int totalColInRow=row>=n?2*n-row:row;
            //for every row run the column
            for (int col = 1; col <=totalColInRow; col++){
                System.out.print("* ");
            }
            // when one row is printed we add to newline
            System.out.println();
        }



    }

    //
    public static void pattern28(int n){
        for (int row = 1; row <=2*n-1; row++){
            int totalColInRow=row>=n?2*n-row:row;
            //for every row run the column
            int totalSpace =n-totalColInRow;
            for (int s = 1; s <=totalSpace; s++){
                System.out.print(" ");
            }
            for (int col = 1; col <=totalColInRow; col++){
                System.out.print("* ");
            }
            // when one row is printed we add to newline
            System.out.println();
        }

    }

    public static void pattern30(int n){
        for (int row = 1; row<=n; row++){
            for (int space = 1; space<=n-row; space++){
                System.out.print("  ");

            }
            for (int col = row; col>=1; col--){
                System.out.print(col +" ");
            }
            for (int col = 2; col<=row; col++){
                System.out.print(col +" ");
            }

            System.out.println();

        }


    }

    public static void pattern17(int n){
        for (int row = 1; row<=2*n; row++){

            int totalColInRow=row>=n?2*n-row:row;


            for (int space = 1; space<=n-totalColInRow; space++){
                System.out.print("  ");

            }
            for (int col = totalColInRow; col>=1; col--){
                System.out.print(col +" ");
            }
            for (int col = 2; col<=totalColInRow; col++){
                System.out.print(col +" ");
            }

            System.out.println();

        }


    }

    public static void pattern31(int n) {
        int originalN=n;
         n = 2*n;
         for (int row = 0; row<=n; row++){
             for (int col =0; col<=n; col++){
                 int atEveryIndex=originalN- Math.min(Math.min(row, col), Math.min(n-row, n-col));
                 System.out.print(atEveryIndex +" ");
             }
             System.out.println();
         }
    }






}
