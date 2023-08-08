import java.util.Scanner;

public class MatrixMultiplyEight_6 {

    public static int[][] MatrixMultiply(int[][] mat1, int[][] mat2){
        int sum = 0;
        int[][] result = new int[mat1.length][mat2[0].length]; 
        for(int row =0; row<mat1.length; row++){
            for(int col = 0; col<mat2[0].length; col++){
                for(int k=0; k<mat1[0].length; k++){
                    sum+= mat1[row][k] * mat2[k][col];
                }
                result[row][col] = sum;
                sum = 0;   
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers of row of the first matrix:");
        int rowOf1 = sc.nextInt();
        System.out.println("Enter numbers of colum of the first matrix:");
        int columnOf1 = sc.nextInt();
        int[][] mat1 = new int[rowOf1][columnOf1];
        System.out.println("Enter the entries of matrix 1:");
        for(int i=0; i<rowOf1; i++){
            for(int j=0; j<columnOf1; j++){
                mat1[i][j] = sc.nextInt();
            }
        }


        int rowOf2 = columnOf1; 
        System.out.println("Enter numbers of colum of the 2nd matrix:");
        int columnOf2 = sc.nextInt();
        int[][] mat2 = new int[rowOf2][columnOf2];
        System.out.println("Enter the entries of matrix 2:");
        for(int i=0; i<rowOf2; i++){
            for(int j=0; j<columnOf2; j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        int[][] result = MatrixMultiply(mat1,mat2);
        for(int i=0; i<rowOf1; i++){
            for(int j=0; j<columnOf2 ; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
