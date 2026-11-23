package Day_22;

public class substringsInJava {
    public static void main(String[]args){
        // Sometimes we need only part of a String.
        String name = "Programming";
        System.out.println(name.substring(0 ,5));


        String city = "Hyderabad";
        for (int i=0;i<5;i++) {
            System.out.println(city.charAt(i));
        }
    }
}
