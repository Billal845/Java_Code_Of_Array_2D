
import java.util.Scanner;
public class LatinSquare_Eight_36 {

    public static boolean isDuplicate(char ch , char[][] mat, int col){
        for(int i = col+1; i<mat.length; i++){ //   colum Wise
            if(mat[0][i] == ch){
                return false;
            }
        }

        for(int j = 1; j<mat.length; j++){ //row wise
            if(mat[j][col] == ch){
                return false;
            }
        }
        return true;
    }


    public static boolean helper(char[][] mat){
        for(int i=0; i<mat.length; i++){
           if(isDuplicate(mat[0][i], mat,i) == false){
            return false;
           }
        }
        return true;
    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();

        char[][] mat = new char[n][n];
        int val = (int)('A'+n);
        char limit = (char) (val);

        System.out.println("Enter "+n+" rows of letters seperated by space");

        for(int i =0 ; i<mat.length; i++){
            for(int j=0; j< mat[0].length; j++){
                char ch = sc.next().charAt(0);
                if(ch > val){
                    System.out.println("The letter must be from A to "+ limit);
                    System.exit(0);
            }else{
                mat[i][j] = ch;
            }
        }
    }

        for(int i =0 ; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
               System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(helper(mat));
    }
}
    helper()

