package Day_8;

public class While_vs_do_while {
    public static void main(String[]args){
        int i=1;
        while (i<=5){
            System.out.println(i);
            i++;  // if you forget this then it will move to in infinite loop because 1 remains always 1
        }

        // difference b|w while and do while
        i = 10;
        while(i<5){
            System.out.println(i); // nothing because 10 < 5 --> false
        }

        i=22;
        do {
            System.out.println(i);
        }while(i<5);
    }
}
