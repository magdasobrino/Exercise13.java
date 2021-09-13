/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */

import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String FirstName = input.next();
        System.out.println("Hello, " +FirstName+", "+ "nice to meet you!");
    }

}
