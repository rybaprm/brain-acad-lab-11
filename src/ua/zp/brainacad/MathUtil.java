package ua.zp.brainacad;

public class MathUtil {
    /**
     * Class MathUtil that consist some static methods: sum, mul, factorial, arithmeticProgression,
     * geometricProgression
     */

    /**
     * Declaration static method which print to consol value of sum of arguments;
     */
    public static void sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    /**
     * Declaration static method which print to consol value of multiply arguments;
     */
    public static void mul(int... numbers) {
        int mul = 1;
        for (int number : numbers) {
            mul *= number;
        }
        System.out.println(mul);
    }

    /**
     * Declaration static method which print to consol value of number factorial;
     */
    public static void factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number + 1; i++) {
            factorial *= i;
        }
        factorial /= number + 1;
        System.out.println(factorial);
    }

    /**
     * Declaration static method which print to consol some items of arithmeticProgression;
     */
    public static void arithmeticProgression(int firstItem, int difference, int quantity) {
        int arithmeticProgression = firstItem;
        for (int i = 0; i < quantity; i++) {
            System.out.print(arithmeticProgression + ", ");
            arithmeticProgression += difference;
        }
        System.out.println();
    }

    /**
     * Declaration static method which print to consol some items of geometricProgression;
     */
    public static void geometricProgression(int firstItem, int denominator, int quantity) {
        int geometricProgression = firstItem;
        for (int i = 0; i < quantity; i++) {
            System.out.print(geometricProgression + ", ");
            geometricProgression *= denominator;
        }
        System.out.println();
    }
}
