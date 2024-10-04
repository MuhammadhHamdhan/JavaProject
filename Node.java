package com.example;
public class Node {
    int data;          // Data stored in the node
    Node next;         // Reference to the next node

    // Constructor to initialize node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
