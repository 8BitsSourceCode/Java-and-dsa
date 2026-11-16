package Day_19_Arrays_for_each_loop;

public class arrays_practice {
    public static void main(String[]args){
        int[] numbers = {5, 10, 15, 20};
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
        System.out.println(numbers.length);

        numbers[1]=99;
        System.out.println(numbers[1]);


        for (int num :numbers){
            System.out.println(num);
        }

    }


}
