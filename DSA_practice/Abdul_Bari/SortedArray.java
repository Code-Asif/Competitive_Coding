public class SortedArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,33,40,55,60};
        int arr2[] = new int[]{1,12,33,44,55,6};
        System.out.println("Before Inserting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        InsertAtSortedPos(arr, 30);
        System.out.println("After inserted: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nArray is sorted or not: "+checkSortedArray(arr2));
    }
    public static void InsertAtSortedPos(int arr[], int num){
        int i=arr.length-2;
        while(num < arr[i]){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = num;
    }
    public static boolean checkSortedArray(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}
