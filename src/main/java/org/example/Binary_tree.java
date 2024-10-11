package org.example;

import java.util.Scanner;

import static org.example.Node.sc;

class Node {
    static Scanner sc = new Scanner(System.in);
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Binary_tree {
    private Node root;

    // Method to insert the root node
    public void insert() {
        System.out.println("Enter the root value:");
        int value = sc.nextInt();
        root = new Node(value); // Initialize the root node
        populate(sc, root);
    }

    // Method to populate the tree
    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter the left node of " + node.data + "? (true/false)");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left node of " + node.data + ":");
            Node leftNode = new Node(sc.nextInt());
            node.left = leftNode;
            populate(sc, leftNode);
        }

        System.out.println("Do you want to enter the right node of " + node.data + "? (true/false)");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right node of " + node.data + ":");
            Node rightNode = new Node(sc.nextInt());
            node.right = rightNode;
            populate(sc, rightNode);
        }
    }

    // Method to display the tree
    public void display() {
        display(root, "");
    }

    // Private method for recursive display
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.data);
        display(node.left, indent + "\t");  // Indent for left child
        display(node.right, indent + "\t"); // Indent for right child
    }

    public static void main(String[] args) {

        Binary_tree tree = new Binary_tree();
        tree.insert();  // Start by inserting the root node
        tree.display(); // Display the tree
    }
}
