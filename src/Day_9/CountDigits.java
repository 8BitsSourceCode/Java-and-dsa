package Day_9;

public class CountDigits {
    public static void main(String[]args){

        // this is the simplest way
        int num = 12345;
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        System.out.println("Number of Digits : "+count);

    }

}
