public class revArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        for(int i=0; i<(arr.length+1)/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
