package com.alex;

public class Operators {
    public static void main(String[] args) {

        //- +/*
        //comparison > < >= <= ==
        //and or
        System.out.println(10+20);
        String fname="john";
        String lname="kim";
        int age=21;
        String fullname =fname+" "+lname+ "  "+age;
        System.out.println(fullname);

        System.out.println(10/(double)3);
        //casting
        int z=10;
        System.out.println( (double)z   );

        int k= (int)10.99;
        System.out.println(k);

        System.out.println(10>20);
        System.out.println(10<=20);
        System.out.println(10==10.0);
        int j=10;
        double h =10.0;
        System.out.println(j==h);

        String name="jane";
        String jina="jane";
        System.out.println(name==jina);//wrong way
        System.out.println(name.equals(jina));
        System.out.println(name.equalsIgnoreCase(jina));


        System.out.println(1000%44);//modulus

        //and
        System.out.println(100>20 &&"jina".equals("jina"));
        //or
        System.out.println(100>20 ||"jina".equals("jina"));

        System.out.println(10!=20);

        System.out.println(! "kenya".equals("kenya"));



    }
}
