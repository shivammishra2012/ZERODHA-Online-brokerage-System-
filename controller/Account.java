package controller;

import entity.AccountStatus;

public abstract class Account {

   private  int id;
   private String name;
   private String email;
   private String phone;

    private AccountStatus status;

   public abstract boolean resetPassword();

}
