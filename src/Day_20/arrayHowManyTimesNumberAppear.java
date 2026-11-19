package Day_20;

public class arrayHowManyTimesNumberAppear {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 10,6,20,10,55,10};
        int target = 10;
        int count = 0;

        for (int num : numbers) { // num holds the actual value (10, 20, ...)
            if (num == target) {
                count++;
            }
        }
        System.out.println(count); // Output: 3


        // my
        //  Set int target = 10; instead of numbers[0]:
        //Right now, numbers[0] only works by coincidence because 10 happens to be the first element.
        // If the array changed to {50, 10, 20, 10}, your code would count 50 instead of 10

        int times = numbers[0];
        int ct =0;
        for (int i=0;i<numbers.length;i++){
            if(times == numbers[i]){
                ct++;
            }
        }
        System.out.println(ct);



//        int target = 10;
//        int count = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == target) {
//                count++;
//            }
//        }
//
//        System.out.println(count);

    }
}