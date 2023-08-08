import java.util.Scanner;

public class lockerTwentyThree {
    
    public static void main(String[] args){
        System.out.println("Enter the number of student:");
        Scanner sc = new Scanner(System.in);
        int numOfStudent = sc.nextInt();
        boolean[] locker = new boolean[numOfStudent];

        for(int student=1; student<=numOfStudent; student++){

            for(int j =student-1; j<numOfStudent ; j= j+student){
                locker[j] = !locker[j];
            }
        }

        System.out.println("After all the student enter: ");
        for(int i=0; i<numOfStudent; i++){
            if(locker[i]== true){
                System.out.print((i+1)+" ");
            }
        }
    }
    
}
