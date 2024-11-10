public class NumberWithZero {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) { 
            if (containsZeroNotAtStart(i)) {
                System.out.println(i + " contains at least one '0' but not at the beginning.");
            }
        }
    }

    private static boolean containsZeroNotAtStart(int number) {
        String numStr = String.valueOf(number);

        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '0') {
                return true;
            }
        }
        return false;
    }
}
