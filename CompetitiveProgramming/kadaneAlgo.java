public class kadaneAlgo {
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(kadane(arr));
    }
    public static int kadane(int arr[]){
        int sum=0, max=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum=0;
            }
        }
        return max;
    }
}
