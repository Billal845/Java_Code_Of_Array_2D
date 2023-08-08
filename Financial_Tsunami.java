import java.util.Scanner;
public class Financial_Tsunami {
    public static void main(String[] args){
        System.out.println("Enter the number of  banks and limit:");
        Scanner sc = new Scanner(System.in);
        int numOfBank = sc.nextInt();
        double limit = sc.nextDouble();
        double borrowers [][] = new double[numOfBank][numOfBank];
        double currBlance[] = new double[numOfBank];

//fill the field up
        for(int i= 0; i<currBlance.length; i++){
            currBlance[i] = sc.nextDouble(); // curr
            int howManyBorrowers = sc.nextInt();
            for(int j=0; j<howManyBorrowers; j++){
                borrowers[i][sc.nextInt()] = sc.nextDouble();
            }
        }

// Operation bankrupt

for(int i=0; i<numOfBank; i++){
    for(int j=0; j<numOfBank; j++){
        int myTotal  = 0;
        for(int k=0; k<numOfBank; k++){ //adding all the given loan by this company
            myTotal+= borrowers[j][k];
        }
        if(myTotal + currBlance[j] < limit){ // make 0 to it's lenders
            for(int l = 0; l<numOfBank; l++){
                borrowers[l][j] = 0;
            }
        }
    }
}

System.out.println("Unsafe banks are:");
for(int i=0; i<numOfBank; i++){
    int total = 0;
    for(int j =0; j<numOfBank; j++){
        total+= borrowers[i][j];
    }

    if(total + currBlance[i] < limit){
     System.out.print(i+" ") ; 
    }
}
    }
    
}

