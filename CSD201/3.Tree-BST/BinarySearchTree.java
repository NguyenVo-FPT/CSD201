/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public Node insert(Node root, int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return root;
        }   
        
        if (value > root.value) {
            root.right = insert(root.right, value);
        } else {
            root.left = insert(root.left, value);
        }

        return root;
    }

    public boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (key == root.value) {
            return true;
        }

        if (key < root.value) {
            return search(root.left, key);
        }

        if (key > root.value) {
            return search(root.right, key);
        }
        return true;
    }
    
    public void search(int value) {
       System.out.println(search(root, value));
    }
    
    public boolean isValid(Node root, int lower, int upper){
        if (root == null) {
            return true;
        }
        
        if (root.value  <= lower || root.value >= upper) {
            return false;
        }
        
        boolean left  = isValid(root.left, lower, root.value);
        if (left == true) {
            boolean right = isValid(root.right, root.value, upper);
            return right;
        }
        return false;
    }
    
    public Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key > root.value) {
            root.right = delete(root.right, key);
        }
        else if (key < root.value) {
            root.left = delete(root.left, key);
        }
        else{
            // infertility
//            if (root.left == null && root.right == null) {
//               return null; 
//            }
            
            // chinese policy
            if (root.left == null) {
                return root.right;
            }
            
            if (root.right == null) {
                return root.left;
            }
            
            // two finacial burden
            root.value = this.minValue(root.right);
            root.right = delete(root.right, root.value);
        }
        return root;
    }
    
    private int minValue(Node root) {
        int min = root.value;
        while (root.left != null) {
            root = root.left; 
            min = root.value;
        }
        return min;
    }
    
    public void delete(int key) {
        delete(root, key);
    }
}