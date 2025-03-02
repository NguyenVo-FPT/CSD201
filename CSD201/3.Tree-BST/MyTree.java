
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nguye
 */
public class MyTree {

    public Node root;

    public MyTree() {
        root = null;
    }

    public MyTree(Node root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        
        inOrder(root.left);
        System.out.println(root.value + " ");
        inOrder(root.right);
    }
    
    public void postOrder(Node root) {
        if (root == null) {
            return;
        }
        
        inOrder(root.left);
        inOrder(root.right);
        System.out.println(root.value);
    }
    
    public void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while (!q.isEmpty()) {
            if (q.peek() == null) {
                return;
            }
            q.offer(q.peek().left);
            q.offer(q.peek().right);
            Node temp = q.poll();
            System.out.println(temp.value);
        }
    }
}
