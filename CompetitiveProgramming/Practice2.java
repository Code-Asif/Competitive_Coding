public class Practice2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int newArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int k=190;
        int n = 20;
        // System.out.println(Sum(arr));
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Rotate(arr, n, k);
        NewRotate(newArr, n, k);
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println();
        for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
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
        for(int i=0; i<k%n; i++){
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
}
