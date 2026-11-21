package Day_21_Strings;

public class equalsIgnoreCase {
    public static void main(String[]args){
        String a = "Java";
        String b = "jAva";

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

        //a.equalsIgnoreCase(b)
        Output:
//        true
//        Because it ignores case.
//        Compare:
//        a.equals(b)
//        which would produce:
//        false
    }
}
