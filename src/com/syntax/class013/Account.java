package com.syntax.class013;

public class Account {
    String accountId;
    String userName;
    String password;
    double balance;
    String typeofAccount;
    double limit;
    boolean isBlocked;

    //Write a method that takes the amount that user wants to
    //transfer it deducts the amount from your your balance and returns
    //the amount of transfer in case of success or a 0 in case of failure

    boolean login(String UserName, String password){
        if(userName.equals(UserName) && password.equals(password)){
            return true;
        }else{
            return false;
        }


    }
}
