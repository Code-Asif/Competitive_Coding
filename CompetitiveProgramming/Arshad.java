public class Arshad {
    public static void main(String[] args) {
        int arr[]={6,3,4,61,0};
        boolean flag = false;
        // Array before sorting
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    
        for(int i=0; i<arr.length;i++){
            flag = false;
            for(int j=0; j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = true;
                }
            } 
            if (!flag) {
                break;
            }
        }

        System.out.println("\nArray after sorting...");
        // Array after sorting
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
