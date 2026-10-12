package Day_6;

public class Challenge1 {
    public static void main(String[] args){
        int x = 5;
        int y = x++;
        int z = ++x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

//        Step	   Code	            What happens	              Value
//        1	    int x = 5;	    Set x to 5	                       x = 5
//        2	    int y = x++;	y gets 5, then x becomes 6	    y = 5, x = 6
//        3	    int z = ++x;	x becomes 7, then z gets 7	    z = 7, x = 7

        // output = 7
        //          5
         //         7

    }
}
