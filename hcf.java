
import java.util.*;

public class hcf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt(); 
        int b = scanner.nextInt(); 
        
        int hcf = calculateHCF(a, b); 
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
    }

    
    public static int calculateHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
