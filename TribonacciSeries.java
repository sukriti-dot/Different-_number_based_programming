import java.util.Scanner;

public class TribonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        int a = 0, b = 1, c = 1;
        System.out.print("Tribonacci Series: " + a + " " + b + " " + c);
        
        for (int i = 4; i <= n; i++) {
            int d = a + b + c;
            System.out.print(" " + d);
            a = b;
            b = c;
            c = d;
        }
    }
}
