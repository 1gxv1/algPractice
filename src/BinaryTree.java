/* The class "Node" contains three attributes and one function.
 The attributes represent the value stored in a binary tree node, its left child, and its right child,
 respectively. The function creates a node.*/

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

/*The class "Binary" has a "Node" attribute and several functions that maintain the structure of a binary search tree.
It provides functionality for inserting nodes into the tree, searching for nodes, and performing ordered traversal.*/
class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    /* This function returns the newly created node and inserts the new node into the appropriate position in the binary search tree. */
    public void insert(int data) {
        root = insertRec(root, data);
    }

    /* Implement recursion to traverse a binary tree by recursively finding the appropriate place to insert a new node,
     then terminating the recursion after insertion, and finally returning the root of the binary tree with the newly added node. */
    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    //To determine if the value of a binary tree node is equal to a given value.
    public boolean search(int data) {
        return searchRec(root, data);
    }

    //Traversing a binary tree recursively where, when data < node.data, you traverse the left subtree, when data > node.data,
    // you traverse the right subtree, and when data = node.data, you terminate the recursion and return true.
    // If you reach a null node, you return false.
    public boolean searchRec(Node root, int data) {
        if (root == null) return false;
        if (root.data == data) return true;
        else if (data < root.data) return searchRec(root.left, data);
        else return searchRec(root.right, data);
    }

    //Traversing the current binary search tree in an in-order traversal manner and outputting it results in a sorted order from smallest to largest.
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    private void reverseOrderRec(Node root) {
        if (root != null) {
            reverseOrderRec(root.right);
            System.out.print(root.data + " ");
            reverseOrderRec(root.left);
        }
    }

    // Lab date: 31 August 2023
    // Reporting date: 31 August 2023
    // The inputs of this code:5 4 9 8 1 7 6
    // The outputs of this code:

    /**
     * please input numbers to create a binaryTree:
     * 5 4 9 8 1 7 6
     * Inorder Traversal:
     * 1 4 5 6 7 8 9
     * reverseOrder Traversal:
     * 9 8 7 6 5 4 1
     * 4 is present in the tree.
     **/
    // New functions: reverseOrderRec()
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input numbers to create a binaryTree:");
        String userInput = scanner.nextLine();
        String[] numbers = userInput.split(" ");
        for (String number : numbers) {
            tree.insert(Integer.parseInt(number));
        }
        scanner.close();
        System.out.println("Inorder Traversal:");
        tree.inorderRec(tree.root);
        System.out.println();
        System.out.println("reverseOrder Traversal:");
        tree.reverseOrderRec(tree.root);
        int searchKey = 4;
        if (tree.search(searchKey)) {
            System.out.println("\n" + searchKey + " is present in the tree.");
        } else {
            System.out.println("\n" + searchKey + " is not present in the tree.");
        }
    }

}