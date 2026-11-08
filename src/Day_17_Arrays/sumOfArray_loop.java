package Day_17_Arrays;

public class sumOfArray_loop {
    public static void main(String[]args){
        int [] num = {66,34,25,59,45};
        int sum = 0;
        for (int i=0;i<num.length;i++){
            sum = sum + num[i];
        }
        System.out.println(sum);
    }
}
