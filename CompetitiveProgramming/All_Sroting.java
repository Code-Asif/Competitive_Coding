public class All_Sroting {
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 9, 10, 0, -2};
        // bubbleSort(arr);
        // insertionSort(arr);
        selectionSort(arr);
    }

    public static void bubbleSort(int arr[]){
        System.out.println("Bubble Sort: ");
        printArray(arr);
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int j=0; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    flag = true;
                    arr[i] = arr[i]^arr[j];
                    arr[j] = arr[i]^arr[j];
                    arr[i] = arr[i]^arr[j];
                }
            }
            if(!flag)break;
        }
        printArray(arr);
    }

    public static void insertionSort(int arr[]){
        System.out.println("Insertion Sort: ");
        printArray(arr);
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int ptr = i-1;
            while(ptr >= 0 && temp < arr[ptr]){
                arr[ptr+1] = arr[ptr];
                ptr = ptr-1;
            }
            arr[ptr+1] = temp;
        }
        printArray(arr);
    }

    public static void selectionSort(int arr[]){
        System.out.println("Selection Sort: ");
        printArray(arr);
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] > arr[j])min = j;
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        printArray(arr);
    }


    public static void printArray(int arr[]){
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
