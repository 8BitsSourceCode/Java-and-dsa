package Day_18_Arrays;

public class maxInArray {
    public static void main(String[]args){
        int [] num = {56,708,2,90,34};
        int max = num[0];

        for (int i=0;i<num.length;i++){
            if (num[i] > max){
                max = num[i];
            }

        }
        System.out.println(max);

    }
}
