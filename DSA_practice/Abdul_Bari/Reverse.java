public class Reverse {
    public static void main(String[] args) {
        int arr[] = new int[]{0,1,2,3,4,5,6,7,8,9};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Rev(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Rev(int arr[]){
        for(int i=0; i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
