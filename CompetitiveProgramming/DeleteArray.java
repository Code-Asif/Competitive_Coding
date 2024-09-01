public class DeleteArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(deleteArray(arr, 4));
    }
    public static int[] deleteArray(int []arr, int pos){

        int newArr[] = new int[arr.length-1];
        // printing the array before deleting
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        int j=0; 
        for(int i=0; i<newArr.length; i++){
            if(pos+1 == i){
                j++;
                continue;
            }else{
                newArr[j] = arr[i];
                j++;
            }
        }

        // printing the array before deleting
        for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
        return newArr;
    }
}
