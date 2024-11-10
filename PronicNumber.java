public class PronicNumber {
    public static void main(String[] args) {
        int num = 12; 
        boolean isPronic = false;

        for (int i = 0; i <= num; i++) {
            if (i * (i + 1) == num) {
                isPronic = true;
                break;
            }
        }

        if (isPronic) {
            System.out.println(num + " is a pronic number.");
        } else {
            System.out.println(num + " is not a pronic number.");
        }
    }
}
