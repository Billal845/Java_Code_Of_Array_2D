import java.util.Arrays;
import java.util.Scanner;

public class twentyOne {

    public static char[] recordPath(int numOfslot){
        char[] result = new char[numOfslot];
        for(int i=0; i<result.length; i++){
            int randomNumber = (int)(Math.random() * 2);
            if(randomNumber == 0){
                result[i] = 'R';
            }else{
                result[i] = 'L';
            }
        }
        return result;
    }

    public static int[] printAndCount(char[] path,int[] slots, int baltTh){
        int position = 1;
        System.out.println("the "+ baltTh +" ball fall through this path: "+ Arrays.toString(path));
        for(char c : path){
            if(c == 'R'){
                position++;
            }
        }
        System.out.println(baltTh +" ball stored at slot number "+ position);
        slots[position-1]++;
        return slots;
    }


    
    public static void main(String[] args){
        System.out.println("Enter number of slots:");
        Scanner sc = new Scanner(System.in);
        int numOfslot = sc.nextInt();
        int slots[] = new int[numOfslot];

        System.out.println("Enter number of balls:");
        int numOfball = sc.nextInt();

        for(int i=1; i<=numOfball; i++){
            char[] path = recordPath(numOfslot);
            slots = printAndCount(path,slots,i);
        }

        System.out.println("The slots after all the balls fall down:");
        for(int i=0; i<slots.length ; i++){
            System.out.print(slots[i]+" ");
        }
    }
    
}
