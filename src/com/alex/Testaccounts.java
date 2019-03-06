package com.alex;

public class Testaccounts {
    public static void main(String[] args) {
        Account acc1=new Account("mary","001",3000);
        Account acc2=new Account("mavo","002",7000);
        Account acc3=new Account("maureen","003",10000);
        Account acc4=new Account("miry","004",15000);
        Account acc5=new Account("peter","005",17000);

        System.out.println(acc1.getBalance());
        acc2.setBalance(6500);
        System.out.println(acc2.getBalance());

        acc2.deposite(10000);
        acc2.printdetails();
        acc2.withdraw(300);
        acc2.printdetails();

        String name="john";
        name.toLowerCase();
        //primitive
        int x =10;
        double z=88;
        boolean finished=true;

        Account[] accounts={acc1,acc2,acc3,acc4,acc5};

        for (Account k:accounts
             ) {
            k.deposite(5000);
            k.withdraw(100);
            k.printdetails();
        }
    }
}
