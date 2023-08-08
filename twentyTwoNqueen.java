import java.util.Scanner;
import java.util.Arrays;

public class twentyTwoNqueen {
    public static int solveCount = 0;

    public static  boolean isSafe(char[][] board, int row, int col){
        for(int i= 0 ;i<board.length;  i++ ){
            if(board[row][i] == 'Q'){
                return false;
            }
        }

        //vertical
        for(int i=0; i<board.length; i++){
            if(board[i][col]== 'Q'){
                return false;
            }
        }

        // upperleft
        int r = row;
        for(int c = col ; c>=0 && r>=0 ; r--,c--  ){
            if(board[r][c]== 'Q'){
                return false;
            }
        }

        //lowerleft
         r = row;
        for(int c = col; c>=0 &&  r<board.length ; r++,c-- ){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //upper right
         r = row;
         for(int c = col; r>=0 && c<board.length; c++,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
         }

         //lowerleft
         r = row;
         for(int c = col; r<board.length && c<board.length ; c++,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
         }

         return true;

    }



    public static void nQueen(char[][] board,int row){

        if(row == board.length){
            solveCount++;
            printSolution(board);
            return;
        }

        for(int col =0; col<board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';

                nQueen(board, row+1);
                board[row][col] = '|';
            }
        }
    }

    public static void printSolution(char[][] board){
        for(char[] row : board){
            for(char col : row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    
    public static void main(String[] args){
        System.out.println("Enter the number of queen:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] board = new char[N][N]; 
        
        for(int row = 0; row<N; row++){
            Arrays.fill(board[row],'|');
        }

        nQueen(board,0);
        System.out.println("Toatl solution "+ solveCount);
    }
    
}
