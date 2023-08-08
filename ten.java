import java.util.Scanner;

public class ten {
    public static int returnIdx(int[] arr){
        int smallest = arr[0];
        int idx = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<smallest){
                idx = i;
                smallest = arr[i];

            }
        }
        return idx;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter "+ size+ " numbers :");
        for(int i=0; i<size ; i++){
            arr[i] = sc.nextInt();
        }

        int idx = returnIdx(arr);
        System.out.println("Smallest found at index: "+idx);

    }
    
}
