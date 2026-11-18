package Day_19_Arrays_for_each_loop;

public class searchingArray {
    public static void main(String[]args){
        int [] num = {10, 25, 30, 45, 50};
        int tar = 45;

        for (int i=0;i<num.length;i++){
            if (tar == num[i]){
                System.out.println(i);
            }else{
                System.out.println("Index not found : ");
            }
        }
    }

}
