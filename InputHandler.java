package com.example;
import java.util.Scanner;

public class InputHandler {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, data, position;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add to beginning");
            System.out.println("2. Add to end");
            System.out.println("3. Add at position");
            System.out.println("4. Remove by value");
            System.out.println("5. Remove by position");
            System.out.println("6. Display list");
            System.out.println("7. Search for element");
            System.out.println("8. Reverse the list");
            System.out.println("9. List size");
            System.out.println("10. Check if empty");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    data = scanner.nextInt();
                    list.addFirst(data);
                    break;
                case 2:
                    System.out.print("Enter value to add: ");
                    data = scanner.nextInt();
                    list.addLast(data);
                    break;
                case 3:
                    System.out.print("Enter value to add: ");
                    data = scanner.nextInt();
                    System.out.print("Enter position: ");
                    position = scanner.nextInt();
                    list.addAtPosition(data, position);
                    break;
                case 4:
                    System.out.print("Enter value to remove: ");
                    data = scanner.nextInt();
                    list.removeByValue(data);
                    break;
                case 5:
                    System.out.print("Enter position to remove: ");
                    position = scanner.nextInt();
                    list.removeByPosition(position);
                    break;
                case 6:
                    list.traverse();
                    break;
                case 7:
                    System.out.print("Enter element to search: ");
                    data = scanner.nextInt();
                    int pos = list.search(data);
                    if (pos != -1) {
                        System.out.println("Element found at position: " + pos);
                    }
                    break;
                case 8:
                    list.reverse();
                    System.out.println("List reversed.");
                    break;
                case 9:
                    System.out.println("List size: " + list.size());
                    break;
                case 10:
                    System.out.println("Is list empty? " + list.isEmpty());
                    break;
                case 11:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 11);

        scanner.close();
    }
}
