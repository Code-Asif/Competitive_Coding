import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueNumber {
    public static void printArray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void printArrayList(ArrayList<Integer> arr){
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static int singleUnique(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8};
        int unique = 0;
        for(int i=0; i<arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }
    public static ArrayList<Integer> multipleUnique(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        ArrayList<Integer> unique = new ArrayList<>();
        for(Map.Entry<Integer, Integer> pair : map.entrySet()){
            if(pair.getValue() == 1){
                unique.add(pair.getKey());
            }
        }
        return unique;
    }
    public static void main(String[] args) {
        printArrayList(multipleUnique());
    }
}
