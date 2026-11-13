package Day_18_Arrays;

public class breakDuringSearchArrays {
    public static void main(String[]args){
        int [] num = {33,90,73,45,23};
        int target = 23;
        for (int i=0;i<num.length;i++){
            if(target == num[i]){
                System.out.print("Index number : "+i);
                break;
            }
        }
    }
}
