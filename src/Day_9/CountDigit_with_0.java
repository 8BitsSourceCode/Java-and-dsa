package Day_9;

public class CountDigit_with_0 {
    public static void main(String[]args){
        int num = 0;
        int count = 0;
        if( num == 0 ){
            count = 1;
        }else{
            while (num != 0){
                count++;
                num /= 10;
            }
        }System.out.println(count);
    }
}
