public class SelectionSort {
    public static void main(String[] args) {
        int [] a = new int[]{2, 5, 1, 6, 15, 90, 7};
        System.out.println("Array before sorting");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nArray after sorting");
        sort(a, 7);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void sort(int [] arr, int n){
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
}
