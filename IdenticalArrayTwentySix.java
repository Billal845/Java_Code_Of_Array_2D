import java.util.Scanner;

public class IdenticalArrayTwentySix {

    public static boolean isIdentical(int[] arr1, int[] arr2){
        for(int i=0; i<arr1.length ; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true; 
    }
    
    public static void main(String[] args){
        System.out.println("Enter the size of 1st array:");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        System.out.println("Enter the size of 2nd array:");
        int size2 = sc.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        System.out.println("Enter "+size1+" numbers of array 1");
        for(int i=0; i<size1 ; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter "+size2+" numbers of array 1");
        for(int i=0; i<size1 ; i++){
            arr2[i] = sc.nextInt();
        }
        
        System.out.println(isIdentical(arr1, arr2));
    }
}
