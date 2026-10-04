package Day_2;
import java.util.*;
public class IfElse {
    public static void main(String[]args){
        System.out.println("working with if-else statements");
        Scanner take = new Scanner(System.in);
        System.out.print("What is your current Age ?");
        int num1 = take.nextInt();
        if(num1 >= 18) {
            System.out.print("You are eligible to vote");
        }else
            {
                System.out.println("You are not adult you cannot vote");
            }
            }
        }

