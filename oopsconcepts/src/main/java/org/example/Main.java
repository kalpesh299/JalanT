package org.example;


import motors.AcMotor;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {

//        AcMotor acMotor=new AcMotor();
//        acMotor.startmotor();
//        acMotor.stopmotor();
        Rectangle rectangle=new Rectangle(10.00,20.00);
      Double area=rectangle.area();
      System.out.print(area);

    }
}