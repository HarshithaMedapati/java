   
import java.util.*;

public class sumofdigits {
    public static void main(String[] args) {
        int a, sum = 0, r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        a = scanner.nextInt();

        while (a != 0) {
            r = a % 10;        // To Extract the last digit of the number
            sum = sum + r;     // To Add the last digit to the sum
            a = a / 10;        // To Remove the last digit from the number
        }

        System.out.println(sum); 
    }
}

