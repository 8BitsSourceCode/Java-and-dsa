package Day_18_Arrays;

public class searching_in_array {
    public static void main(String[]args){
        int [] num = {54,23,77,25,78};
        int target = 77;

        for (int i=0;i<num.length;i++){
            if(target == num[i]){
                System.out.println(i);
            }
        }
    }
}
