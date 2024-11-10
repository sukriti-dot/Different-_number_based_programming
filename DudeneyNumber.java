import java.util.Scanner;

public class DudeneyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int cubeRoot = (int) Math.round(Math.cbrt(number));
        
        if (cubeRoot * cubeRoot * cubeRoot == number) {
            int sumOfDigits = 0;
            int temp = number;
            
            while (temp != 0) {
                sumOfDigits += temp % 10;
                temp /= 10;
            }
            
            if (sumOfDigits == cubeRoot) {
                System.out.println(number + " is a Dudeney number.");
            } else {
                System.out.println(number + " is not a Dudeney number.");
            }
        } else {
            System.out.println(number + " is not a Dudeney number.");
        }
    }
}
