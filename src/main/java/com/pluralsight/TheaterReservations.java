package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Prompt for full name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();

        //Prompt for date
        System.out.print ("What date will you be coming (MM/dd/yyy): ");
        String dateInput = scanner.nextLine();

        //Prompt for number of tickets
        System.out.print("How many tickets would you like? ");
        int tickets = scanner.nextInt();

        //Split the full name
        String[] names = fullName.split(" ");
        String firstName = names[0];
        String lastName = names [1];

        //Reformat the date
        String[] dateParts = dateInput.split("/");
        String month = dateParts[0];
        String day = dateParts[1];
        String year = dateParts [2];

        String formattedDate = year + "-" + month + "-"+ day;

        //Handle singular vs plural
        String ticketWord;
        if(tickets == 1){
            ticketWord = "ticket";
        } else {
            ticketWord = "tickets";
        }
        // Print out final message
        System.out.println(tickets + " " + ticketWord + " reserved for " + formattedDate + " under " + lastName + ", " + firstName);

        scanner.close();
    }
}
