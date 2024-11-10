import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int num = n, sum = 0, digits = Integer.toString(n).length();

        while (num > 0) {
            int r = num % 10;
            sum += Math.pow(r, digits--);
            num /= 10;
        }

        if (n == sum) {
            System.out.println(n + " is a Disarium Number");
        } else {
            System.out.println(n + " is not a Disarium Number");
        }
    }
}
