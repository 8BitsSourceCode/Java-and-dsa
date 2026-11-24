package Day_23_Strings_1;

import java.util.Locale;

public class stringsAreImmutalble {
    public static void main(String[]args){
        String name = "java";
        name.toUpperCase();
        System.out.println(name);

//        Because Strings in Java are immutable.
//That means:
//Once a String object is created, its contents cannot be changed.
//Instead:

        String name1 = "java";
        String result = name.toUpperCase();
        System.out.println(result);

    }
}
