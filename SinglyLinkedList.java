package com.example;
public class SinglyLinkedList {
    private Node head;  // Head (first node) of the list

    // Constructor to initialize an empty list
    public SinglyLinkedList() {
        this.head = null;
    }

    // Add a node to the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add a node to the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Add a node at a specific position (0-based index)
    public void addAtPosition(int data, int position) {
        if (position == 0) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.println("Position out of bounds");
            }
        }
    }

    // Remove a node by value
    public void removeByValue(int value) {
        if (head == null) return;

        // If the node to be deleted is the head
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Value not found in the list");
        }
    }

    // Remove a node by position
    public void removeByPosition(int position) {
        if (head == null) return;

        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Position out of bounds");
        }
    }

    // Find the size of the list
    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Traverse the list and display the data
    public void traverse() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Search for a specific element and return its position
    public int search(int value) {
        Node temp = head;
        int position = 0;

        while (temp != null) {
            if (temp.data == value) {
                return position;
            }
            temp = temp.next;
            position++;
        }

        System.out.println("Element not found in the list.");
        return -1;  // Return -1 if the element is not found
    }

    // Reverse the linked list in place
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}
