/**
 * This is a simple tutorial java program for explaining the Binary Search Tree
 * Program can be executed by running the below main method.
 *
 * @author  shaikficus
 * @version 1.0
 * @since   2019-10-18
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * Binary Search Tree
 * Description: Binary Search Tree the nodes on the left side will have the value less than or equal to the values of parent/root node and
 * values in the right side nodes will be always greater or equal to the values of parent/root node
 * Below is the example of Binary Tree
 *                   6
 *                /   \
 *               3     10
 *             /  \    / \
 *            2    5  21  50
 * Below class explains how to add, traverse, delete node, check node in the tree.
 */
public class BinarySearchTree {

    Node rootNode;

    public void add(int value) {
        rootNode = addRecusriveNode(rootNode, value);
    }

    public boolean checkNode(int value) {
        return checkNodeInTree(rootNode, value);
    }

    public void deleteNode(int value) {
        rootNode = deleteNodeInTree(rootNode, value);
    }

    /**
     * Add node to the Binary tree. Method makes self call (Recursive) for adding values to the tree.
     * If new value is greater than the current node value node will be assigned to right side.
     * If new value is less than the current node value node will be assigned to left side.
     * @param currentNode
     * @param value
     * @return
     */
    private Node addRecusriveNode(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }
        if (value < currentNode.nodeValue) {
            currentNode.leftNode = addRecusriveNode(currentNode.leftNode, value);
        } else if (value > currentNode.nodeValue) {
            currentNode.rightNode = addRecusriveNode(currentNode.rightNode, value);

        } else {
            return currentNode;
        }
        return currentNode;
    }

    /**
     * Methods makes a self call (recursive) to identify whether the given values exists or not in the tree
     * @param currentNode
     * @param value
     * @return
     */
    private boolean checkNodeInTree(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }
        if (value == currentNode.nodeValue) {
            return true;
        }
        return value < currentNode.nodeValue ? checkNodeInTree(currentNode.leftNode, value) : checkNodeInTree(currentNode.rightNode, value);
    }

    /**
     * Verifies and deletes the node in the tree.
     * Cases:
     * a) Node without leafs/children - Node will be replaced with null
     * b) Node with one leaf/child - Parent will be replaced with the child
     * c) Node with two leafs/children - Tree will be modified smallest node will replace the parent node and deletion will happen from right side.
     * @param currentNode
     * @param value
     * @return
     */
    private Node deleteNodeInTree(Node currentNode, int value) {
        if (currentNode == null) {
            return null;
        }
        if (value == currentNode.nodeValue) {
            if (currentNode.rightNode == null && currentNode.leftNode == null) {
                return null;
            }
            if (currentNode.rightNode == null) {
                return currentNode.leftNode;
            }
            if (currentNode.leftNode == null) {
                return currentNode.rightNode;
            }
            int smallestNodeValue = findSmallestNode(currentNode.rightNode);
            currentNode.nodeValue = smallestNodeValue;
            currentNode.rightNode = deleteNodeInTree(currentNode.rightNode, smallestNodeValue);
        }
        if (value < currentNode.nodeValue) {
            currentNode.leftNode = deleteNodeInTree(currentNode.leftNode, value);
            return currentNode;
        }
        currentNode.rightNode = deleteNodeInTree(currentNode.rightNode, value);
        return currentNode;
    }

    /**
     * Find the smallest value for the node - used for case (c)
     * @param root
     * @return
     */
    private int findSmallestNode(Node root) {
        return root.leftNode == null ? root.nodeValue : findSmallestNode(root.leftNode);
    }

    /**
     * Traverse and print node values of all left, root and all right nodes
     * @param node
     */
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.leftNode);
            System.out.println(" " + node.nodeValue);
            traverseInOrder(node.rightNode);
        }
    }

    /**
     * Traverse and print node values of  root, all left and all right nodes
     * @param node
     */
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.println(" " + node.nodeValue);
            traversePreOrder(node.leftNode);
            traversePreOrder(node.rightNode);
        }
    }

    /**
     * Traverse and print node values of   all left , all right and root nodes.
     * @param node
     */
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.leftNode);
            traversePostOrder(node.rightNode);
            System.out.println(" " + node.nodeValue);
        }
    }

    /**
     * Print all levels one by one in sequential manner
     */
    public void traverseLevelOrder() {
        if (rootNode == null) {
            return;
        }
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(rootNode);
        while (!nodes.isEmpty()) {
            Node node = nodes.remove();
            System.out.println(" " + node.nodeValue);
            if (node.leftNode != null) {
                nodes.add(node.leftNode);
            }
            if (node.rightNode != null) {
                nodes.add(node.rightNode);
            }
        }
    }

    /**
     * Auxiliary class that represents the node and its child
     */
    class Node {
        int nodeValue;
        Node leftNode;
        Node rightNode;

        /**
         * Constructor to add node value and initialize root node
         * @param nodeValue
         */
        Node(int nodeValue) {
            this.nodeValue = nodeValue;
            leftNode = null;
            rightNode = null;
        }
    }

    /**
     * Unit Test: Method to create tree
     * @return Tree with values
     */
    private static BinarySearchTree createBinaryTree() {
        System.out.println("Creating tree with value 6,3,10,5,,2,21,50");
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(6);
        bst.add(3);
        bst.add(10);
        bst.add(5);
        bst.add(2);
        bst.add(21);
        bst.add(50);
        return bst;
    }

    /**
     * Main method for unit testing the Binary Search Tree
     * @param args
     */
    public static void main(String[] args) {
        //Create Binary Search Tree
        BinarySearchTree bs = createBinaryTree();
        //Check for a value in the tree
        boolean b = bs.checkNode(10);
        System.out.println("Does value: 10 exists in the tree? "+b);
        //Print node values in in-order
        System.out.println("***Printing node values in in-order***");
        bs.traverseInOrder(bs.rootNode);

        //Print node values in pre-order
        System.out.println("***Printing node values in Pre-Order***");
        bs.traversePreOrder(bs.rootNode);

        //Print node values in post-order
        System.out.println("***Printing node values in Post-Order***");
        bs.traversePostOrder(bs.rootNode);

        //Print node values in sequential Manner
        System.out.println("***Printing node values in Sequential Manner***");
        bs.traverseLevelOrder();

        //Delete a node/value from tree
        bs.deleteNode(10); //Test the delete at the end of process
        b = bs.checkNode(10);
        System.out.println("Does value:10 exists in the tree? "+b);

    }
}
