package com.alex;

public class Functions {
    //access modifiers
    private  double volumesphere(double radius) {
        double volume =22/7.0 *Math.pow(radius,3)*4/3.0;
        return volume;

    }
    public static double areacircle(double radius) {
        double area =22/7.0 *radius*radius ;
        System.out.println(area);
        return area;


    }
    public static void main(String[] args) {
        //objects==variables
        Functions f= new Functions();//creat object
        System.out.println(f.volumesphere(7));
        double v = f.volumesphere(11);



     /*  areacircle(7);
       areacircle(14);
       areacircle(10.5);

       double result=areacircle(11.23456);
        System.out.println(Math.round(result));
        System.out.println(result*12);
*/
    }
}
