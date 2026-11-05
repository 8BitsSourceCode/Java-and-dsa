package Day_16;

public class NumberButterfly {
    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Left numbers
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print("  ");
            }

            // Right numbers
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            // Left numbers
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print("  ");
            }

            // Right numbers
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}