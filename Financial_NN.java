import java.util.Scanner;
public class Financial_NN {
    public static void main(String[] args) {
        System.out.println("Enter the number of banks and limit:");
        Scanner sc = new Scanner(System.in);
        int numOfBank = sc.nextInt();
        double limit = sc.nextDouble();
        double borrowers[][] = new double[numOfBank][numOfBank];
        double currBalance[] = new double[numOfBank];
        double totalAssets[] = new double[numOfBank];

        // Fill the fields
        for (int i = 0; i < currBalance.length; i++) {
            currBalance[i] = sc.nextDouble(); // curr
            int howManyBorrowers = sc.nextInt();
            for (int j = 0; j < howManyBorrowers; j++) {
                int borrowerID = sc.nextInt();
                double amountBorrowed = sc.nextDouble();
                borrowers[i][borrowerID] = amountBorrowed;
            }
            totalAssets[i] = currBalance[i]; // Initialize total assets with current balance
        }
        sc.close();

        // Calculate total assets for each bank (including borrowed amounts)
        for (int i = 0; i < numOfBank; i++) {
            for (int j = 0; j < numOfBank; j++) {
                totalAssets[i] += borrowers[i][j];
            }
        }

        // Mark unsafe banks
        boolean[] unsafe = new boolean[numOfBank];
        for (int i = 0; i < numOfBank; i++) {
            if (!unsafe[i] && totalAssets[i] < limit) {
                markUnsafe(borrowers, unsafe, i);
            }
        }

        // Print unsafe bank IDs
        System.out.println("Unsafe banks are:");
        for (int i = 0; i < numOfBank; i++) {
            if (unsafe[i]) {
                System.out.print(i + " ");
            }
        }
    }

    private static void markUnsafe(double[][] borrowers, boolean[] unsafe, int bankID) {
        if (unsafe[bankID]) {
            return; // Already marked as unsafe
        }

        unsafe[bankID] = true; // Mark the current bank as unsafe

        for (int i = 0; i < borrowers[bankID].length; i++) {
            if (borrowers[bankID][i] > 0) {
                markUnsafe(borrowers, unsafe, i); // Recursively mark borrowers as unsafe
            }
        }
    }
}
