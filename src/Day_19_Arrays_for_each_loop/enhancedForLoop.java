package Day_19_Arrays_for_each_loop;

public class enhancedForLoop {
    public static void main(String[]args){
        int [] nums = {43,66,93,57,21};
           // older for loop
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
           // new enhanced for loop
            // or else for each loop

        System.out.println("Numbers in num ");
        for (int num: nums){
            System.out.println(num);

        }
    }
}
