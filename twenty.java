import java.util.Scanner;

public class twenty {
    public static void swapwithLast(double[] arr){
        for(int i= arr.length -1; i>=0 ; i--){
            for(int j= i-1; j>=0; j--){
                if( arr[i]<arr[j]){
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        double[] arr = new double[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextDouble();
        }

        swapwithLast(arr);



    }
    
}
