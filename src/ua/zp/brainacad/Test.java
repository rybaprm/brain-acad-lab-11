package ua.zp.brainacad;

public class Test {

    public static void main(String[] args) {
        /**
         * Call static methods of class MathUtil with different arguments
         */
        MathUtil.sum(1, 2, 3);
        MathUtil.sum(1, 2, 3, 4);
        MathUtil.mul(1, 2, 3);
        MathUtil.mul(1, 2, 3, 4);
        MathUtil.factorial(3);
        MathUtil.factorial(0);
        MathUtil.arithmeticProgression(1, 4, 20);
        MathUtil.geometricProgression(1, 2, 20);

    }
}
