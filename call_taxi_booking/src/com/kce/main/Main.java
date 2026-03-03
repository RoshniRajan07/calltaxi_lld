package com.kce.main;

import com.kce.service.Call_taxiservice;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Call_taxiservice service = new Call_taxiservice();

        while (true) {

            System.out.println("\n1. Book Taxi");
            System.out.println("2. Display");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Customer ID: ");
                int id = sc.nextInt();

                System.out.print("Pickup: ");
                char from = sc.next().toUpperCase().charAt(0);

                System.out.print("Drop: ");
                char to = sc.next().toUpperCase().charAt(0);

                System.out.print("Pickup Time: ");
                int time = sc.nextInt();

                service.bookTaxi(id, from, to, time);

            } else if (choice == 2) {

                service.display();

            } else {
                break;
            }
        }
    }
}