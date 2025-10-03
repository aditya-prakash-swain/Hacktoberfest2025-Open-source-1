public class FractionAddition {
    
    // Function to compute GCD (for simplifying fractions)
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Function to add two fractions
    public static String addFractions(int num1, int den1, int num2, int den2) {
        // Find common denominator
        int commonDen = den1 * den2;
        int newNum = (num1 * den2) + (num2 * den1);

        // Simplify the fraction
        int divisor = gcd(newNum, commonDen);
        newNum /= divisor;
        commonDen /= divisor;

        // Return result as a string
        return newNum + "/" + commonDen;
    }

    public static void main(String[] args) {
        int num1 = 3, den1 = 4;  // 3/4
        int num2 = 2, den2 = 3;  // 2/3

        String result = addFractions(num1, den1, num2, den2);
        System.out.println("Result of (3/4 + 2/3) = " + result);
    }
}
