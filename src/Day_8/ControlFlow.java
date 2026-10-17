package Day_8;

public class ControlFlow {
    public static void main(String[]args){
        System.out.println("Break Statement");
            for (int i = 1;i<=5;i++){
                if (i ==3){      // terminate the loop on the spot
                    break;// stop a loop immediately.
                }
                System.out.println(i);
            }
        System.out.println("Continue Statement");
            for (int j = 1;j<=5;j++){
                if(j==3){
                    continue;  // this will skip the current i value like i==3 skip 3
                }//Skip the current iteration and continue with the next one.
        System.out.println(j);
            }
    }
}
