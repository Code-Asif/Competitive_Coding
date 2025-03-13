import java.util.ArrayList;
import java.util.Collections;

public class ReverseInBatch {
    public static void main(String[] args) {
        ArrayList<Long> arr = new ArrayList<>();
        arr.add(1L);
        arr.add(2L);
        arr.add(3L);
        arr.add(4L);
        arr.add(5L);
        reverseInGroups(arr, 3);
        System.out.println(arr);
    }
    static void reverseInGroups(ArrayList<Long> arr, int k) {
        if(k < arr.size()){
            for(int i=0; i<k; i++){
                long temp = arr.get(i);
                arr.set(i, arr.get(k-i-1));
                arr.set(k-i-1, temp);
            }
            for(int i=k; i<arr.size(); i++){
                long temp = arr.get(i);
                arr.set(i, arr.get(k-i-1));
                arr.set(k-i-1, temp);
            }
        }
        else Collections.reverse(arr);
    }
}
