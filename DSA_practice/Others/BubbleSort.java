public class BubbleSort {
    public static void main(String[] args) {
        int a[] = new int[]{1, 5, 8, 2, 9, 7, 3};
        System.out.println("Array before sorting");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        Sort(a, 7);
        System.out.println("\nArray after sorting");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void Sort(int []arr, int n){
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
