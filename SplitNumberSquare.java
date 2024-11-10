public class SplitNumberSquare {
    public static void main(String[] args) {
        for (int i = 10; i < 1000; i++) { 
            if (hasEvenDigits(i) && isValidNumber(i)) {
                System.out.println(i + " can be split into two parts such that the square of their sum equals the number.");
            }
        }
    }

    private static boolean hasEvenDigits(int number) {
        return String.valueOf(number).length() % 2 == 0;
    }

    private static boolean isValidNumber(int number) {
        String numStr = String.valueOf(number);
        int len = numStr.length();
        int half = len / 2;

        // Split the number into two parts
        int firstPart = Integer.parseInt(numStr.substring(0, half));
        int secondPart = Integer.parseInt(numStr.substring(half));

        // Check if the square of their sum equals the original number
        int sum = firstPart + secondPart;
        return sum * sum == number;
    }
}
