
import java.util.Scanner;

public class repeatint{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input integers A and N
        int A = scanner.nextInt();
        int N = scanner.nextInt();

        // Printing integer A N times
        for (int i = 0; i < N; i++) {
            System.out.println(A);
        }

        scanner.close(); // Closing the scanner properly
    }
}    
    

