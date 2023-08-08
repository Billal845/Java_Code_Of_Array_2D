import java.util.Scanner;

public class PatternRecognization_Eight_19 {

        private static boolean isConsequtiveFour(int[][] array, int rows, int cols) {
        // row wise check
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                if (array[i][j] == array[i][j + 1] && array[i][j] == array[i][j + 2] && array[i][j] == array[i][j + 3]) {
                    return true;
                }
            }
        }

        // colum wise check
        for (int i = 0; i <= rows - 4; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == array[i + 1][j] && array[i][j] == array[i + 2][j] && array[i][j] == array[i + 3][j]) {
                    return true;
                }
            }
        }

        // lower right
        for (int i = 0; i <= rows - 4; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                if (array[i][j] == array[i + 1][j + 1] && array[i][j] == array[i + 2][j + 2] && array[i][j] == array[i + 3][j + 3]) {
                    return true;
                }
            }
        }

        // upper right
        for (int i = 3; i < rows; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                if (array[i][j] == array[i - 1][j + 1] && array[i][j] == array[i - 2][j + 2] && array[i][j] == array[i - 3][j + 3]) {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];
        System.out.println("Enter the values for the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println(isConsequtiveFour(array, rows, cols));
    }
}
