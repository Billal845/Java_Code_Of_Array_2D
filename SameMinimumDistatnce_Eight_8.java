import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class SameMinimumDistatnce_Eight_8 {

    public static double getDistance(double x1,double y1, double x2, double y2){
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)  );
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of points:");
        int numberOfpoints = sc.nextInt();
        double[][] points = new double[numberOfpoints][3];

        for(int i=0; i<points.length; i++){
            points[i][0] = sc.nextDouble();
            points[i][1] = sc.nextDouble(); 
        }
        
        double minDistance = Double.MAX_VALUE;
        List<int[]> closetPairs = new ArrayList<>();//to keep track of the same min distances index

        for(int i=0; i<points.length; i++){
            for(int j= i+1; j<points.length; j++){
                double newDistance = getDistance(points[i][0],points[i][1],points[j][0],points[j][1]);

                if(newDistance<minDistance){
                    closetPairs.clear();
                    closetPairs.add(new int[]{i,j});
                    minDistance = newDistance;
                }else if(newDistance == minDistance){
                    closetPairs.add(new int[]{i,j});
                }
            }
        }

        for(int[] pair : closetPairs){
            System.out.print("The closet two points are ("+ points[pair[0]][0] + " ," + points[pair[0]][1] +") and  ("+ points[pair[1]][0] +","+ points[pair[1]][1]+") \n"  );
        }

        System.out.println("Their distance is :"+ minDistance);
    }
    
}


