package PracticeQna;
import java.util.*;
public class OddEven{
    public static void main(String[] args){
        Scanner take = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = take.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is Even ");
        }else{
                System.out.println("The number is Odd ");
            }
        }

    }