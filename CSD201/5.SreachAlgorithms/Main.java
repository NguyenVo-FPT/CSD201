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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[9];
        arr[0] = 10;
        arr[1] = 9;
        arr[2] = 20;
        arr[3] = 30;
        arr[4] = 15;
        arr[5] = 14;
        arr[6] = 16;
        arr[7] = 0;
        arr[8] = 2;

        Sreach s = new Sreach();
        int result; 
        //result = s.linearSreach(arr,1);
        result = s.binarySreach(arr, 15);
        
        System.out.println(result);
    }
}
