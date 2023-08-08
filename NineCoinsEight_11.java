import java.util.Scanner;

public class NineCoinsEight_11 {
    public static void main(String[] args){
        System.out.println("Enter a decimal between 0 and 511: ");
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        //converting to binary
        String binary = Integer.toBinaryString(decimal);
        int lenOfBinary = binary.length();

        ////for 9 bit H & T
        char[] arr = new char[9]; 
        int idx = lenOfBinary-1;
        for(int i=8; i>=0 ; i--){
            if(idx<0){
                arr[i] = 'H';
            }else{
                if(binary.charAt(idx) == '1'){
                arr[i] = 'T';
                idx--;
            }
            else{
                arr[i] = 'H';
                idx--;
            }
        }
        
    }

    //make 2D matrix and print
    char[][] result = new char[3][3];
    int index =0;
    for(int i=0; i<result.length; i++){
        for(int j=0; j<result[0].length; j++){
            result[i][j] = arr[index];
            index++;
            System.out.print(result[i][j]+" ");
        }
        System.out.println();


    }
}
    
}
