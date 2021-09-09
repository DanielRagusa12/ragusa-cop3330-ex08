package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.util.Calendar;

public class App
{
    public static final double conversion=0.09290304;
    public static void main( String[] args )
    {
        int people;
        int pizza;
        int slices;

        System.out.print("How many people? ");

        Scanner input=new Scanner(System.in);
        people=input.nextInt();

        System.out.print("How many pizzas do you have? ");

        Scanner input2=new Scanner(System.in);
        pizza=input2.nextInt();

        System.out.print("How many slices per pizza? ");

        Scanner input3=new Scanner(System.in);
        slices=input3.nextInt();

        System.out.print((people) +" people with " +(pizza) +" pizzas "+"("+(pizza*slices)+" slices)");

        System.out.print("\nEach person gets " +(pizza*slices/people)+" pieces of pizza.");

        System.out.print("There are " +(pizza*slices%people) + " leftover pieces.");

        
    }
}


