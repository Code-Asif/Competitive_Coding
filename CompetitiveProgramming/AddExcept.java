public class AddExcept{
    public static void main(String[] args) {
        int arr[] = {5, 10, 1, 11};
        System.out.println(sumExceptFirstLast(arr));
    }

    public static int sumExceptFirstLast(int[] arr) {
        // your code here
        int sum = 0;
        for(int i=1; i<arr.length-1; i++){
            sum += arr[i];
        }
        return sum;
    }
}