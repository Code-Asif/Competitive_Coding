public class findOdd {
    public static void main(String[] args) {
        // int arr[] = {1,2,1,2,3,3,3};
        // int xor = 0;
        // for(int i=0; i<7; i++){
        //     xor ^= arr[i];
        // }
        // System.out.println(xor);
        int arr[] = {4, 5, 1, 2, 7, 0, 6};
        System.out.println(findMissing(arr));
    }
    public static int findMissing(int arr[]){
        int xor = 0;
        int xor2 = 0;
        for(int i=0; i<arr.length; i++){
            xor ^= i+1;
            xor2 ^= arr[i];
        }
        return xor^xor2;
    }
}
