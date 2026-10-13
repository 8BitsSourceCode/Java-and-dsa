package Day_7;

public class Login_1 {
    public static void main(String[] args){
        String userName = "admin";
        String passwd = "2356";

        if (userName.equals("admin") && passwd.equals("2356")){
            System.out.println("Login Successful ");

        }else{
            System.out.println("Login Failed");
        }
    }
}
