import java.util.*;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        if(arr[0] > arr[arr.length-1]){
            System.out.printf("Array is Sorted: "+ CheckDescending(arr));
        }else if(arr[0] < arr[arr.length-1]){
            System.out.printf("Array is Sorted: "+ CheckAscending(arr));
        }else{
            System.out.printf("Array is Sorted: "+ CheckEquality(arr));
        }
        sc.close();
    }

    public static boolean CheckDescending(int arr[]){
        int count=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1])count++;
        }
        return count<=1;
    }

    public static boolean CheckAscending(int arr[]){
        int count=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1])count++;
        }
        return count<=1;
    }

    public static boolean CheckEquality(int arr[]){
        int count=0;
        int temp = arr[0];
        for(int i=0; i<arr.length; i++){
            if(temp != arr[i])count++;
        }
        return arr.length-1 == count;
    }
}
