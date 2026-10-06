package Day_4;

import org.w3c.dom.ls.LSOutput;

public class AssignmentOperators {
    public static void main(String[] args){
    int x = 10;
    //compound assignment
        x = x + 5;
    //instead we can write

    x += 5;  // 15
    x -= 3;  // 12
    x *= 2;  // 24
    x /= 4;  // 6

        System.out.println(x);
}
}