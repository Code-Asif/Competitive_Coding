import java.util.ArrayList;
import java.util.Arrays;

public class mode {
    public static int singleMode(int arr[]) {
        Arrays.sort(arr);
        int count = 1, max_count = 1, mode=arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
            if (count > max_count) {
                max_count = count;
                mode = arr[i];
            } 
            else if(count == max_count){
                mode = arr[i];
            }
            count=1;

        }
        return mode;
    }

    public static ArrayList<Integer> multipleMode(int arr[]) {
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 1, max_count = 1;
        ans.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } 
            if(count == max_count){
                ans.add(arr[i]);
            }
            else if(count > max_count) {
                max_count = count;
                ans.clear();
                ans.add(arr[i]);
            } 
            if(arr[i] != arr[i-1]){
                count = 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 3, 4, 5};
        System.out.println(multipleMode(arr));
    }
}
