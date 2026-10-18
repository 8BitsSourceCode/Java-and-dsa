package Day_8;

public class NestedLoop2 {
    public static void main(String[]args){
// guess the output
        System.out.println("Next 1");
        for (int i = 1; i <= 2; i++) {      // Runs 2 times
            for (int j = 1; j <= 4; j++) {  // Runs 4 times
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Next 2");
        for(int i=1;i<=2;i++){
            for(int j=1;j<=4;j++){
                System.out.println(j);
            }
        }
        System.out.println("Next 3");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Next 4");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Next 5");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Next 6");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Next 7");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Next 8");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Next 9");
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Next 10");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Next 11");
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Next 12");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("Next 13");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Next 14");
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Next 15");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
