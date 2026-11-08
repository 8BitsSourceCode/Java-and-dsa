package Day_17_Arrays;

public class loop_Arrays {
    public static void main(String[]args){
        int [] marks = {89,36,66,90,55};
        for (int i=0;i<marks.length;i++){      //we cant yous i<= because marks[5] doesnt exist
            System.out.println(marks[i]);
        }
    }
}
