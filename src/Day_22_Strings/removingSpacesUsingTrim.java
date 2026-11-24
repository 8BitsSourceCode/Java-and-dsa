package Day_22_Strings;

public class removingSpacesUsingTrim {
    public static void main(String[]args){
        String language = "   Java  ";
        System.out.println(language);
        System.out.println(language.trim());  // it will remove the spaces


        //  Suppose user enters:
        //"   Java   "
        //You may want:
        //"Java"
        // This is useful when processing user input.
    }
}
