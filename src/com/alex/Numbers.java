package com.alex;

public class Numbers {
    public static void main(String[] args) {
        double x=50.50;
        System.out.println(Math.sqrt(x));
        double result= Math.sqrt(x);
        System.out.println(Math.round(result));
        double r=Math.round(Math.sqrt(x));

        double z= Math.pow(x,2);
        System.out.println(x+"power is"+z);

        //round downwords
        System.out.println(Math.floor(x));
        //round upwords
        System.out.println(Math.ceil(x));
    }
}
