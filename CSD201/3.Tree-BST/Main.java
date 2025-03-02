
/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
        Node firstNode = new Node(10);
        Node secondNode = new Node(8);
        Node thirdNode = new Node(15);
        Node forthNode = new Node(13);
        Node fifthNode = new Node(12);
        Node sixthNode = new Node(14);
        Node seventhNode = new Node(22);
        Node eightNode = new Node(21);
        Node ninethNode = new Node(24);
        
        MyTree binaryTree = new MyTree();
        binaryTree.root = firstNode;
        binaryTree.root.left = secondNode;
        binaryTree.root.right = thirdNode;
        binaryTree.root.left.left = forthNode;
        binaryTree.root.right.left = fifthNode;
        binaryTree.root.right.right = sixthNode;
        
        BinarySearchTree bst = new BinarySearchTree();
        //bst.root = fifthNode;
//        bst.root.left = secondNode;
//        bst.root.right = thirdNode;
//        bst.root.left.left = forthNode;
//        bst.root.right.left = fifthNode;
//        bst.root.right.right = sixthNode;
        //binaryTree.preOrder(binaryTree.root);
        //binaryTree.inOrder(binaryTree.root);
        //binaryTree.postOrder(binaryTree.root);
        //binaryTree.levelOrder(binaryTree.root);
        
        bst.insert(10);
        bst.insert(15);
        bst.insert(8);
        bst.insert(13);
        bst.insert(12);
        bst.insert(14);
        bst.insert(22);
        bst.insert(21);
        bst.insert(24);
        binaryTree.preOrder(bst.root);
        bst.search(22);
        bst.delete(22);
        bst.search(22);
    }
    
}
