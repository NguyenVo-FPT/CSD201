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
    public static void main(String[] args) {
        MaxHeap mh = new MaxHeap(5);
        mh.insert(10);
        mh.insert(12);
        mh.insert(20);
        mh.insert(7);
        mh.insert(9);
        
        mh.printHeap();
        mh.delete();
        mh.printHeap();
    }

}
