public class EmploeeEight_4 {

     public static int[][] sortInDescending(int[][] sumOfHours){
        for(int i=0; i<sumOfHours.length-1; i++){
            for(int j=i+1; j<sumOfHours.length; j++){
                if(sumOfHours[i][1]<sumOfHours[j][1]){
                    int[] temp = sumOfHours[i];
                    sumOfHours[i] = sumOfHours[j];
                    sumOfHours[j] = temp;
                }
            }
        }
        return sumOfHours;     
     }


    public static void main(String[] args){
        int[][] daysWork = {
                {2, 4, 3, 4, 5, 8, 8},  
                {7, 3, 4, 3, 3, 4, 4},  
                {3, 3, 4, 3, 3, 2, 2},  
                {9, 3, 4, 7, 3, 4, 1},  
                {3, 5, 4, 3, 6, 3, 8},  
                {3, 4, 4, 6, 3, 4, 4},  
                {3, 7, 4, 8, 3, 8, 4},  
                {6, 3, 5, 9, 2, 7, 9}}; 

        int[][] sumOfHours = new int[8][2];
        for(int i=0; i<8; i++){
            int sum = 0;
            for(int j=0; j<daysWork[i].length; j++){
                sum+= daysWork[i][j];
            }
            sumOfHours[i][0] = i;
            sumOfHours[i][1] = sum; 
        }


        int[][] sorted = sortInDescending(sumOfHours);
        for(int i=0; i<sorted.length; i++){
            System.out.print("Employee ");
            for(int j=0; j<sorted[i].length; j++){
                System.out.print(sorted[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
