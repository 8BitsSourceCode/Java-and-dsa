package PracticeQna;

public class CountDigit {
    public static void main(String[]args){
        int n = 0;
        int c = 0;
        while(n>0){
            c++;
            n /= 10;
        }
        System.out.println(c);



        int number = 708;
        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        System.out.println(count);
    }
}
