public class AbundantNumber {  
    public static boolean isAbundant(int number) {  
        int sumOfDivisors = 1; 
        for (int i = 2; i <= Math.sqrt(number); i++) {  
            if (number % i == 0) {  
                sumOfDivisors += i;  
                if (number / i != i) {  
                    sumOfDivisors += (number / i);  
                }  
            }  
        }  
        return sumOfDivisors > number;  
    }  
    public static void main(String[] args) {  
        int number = 12; 
        if (isAbundant(number)) {  
            System.out.println(number + " is an abundant number.");  
        } else {  
            System.out.println(number + " is not an abundant number.");  
        }  
    }  
}  