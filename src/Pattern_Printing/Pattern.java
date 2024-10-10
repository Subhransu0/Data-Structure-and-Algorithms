package Pattern_Printing;

public class Pattern {

    public static void Pateern1(int n){
        for(int row = 0 ; row < n ; row++){
            for(int col = 0 ; col < n ; col ++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){

        for(int row = 0 ; row < n ; row++){
            for(int col = 0 ; col <= row ; col++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void pattern3(int n){

        for(int row = 1 ; row <= n ; row++){

            for(int col = 1 ; col <= row ; col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }
    public static void pattern4(int n){

        for(int row = 1 ; row <= n ; row++){
            int temp = row;

            for(int col = 1 ; col <= row ; col++){
                System.out.print(temp);
            }
            System.out.println();
        }

    }

    public static void pattern5(int n){
        for(int row = 0 ; row < n ; row++){

            for(int col =  0 ; col < n - row ; col ++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void pattern6(int n){
        for(int row = 0 ; row < n ; row++){

            for(int col =  1 ; col <= n - row ; col ++){
                System.out.print(col);
            }
            System.out.println();
        }


    }

    public static void pattern7(int n){
        for(int row = 0 ; row < n ; row++){
            for(int space = 0 ; space < n - row - 1; space ++){
                System.out.print(" ");
            }
            for(int col = 0 ; col <= row ; col++){
                System.out.print("*");
            }

            for(int col = 0 ; col < row ; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern8(int n){
        for (int row = 0 ; row < n ; row++){
            for (int space = 0 ; space < row ; space ++){
                System.out.print("  ");
            }
            for(int col= 0 ; col < n - row ; col++){
                System.out.print("* ");
            }
            for (int col = 0 ; col < n - row - 1 ; col++){
                System.out.print("* ");
            }


            System.out.println();
        }
    }
    public static void pattern9(int n){
        for (int row = 1; row <= n*2 ; row++){

            int space = row > n ? row - n - 1 :  n - row;
            for(int s = 1 ;  s <= space ; s++){
                System.out.print(" ");
            }
            int column = row > n ?  2*n - row + 1 : row   ;
            for (int col = 1 ; col <= column ; col ++){
                System.out.print("*");
            }
            for (int col = 1 ;col <= column-1 ; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern10(int n ){
        for(int row = 1 ; row < 2*n ; row ++){
            int column = row > n ?  n*2 - row  : row  ;
            for(int col = 1; col <= column ; col ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n ){
        int start = 1;
        for (int row = 1 ; row <= n ; row++){
            start = 1;
            if(row % 2 == 0){
                start = 0 ;
            }
            else{
                start = 1;
            }

            for(int col = 1 ; col <= row ; col++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }

    }
    public static void pattern12(int n){
        for (int row = 1 ; row <= n ; row++){
            for (int col = 1 ; col <= row ; col++){
                System.out.print(col);
            }
            for (int space = 1 ; space <= n-row ; space++){
                System.out.print(" ");
            }
            for (int s = 1; s <= n-row ; s++){
                System.out.print(" ");
            }
            for (int col = row ; col >= 1 ; col -- ){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern13(int n){
        int num = 1;
        for(int row = 1; row <= n ; row++){
            for(int col = 1; col <= row ; col++){
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){

        for (int row = 1; row <= n ; row ++){

            for (char ch = 'A' ; ch < 'A' + row; ch++ ){
                System.out.print(ch);
            }

            System.out.println();
        }
    }
    public static void pattern15(int n){
        for(int row = 1; row <= n ; row ++){
            for(char ch = 'A' ; ch <= 'A'+ n - row ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){

        for (int row = 0; row < n ; row++){
            for(int col = 0 ; col <= row ; col++){
                System.out.print((char)(int)('A'+row )+ " " );
            }
            System.out.println();
        }

    }
    public static void pattern17(int n){
        for(int row = 0 ; row < n ; row++){
            for(int space = 0 ; space < n - row ; space++ ) {
                System.out.print(" ");
            }
            for (char ch = 'A' ; ch < 'A' + row; ch++ ){
                System.out.print(ch);
            }
            for (char ch = (char)('A'+row) ; ch >= 'A' ; ch--){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void pattern18(int n ){
        for (int row = 0; row < n ; row++){
            for (char ch = (char)(int)('A' + n - row - 1); ch <= (char)(int) ('A' + n -1); ch ++){
                System.out.print(ch + " ");

            }
            System.out.println();
        }
    }
    public static void pattern19(int n){
        for(int row = 1 ; row <= 2*n ; row ++){
            int column = row > n ? row - n-1 : n - row ;
            for(int col = 0 ; col <= column ; col ++){
                System.out.print("*");
            }
            int space = row > n ? 2*n - row : row - 1;
            for(int s = 1 ; s <= space ; s++){
                System.out.print(" ");
            }
            for(int s = 1 ; s <= space ; s++){
                System.out.print(" ");
            }
            for(int col = 0 ; col <= column ; col ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern20(int n){
        for(int row = 1 ; row < 2*n ; row++){
            int column = row > n ? 2*n - row : row ;
            for(int col = 1 ; col <= column ; col ++){
                System.out.print("*");
            }
            int space = row > n ? row - n : n - row ;
            for(int s = 1 ; s <= space ; s++){
                System.out.print(" ");

            }
            for(int s = 1 ; s <= space ; s++){
                System.out.print(" ");

            }
            for(int col = 1 ; col <= column ; col ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern21(int n ){
        for(int row = 1; row <n ; row ++){
            if (row == 1|| row == n-1){
                for(int col = 1; col <= n-1 ; col++){
                    System.out.print("*");
                }
            }
            else{
                for(int col = 1 ; col < n ; col++){
                    if(col == 1  || col == n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void pattern22(int n){
        for(int row = 0 ; row <= 2*n-2 ; row++){
            for(int col = 0 ; col <= 2*n-2; col++){
                int top = row;
                int left = col ;
                int right = (2*n -1) -1 - col;
                int bottom = (2*n - 1) -1 - row;

                System.out.print(n - Math.min( Math.min(top,bottom) , Math.min(left , right)  )  + "  ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern22(5);
    }

}
