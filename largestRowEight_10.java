import java.util.Random;
public class largestRowEight_10 {

    public static void countLargestRow(int[][] arr){
        int largeRowIndex = -1;
        int largeOne = -1;
    
        for(int i=0; i<arr.length; i++){
            int totalOne = 0;
            for(int j=0; j<arr.length; j++){
                totalOne+= arr[i][j];
            }
            if(totalOne>largeOne){
                largeOne = totalOne;
                largeRowIndex = i;
            }
        }
        System.out.println("Large Row index is: "+largeRowIndex);
    }

    public static void countLargestColum(int[][] arr){
        int largestColIndex = -1;
        int largeOne = 0;

        for(int i=0; i<arr.length; i++){
            int totalOne = 0;
            for(int j=0; j<arr.length; j++){
                totalOne+= arr[j][i];
            }
            if(largeOne<totalOne){
                largeOne = totalOne;
                largestColIndex = i;
            }
        }
        System.out.println("Largest colum index is: "+ largestColIndex);
    }
    public static void main(String[] args){
        Random rand = new Random();

        int[][] arr = new int[4][4];
        for(int i=0; i<4; i++){
            for(int j=0; j<4 ; j++){
                arr[i][j] = rand.nextInt(2);
            }
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<4 ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        countLargestRow(arr);
        countLargestColum(arr);
    }
    
}
