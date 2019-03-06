package com.alex;

public class Account {
    private String name;
    private String accnumber;
    private double balance;

    //constructor==function set up data

    public Account(String name, String accnumber, double balance) {
        this.name = name;
        this.accnumber = accnumber;
        this.balance = balance;

    }

    public Account(String name, String accnumber, String balance) {
    }
    //getters and setters==functions

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccnumber() {
        return accnumber;
    }

    public void setAccnumber(String accnumber) {
        this.accnumber = accnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void  deposite(double amount)
    {
     this.balance+=amount;
    }
    public void  withdraw(double amount)
    {
      if (this.balance>amount)
      {
          this.balance-=amount;
      }else
      {
          System.out.println("insufficient balance.");
      }
    }
    public void  printdetails(){
        System.out.println("-----------------");
        System.out.println("accnumber:"+this .accnumber);
        System.out.println("balance:"+this.balance);

        System.out.println("-----------------");


    }
}
