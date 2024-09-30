import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        // int newArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        // int k=1900;
        // int n = 20;
        // // System.out.println(Sum(arr));
        // System.out.println();
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // Rotate(arr, n, k);
        // NewRotate(newArr, n, k);
        // System.out.println();
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // System.out.println();
        // for(int i=0; i<newArr.length; i++){
        //     System.out.print(newArr[i]+" ");
        // }
        // System.out.println();
        List<Integer> nums = new ArrayList<>();
        for(int i=0; i<5; i++){
            nums.add(i+1);
        }
        System.out.println();
        for(int i=0; i<5; i++){
            System.out.print(" "+nums.get(i));
        }
        int n = nums.size();
        int k = 3;
        reverseList(nums, 0, n-1);
        reverseList(nums, 0, k-1);
        reverseList(nums,k, n-1);
        System.out.println();
        for(int i=0; i<5; i++){
            System.out.print(" "+nums.get(i));
        }

    }
    public static int Sum(int arr[]){
        int sum= 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    
    public static void NewRotate(int arr[], int n, int k){
        int z=1;
        System.out.println("\nNew Roration: \n");
        for(int i=0; i<Math.min(n%k,k%n); i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1; j>=1; j--){
                arr[j] = arr[j-1];
                System.out.println(z++);
            }
            arr[0] = temp;
        }
    }
    public static void Rotate(int arr[], int n, int k){
        int z=1;
        System.out.println("\nRoration: \n");
        for(int i=0; i<k; i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1; j>=1; j--){
                arr[j] = arr[j-1];
                System.out.println(z++);
            }
            arr[0] = temp;
        }
    }
    public static void reverseList(List<Integer> nums , int start, int end){
        while(start<end){
            int temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end, temp);
            start++;
            end--;
        }
    }
}
