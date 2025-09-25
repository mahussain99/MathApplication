package com.pluralsight;

import java.math.RoundingMode;
import java.sql.SQLOutput;

public class MathApp {
    public static void main(String[] args) {
        System.out.println("Step 1");
        System.out.println("Representing the salary for Bob and Gary");
        System.out.println(" ");

// 1. # 1. Question and Answer
        System.out.println(" # 1. Question and Answer");
        String First_name = "Bob ";
        String Last_Name = "Joe";
        String Full_Name = (First_name+Last_Name);
        double bobSalary = 80500.99;
        System.out.println("His Full name is: " + Full_Name);
        System.out.println("His yearly salary is: $" + bobSalary);
        String FirstName = "Gray ";
        String LastName = "John";
        String FullName = (FirstName+LastName);
        double garySalary = 90500.99;

        System.out.println("His Full name is: " + FullName);
        System.out.println("His yearly salary is: $" + garySalary);

        double highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is paying: $" + highestSalary);
        System.out.println("==================================================");

        System.out.println("2. Question and Answer");
// # 2. Question and Answer
        double carPrice = 65000.99;
        double truckPrice = 95000.00;
        double Min_price = Math.min(carPrice,truckPrice);
        System.out.println("The minimum price is: $" + Min_price);

        System.out.println("==================================================");
        System.out.println("3. Question and Answer");
        double circle_radius = 7.25;
        double area = Math.PI* Math.pow(circle_radius,2);
        System.out.println("The area in the circle is: "+ area);

        System.out.println("==================================================");
        System.out.println("4. Question and Answer");

        double Number = 5;
        double Sqr = Math.sqrt(Number);
        System.out.println("The square root of " + Number + " is a:" + Sqr );

        System.out.println("==================================================");
        System.out.println("5. Question and Answer");

        int x1 =  5, x2 = 85, y1 = 10, y2 = 50;
        double Distance = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        System.out.println("The distance between point is: " + Distance);

        System.out.println("==================================================");
        System.out.println("6 Question and Answer");

        double Current_Number = -3.8;
        double Display_Positive = Math.abs(Current_Number);
        System.out.println("The positive values is: " + Display_Positive);

        System.out.println("==================================================");
        System.out.println("7 Question and Answer");

       // random number BETWEEN 0 AND 1
        double random_number = Math.random( );
        System.out.println("The random number is: " + random_number);

        System.out.println("==================================================");
        System.out.println("8 Question and Answer");

        int Days = 24;
        int One_Day = 24;
        int one_hour = 60;
        int Total_Days = (Days*One_Day);
        int Total_Minutes = (one_hour*Total_Days);
        System.out.println(Total_Minutes);
        System.out.println(Total_Days);




    }



    }

