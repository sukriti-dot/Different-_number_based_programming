public class SumEqualsProduct {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (checkSumEqualsProduct(i)) {
                System.out.println(i + " is a number where the sum of its digits equals the product of its digits.");
            }
        }
    }

    private static boolean checkSumEqualsProduct(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }
}
