package com.syntax.class015;

import java.util.Scanner;

public class Task1Recap {
    public static void main(String[] args) {
        //Accept username, password and confirm password from a user and check following requirements:
        //Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        //Password should be minimum 8 characters, if less → message=”Password is too short”.
        //Password cannot contain username if so, → message=”Password cannot contain username”.
        //Password should match confirmed password, if not  → message=“Passwords do not match”.
        //Only after all requirements met → message “Your username and password has been created”

        String username;
        String password;
        String confirmedPassword;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter username");
        username = scanner.nextLine();
        System.out.println("Please enter password");
        password = scanner.nextLine();
        System.out.println("Please confirmed password");
        confirmedPassword = scanner.next();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("username and password can not be empty");
        } else {
            if (username.length() < 8) {
                System.out.println("Password is too short");
            } else {
                if (password.contains(username)) {
                    System.out.println("Password cannot contain Username");
                } else {
                    if (!password.equals(confirmedPassword)) {
                        System.out.println("Password do not match");

                    } else {
                        System.out.println("Your username and password has been created");
                    }

                }
            }
        }
    }
}
