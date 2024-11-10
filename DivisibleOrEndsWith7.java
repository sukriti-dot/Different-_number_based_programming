public class DivisibleOrEndsWith7 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) { // Example range
            if (isDivisibleBy7OrEndsWith7(i)) {
                System.out.println(i + " is divisible by 7 or ends with a 7.");
            }
        }
    }

    private static boolean isDivisibleBy7OrEndsWith7(int number) {
        // Check if the number is divisible by 7
        if (number % 7 == 0) {
            return true;
        }

        // Check if the number ends with 7
        if (number % 10 == 7) {
            return true;
        }

        return false;
    }
}
