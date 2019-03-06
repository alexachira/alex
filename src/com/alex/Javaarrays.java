package com.alex;

public class Javaarrays {
    public static void main(String[] args) {
        int marks[]={78,67,56,45,34,23,12,50,60,70,80};
        //immutable
        //arraylist
        String names[]={"kim","finto","andawa","peter"};
        System.out.println(marks[0]);
        try{
            System.out.println(names[10]);
        }
       catch (Exception e)
       {
           System.out.println("error while fetching the name");
       }



    }
}
