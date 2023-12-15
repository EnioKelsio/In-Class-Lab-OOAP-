/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

import java.util.Scanner;

/**
 *
 * @author Helder Camara
// This class runs the soccer simulation
public class SoccerSimulator {
    // These are the instance variables for the class
    private int option;
    private boolean exit;
    private Scanner sc;

    // This is the constructor for the class
    public SoccerSimulator() {
        this.sc = new Scanner(System.in);
    }

    // This method runs the soccer simulation
    public void runSimulator() {
        do {
            // Print the menu options
            System.out.println("Welcome! What would you like to do today? Please enter the number corresponding to your choice.");
            System.out.println("1. Enter a new player to a team.");
            System.out.println("2. See the players on a team.");
            System.out.println("3. Simulate a number of matches.");
            System.out.println("4. Exit the programme.");            
            try {
                // Get the user's choice
                option = Integer.parseInt(sc.nextLine());
                if (option == 1) {
                    // Add your code here
                }
            } catch (NumberFormatException e) {
                // Print an error message for invalid input
                System.out.println("Invalid input. Please try again.");
            }
        } while (!exit);
    }
}


