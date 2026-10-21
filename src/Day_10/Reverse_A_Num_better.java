package Day_10;

public class Reverse_A_Num_better {
    static long reverseNumber(long n) {
        long reversed = 0;

        while (n != 0) {
            long digit = n % 10;
            n /= 10;

            reversed = Math.addExact(
                    Math.multiplyExact(reversed, 10),
                    digit
            );
        }

        return reversed;
    }

    public static void main(String[] args) {
        long n = 559421;

        try {
            System.out.println(reverseNumber(n));
        } catch (ArithmeticException e) {
            System.out.println("Reversed number exceeds long range");
        }
    }

}
