package class12;

public class Task {
    public static void main(String[] args) {
        String username="forexample";
        String password="pass1234567";
        String confirmyourpassword="pass1234567";

        if (username.isEmpty() && password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        } else if (password.length()<8){
            System.out.println("Password is too short");
        }else if (password.contains(username)){
            System.out.println("Password cannot contain username");
        }else if (!password.equals(confirmyourpassword)){
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }


    }
}
