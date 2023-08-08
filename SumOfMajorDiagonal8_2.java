import java.util.Scanner;

public class SumOfMajorDiagonal8_2 {

    public static int getSumOfDiagonals(int[][] mat){
        int c =0;
        int sum = 0;
        for(int r=0; r<mat.length && c<mat.length ; r++,c++){
            sum+= mat[r][c];
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Enter the size of the 2D matrix:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] mat = new int[size][size];

        System.out.println("Enter "+size*size + " elements:");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                mat[i][j] = sc.nextInt();
            }
        }

       int sum =  getSumOfDiagonals(mat);
       System.out.println("Sum of the major daigonals is : "+sum);
    }
    
}
