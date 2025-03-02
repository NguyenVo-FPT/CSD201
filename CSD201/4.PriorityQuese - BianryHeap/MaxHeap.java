/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class MaxHeap {
    private Integer[] heap;
    private int size;

    public MaxHeap(int capacity) {
        this.heap = new Integer[capacity + 1];
        this.size = 0;
    }
    
    public boolean isEmty(){
        return size == 0;
    }
    
    public void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
    
    public void swim(int k) {
        while (k > 1 && heap[k] > heap[k/2]) {
            swap(k,k/2);
            k = k/2;
        }
    }
    
    public void resize(int size) {
        Integer[] temp = new Integer[size];
        for (int i = 1; i < heap.length; i++) {
            temp[i] = heap[i]; 
        }
        
        heap = temp;
    }
    
    public void insert(int key) {
        if (size >= heap.length) {
            resize(heap.length*2);
        }
        size++;
        heap[size] = key;
        swim(size);
    }
    
    public void sink(int k){
        while(2*k <= size) {
            if (2*k == size) {
                if (heap[k] < heap [2*k]) {
                    swap(k, 2*k);
                }
                else
                    return;
            }
            else {
                if (heap[k] < heap[2*k] || heap[k] < heap[2*k + 1])
                if (heap[2*k] > heap[2*k + 1]){
                    swap(1, 2*k + 1);
                    k = 2*k;
                    continue;
                }
                if (2*k < 2*k + 1){
                    swap(1, 2*k + 1);
                    k = 2*k + 1;
                    continue;
                }
            }
        }
    }

    public int delete(){
        if (isEmty()) {
           System.out.println("Queue is Empty");
        }

        int max = this.heap[1];
        this.swap(1, size);
        size--;
        sink(1);
        return max;
    }

    
    public void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println("\n");
    }
}
