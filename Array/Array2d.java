import java.util.Scanner;
public class Array2d {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] array = {
            {1, 2, 3}, // 0TH INDEX
            {4, 5, 6}, // 1TH INDEX
            {7, 8, 9} // 2TH INDEX
        };
        // input
        int[][] arrd = new int [3][4];
        System.out.println(arrd.length);// no of rows 
        Scanner sc = new Scanner(System.in);
        for(int row = 0;row<arrd.length;row++){
            // for each col in every row
            for(int col = 0;col<arrd[row].length;col++){
                arrd[row][col]= sc.nextInt();
            }

        }
        System.out.println(arrd);
        

        

        
    }
    
}
