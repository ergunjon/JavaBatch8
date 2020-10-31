package com.syntax.class013;

public class BankApplication {
    public static void main(String[] args) {
        Account IlhansAccount = new Account();
        IlhansAccount.accountId = "123";
        IlhansAccount.userName = "Ilhan";
        IlhansAccount.password = "pass123";
        IlhansAccount.balance = 100000;
        IlhansAccount.typeofAccount = "checking";
        IlhansAccount.limit = 125;

        boolean isLoggedIn = IlhansAccount.login("Ilhan","pass123");

        if(isLoggedIn){
            System.out.println("Welcome to Syntax bank");
        }else{
            System.out.println("Invalid user name or password");
        }




        Account AlexsAccount = new Account();
        AlexsAccount.accountId = "125";
        AlexsAccount.userName = "Alex";
        AlexsAccount.password = "pass123";
        AlexsAccount.balance = 150000;
        AlexsAccount.typeofAccount = "savings";
        AlexsAccount.limit = 100;

    }
    }


