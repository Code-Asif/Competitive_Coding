public class InsertionSort {
    public static void main(String[] args) {
        int a[] = new int[]{1, 5, 8, 9, 2, 7, 3};
        System.out.println("Before sorting");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nAfter sorting");
        Sort(a, 7);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void Sort(int arr[], int n){
        for(int i=0; i<=n-1; i++){
            int j = i;
            while(j>0 && arr[j]< arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
