/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**
 * This class takes Enum input from the user
 * and calls a method to print the name of the day.
 * @author dhairyaarora
 * jn 22nd
 */
public class Days {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN) in enum format:");
        
        try {
            // Reading enum input
            Weekdays.Day day = Weekdays.Day.valueOf(in.next().toUpperCase());
            Weekdays t = new Weekdays();
            t.nameOfDay(day);

            // Print all days
            System.out.println("All days of the week:");
            for (Weekdays.Day d : Weekdays.Day.values()) {
                System.out.println(d);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please enter a valid day number.");
        }
    }
}
