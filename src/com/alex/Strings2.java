package com.alex;

public class Strings2 {
    public static void main(String[] args) {
        String mpesa = "NBS12MTPK confirmed .ksh60000.00 sent to tom matata  +254923456789 on 28/2/19 at 10pm .new mpesa balance is ksh 3400. transaction cost,ksh 15.00";

        int pos_ksh=mpesa.indexOf("ksh");
        int pos_sent=mpesa.indexOf("sent");
        String amount=mpesa.substring(pos_ksh,pos_sent);
        System.out.println(amount);


        int pos_on=mpesa.indexOf("on ") +3;
        int pos_at=mpesa.indexOf(" at");
        String date=mpesa.substring(pos_on,pos_at);
        System.out.println(date);


        int pos_balance=mpesa.indexOf("balance") +14;
        int pos_transaction=mpesa.indexOf("transaction");
        String balance=mpesa.substring(pos_balance,pos_transaction);
        System.out.println(balance);








    }


}
