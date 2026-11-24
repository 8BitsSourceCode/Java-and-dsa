package Day_23_Strings_1;

public class loop_Strings {
    public static void main(String[]args){
        // We want to count how many times 'a' appears.
        String name = "java";
        int count = 0;

        for (int i=0;i<name.length();i++){
            if(name.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);

        // Output:
        //2
        //Let’s dry-run it.
        //Java
        //↑
        //Characters:
        //J → not a
        //a → count = 1
        //v → not a
        //a → count = 2
        //Final:
        //count = 2
    }
}
