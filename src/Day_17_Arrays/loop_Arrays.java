package Day_17_Arrays;

public class loop_Arrays {
    public static void main(String[]args){
        int [] marks = {89,36,66,90,55};
        int [] nums = {34,54,23,65,19};
        for (int i=0;i<marks.length;i++){      //we cant yous i<= because marks[5] doesnt exist
            System.out.println(marks[i]);
        }
            System.out.println("Nums ");
        for (int i=0;i<5;i++){
            System.out.println(nums[i]);
        }
    }
}
