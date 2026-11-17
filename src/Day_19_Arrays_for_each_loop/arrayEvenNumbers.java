package Day_19_Arrays_for_each_loop;

public class arrayEvenNumbers {
    public static void main(String[]args){
        int [] num = {22,56,33,77,31,49,52,90,45,31,44,22,63,89,10,18};
        int even = 0;
        for (int i=0;i<num.length;i++){
            if(num[i]%2==0){
                even += 1;
            }
        }
            System.out.println("Odd numbers : "+(num.length-even));
            System.out.println(even);
    }
}
