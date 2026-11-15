package Day_18_Arrays;

public class arrayNewInt {
    public static void main(String[]args){
        int [] numbers = new int[5];
        numbers[1]=1;
        numbers[0]=7;
        numbers[2]=46;
        numbers[3]=74;
        numbers[4]=65;

        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
}
