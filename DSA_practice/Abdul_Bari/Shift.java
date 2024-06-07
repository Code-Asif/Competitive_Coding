public class Shift {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("Before any operation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        RightShift(arr);

        System.out.println("After right shift: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        LeftShift(arr);

        System.out.println("After left shift: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        RotateLeft(arr);

        System.out.println("After rotate left: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        RotateRight(arr);

        System.out.println("After rotate right: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void RightShift(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = 0;
    }

    public static void LeftShift(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
    }

    public static void RotateRight(int[] arr) {
        int temp = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    public static void RotateLeft(int[] arr) {
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
}
