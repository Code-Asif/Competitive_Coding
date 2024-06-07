public class Search{
    public static void main(String[] args) {
        int a[] = new int[]{2,4,7,9,12,14,90};
        System.out.printf("Linear Search: %d\n", LinearSearch(a, 14));
        System.out.printf("Binary Search: %d\n", BinarySearch(a, 14));
        System.out.printf("RBinary Search: %d\n", RBinarySearch(0, a.length,14, a));
        System.out.printf("Sum of array elements: %d\n", SumN(a));
        System.out.printf("Max of array elements: %d\n", Max(a));
        System.out.printf("Min of array elements: %d\n", Min(a));
        Even(a);
        Odd(a);
    }
    public static int LinearSearch(int [] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key) return i;
        }
        return -1;
    }
    public static int BinarySearch(int [] arr, int key){
        int high = arr.length-1;
        int low = 0;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid] > key) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public static int RBinarySearch(int l, int h, int key, int []arr){
        if(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] == key) return mid;
            else if(arr[mid] > key) return RBinarySearch(l, mid-1, key, arr);
            else return RBinarySearch(mid+1, h, key, arr);
        }
        return -1;
    }
    public static int SumN(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int Max(int []arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static int Min(int []arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
    public static void Even(int []arr){
        System.out.print("Even Numbers: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0) System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Odd(int []arr){
        System.out.print("Odd Numbers: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0) System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}