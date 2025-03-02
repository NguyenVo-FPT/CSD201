
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nguye
 */
public class Main {

//    public static boolean checkParenlusis(String s) {
//        Stack myStack = new Stack();
//        char[] c = s.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            if (c[i] == '{' || c[i] == '[' || c[i] == '(') {
//                myStack.push(c[i]);
//            }
//            
//            if (myStack.isEmpty()) return false;
//            
//            if (myStack.peak().value == '{' && c[i] == '}') {
//                myStack.pop();
//            } else if (myStack.peak().value == '[' && c[i] == ']') {
//                myStack.pop();
//            } else if (myStack.peak().value == '(' && c[i] == ')') {
//                myStack.pop();
//            }
//        }
//        
//        return myStack.isEmpty();
//    }
    
//    public static String[] printBinaryNumber(int number) {
//        Queue myQueue = new Queue();
//        String[] result = new String[number];
//        myQueue.enqueue("1");
//        
//        for (int i = 0; i < number; i++) {
//            String num = myQueue.dequeue().value;
//            result[i] = num;
//            myQueue.enqueue(num + "0");
//            myQueue.enqueue(num + "1");
//        }
//        return result;
//    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
//        for (String s : printBinaryNumber(number)) {
//            System.out.print(s + " ");
//        }
    }

}
