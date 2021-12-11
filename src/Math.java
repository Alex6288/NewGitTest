public class Math {

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }

    public static int pow(int a, int b) {
        return Math.pow(a, b);
    }
}
