import java.util.Arrays;

public class Sreach {
    public Sreach() {
    }
   
    public int linearSreach(int[] arr, int key) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                result = 1;
                break;
            }
        }
        return result;
    }
    
    public int binarySreach(int[] arr, int key) {
        int result = -1;
        int lower = 0;
        int upper = arr.length - 1;

        Arrays.sort(arr);

        while (lower < upper) {
            int mid = lower + (upper - lower)/2;
            if (key == mid) {
                return result = 1;
            }           

            if (key > mid){
                lower = mid + 1;
            }
            else 
                upper = mid - 1;

            return result;
        }


        return result;
    }
}
