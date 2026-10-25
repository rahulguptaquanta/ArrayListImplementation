package com.internship.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\nArrayList Implementation");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Search item");
            System.out.println("4. Display all items");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter a string to add: ");
                    String itemToAdd = scanner.nextLine();
                    items.add(itemToAdd);
                    System.out.println("Item added successfully.");
                    break;
                case "2":
                    System.out.print("Enter the string to remove: ");
                    String itemToRemove = scanner.nextLine();
                    if (items.remove(itemToRemove)) {
                        System.out.println("Item removed successfully.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case "3":
                    System.out.print("Enter the string to search: ");
                    String itemToSearch = scanner.nextLine();
                    int index = items.indexOf(itemToSearch);
                    if (index >= 0) {
                        System.out.println("Item found at index " + index + ".");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case "4":
                    if (items.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("Items in the list:");
                        for (int i = 0; i < items.size(); i++) {
                            System.out.println(i + ": " + items.get(i));
                        }
                    }
                    break;
                case "5":
                    running = false;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1 to 5.");
            }
        }

        scanner.close();
    }
}
