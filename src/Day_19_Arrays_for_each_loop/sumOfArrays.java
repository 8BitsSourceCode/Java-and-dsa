package Day_19_Arrays_for_each_loop;

public class sumOfArrays {
    public static void main(String[]args){
        int [] num = {34,56,74,20,84};
        int count = 0;
        for (int i=0;i<num.length;i++){
            count = count + num[i];
        }
        System.out.println(count);

    }
}
