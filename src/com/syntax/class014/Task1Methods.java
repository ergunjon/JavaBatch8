package com.syntax.class014;

import java.util.Scanner;

public class Task1Methods {
    public static void main(String[] args) {
        //Accept username, password and confirm password from a user and check following requirements:
        //Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        //Password should be minimum 8 characters, if less → message=”Password is too short”.
        //Password cannot contain username if so, → message=”Password cannot contain username”.
        //Password should match confirmed password, if not  → message=“Passwords do not match”.
        //Only after all requirements met → message “Your username and password has been created”

        String username = null;
        String password;
        int minimum=7;
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your username");
        username= scan.nextLine();
        System.out.println("please enter your password");
        password=scan.nextLine();
        if(username.isEmpty() || password.isEmpty()){
            System.out.println("password can not be empty");
        }else if(password.length()<minimum){
            System.out.println("password too short");
        } else if (password.contains(username)) {
            System.out.println("password can not contain username");
        }else if(!password.equals(password)){
            System.out.println("password does not match");
        }else{
            System.out.println("username and password created");
        }
    }
    }




