package Day_22_Strings;

public class startWithEndWith {
    public static void main(String[]args){
        String filename = "photo.jpg";

        System.out.println(filename.startsWith("photo"));
        System.out.println(filename.endsWith(".jpg"));

        // Output:
        //true
        //true
        //Real-world examples:
        //https://
        //.pdf
        //.jpg
        //@gmail.com
    }
}
