package Day_24_Strings2;

public class userNameValidation {
    public static void main(String[]args){
        String userName = "Jack1943";

        if (userName.length()>=5){
            System.out.println("Valid UserName");
        }else{
            System.out.println("UserName is too short");
        }
    }
}
