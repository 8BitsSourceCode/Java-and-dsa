package Day_10;

public class Reverse_A_Number_simple {
    public static void main(String[]args){
        int num = 1423;
        int rev = 0;
        while(num != 0){
        int dig = num%10;
            rev = rev * 10 + dig;
            num /= 10;
        }
        System.out.println(rev);

    }
}

