package Day_9;

public class Reverse_A_Number {
    public static void main(String[]args) {
        int num = 87654321;
        int rev = 0;
//        int rev1 = num / 1000;
//        System.out.println(rev);
//        System.out.println(rev1);
        while(num>0){
            int dig = num % 10;
            rev = rev * 10 + dig;
            num /= 10;

        }
        System.out.println(rev);


    }

}
