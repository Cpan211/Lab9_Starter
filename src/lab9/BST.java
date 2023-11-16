package lab9;

import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author chris
 */
public class BST {

    Node root;

    public BST(int key) {
        root = new Node(key);
    }

    public BST() {
        root = null;
    }

    // a new node with given key in BST
    public Node insert(Node node, int key) {
        // If the tree is empty, return a new node
        if (node == null) {
            node = new Node(key);
            return node;
        }

        // Otherwise, recur down the tree
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }

        // Return the (unchanged) node pointer
        return node;
    }
    
//    // Traverse Inorder--> Uses Recursion -- You are asked to provide an iterative solution using a stack
//    public void traverseInOrder(Node node) {
//        if (node != null) {
//            traverseInOrder(node.left);
//            System.out.print(" " + node.key);
//            traverseInOrder(node.right);
//        }
//    }
    

    private class Node {

        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    


}
