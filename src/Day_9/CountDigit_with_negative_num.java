package Day_9;

public class CountDigit_with_negative_num {
    public static void main(String[]args){
        int num = -837832;
        int count = 0;
        num = Math.abs(num); // it convert the negative value to positive like -456 to 456
//        System.out.println(num);

        if (num == 0){
            count=1;
        }else{
            while (num != 0){
                count++;
                num /= 10;
            }
        }
        System.out.println(count);


        // best one for long numbers
        int num1 = -123;
        long n = Math.abs((long) num1);
        int count1 = 0;

        if (n == 0) {
            count1 = 1;
        } else {
            while (n != 0) {
                count1++;
                n /= 10;
            }
        }

        System.out.println("Number of digits = " + count1);
    }
}
