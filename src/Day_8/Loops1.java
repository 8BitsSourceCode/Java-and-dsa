package Day_8;

public class Loops1 {
    public static void main(String[] args){
        // calculating sum of n natural numbers
        int count = 0;
        for (int i = 1;i<=6;i++){
            count += i;
        }
        System.out.println(count);

        System.out.println("Min: " + Integer.MIN_VALUE); // -2147483648
        System.out.println("Max: " + Integer.MAX_VALUE); // 2147483647
          for (int j = 1;j<=10;j++){
              System.out.println("5 X "+j+" = "+5*j);
          }

    }
}
