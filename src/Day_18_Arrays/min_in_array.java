package Day_18_Arrays;

public class min_in_array {
    public static void main(String[]args){
        int [] num = {79,44,67,3,44,45};
        int min = num[0];

        for(int i=0;i<num.length;i++){
            if (num[i] <  min){
                min = num[i];
            }
        }
        System.out.println(min);
    }

}
