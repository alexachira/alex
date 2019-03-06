package com.alex;

public class Conditions {
    public static void main(String[] args) {
        int age = 51;
        if (age < 15) {
            System.out.println("you are a kid");
        }
        else if (age >= 15 && age <= 19) {
            System.out.println("you are a teen");
        }
        else if (age >= 20 && age <= 35) {
            System.out.println("you are a youth");
        }
        else if (age >= 35 && age <= 55) {
            System.out.println("you are a middle age");
        }

            System.out.println("you are a old");


    }
}
