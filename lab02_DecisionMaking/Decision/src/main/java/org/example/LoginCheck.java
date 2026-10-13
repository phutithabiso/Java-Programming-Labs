package org.example;

public class LoginCheck {
    static void login(String user, String pass){
       IO.println("Enter username: ");
        String username =IO.readln();
        IO.println("Enter username: ");
        String password =IO.readln();

        if(user.equals(username) && password.equals(pass)){
            IO.println("Login Successful");
        }
        else {
            IO.println("Login Failed");
        }
    }
}
