package Day_24_Strings2;

public class reversingAstring {
    public static void main(String[]args){
        String name = "java";
        for (int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }

//        Output:
//avaj
//Notice how we’re using our previous knowledge:
//String
//+
//length()
//+
//charAt()
//+
//for loop
//This is exactly how concepts begin connecting together.
    }
}
