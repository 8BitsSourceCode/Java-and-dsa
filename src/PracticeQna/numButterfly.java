//

package PracticeQna;

public class numButterfly {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Left numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                System.out.print(" ");
            }

            // Right numbers
            int start = (i == n) ? i - 1 : i;

            for (int j = start; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}