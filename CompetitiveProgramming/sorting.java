public class sorting {
    public static void main(String[] args) {
        int arr[] = {2, 12, 1, 3, 13, 20, -3};
        int arr2[] = {2, 12, 1, 3, 13, 20, -3};
        int arr3[] = {2, 12, 1, 3, 13, 20, -3};
        int arr4[] = {2, 12, 1, 3, 13, 20, -3};
        int arr5[] = {2, 12, 1, 3, 13, 20, -3};
        int arr6[] = {2, 12, 1, 3, 13, 20, -3};
        bubbleSort(arr);
        insertionSort(arr2);
        selectionSort(arr3);
        System.out.println();
        quickSort(arr4, 0, arr4.length-1);
        System.out.print("Quick Sort: ");
        printArray(arr4);
        System.out.println();
        mergeSort(arr5, 0, arr.length-1);
        System.out.print("Merge Sort: ");
        printArray(arr5);
        heapSort(arr6, 7);
        System.out.print("Heap Sort: ");
        printArray(arr6);
    }

    public static void printArray(int arr[]){
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]){
        printArray(arr);
        boolean flag;
        for(int i=0; i<arr.length; i++){
            flag = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(flag == false) break;
        }
        System.out.print("Bubble Sort: ");
        printArray(arr);
    }

    public static void insertionSort(int arr[]){
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
        System.out.print("Insertion Sort: ");
        printArray(arr);
    }

    public static void selectionSort(int arr[]){
        printArray(arr);
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.print("Selection Sort: ");
        printArray(arr);
    }

    public static void quickSort(int arr[], int beg, int end){
        if(beg < end){
            int j = partition(arr, beg, end);
            quickSort(arr, beg, j-1);
            quickSort(arr, j+1, end);
        }else return;
    }

    public static int partition(int arr[], int beg, int end){
        int piv = arr[beg];
        int down = beg;
        int up = end;
        while(down < up){
            while(arr[down] <= piv && down < end){
                down = down +1;
            }
            while(arr[up] > piv){
                up = up - 1;
            }
            if(down < up){
                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;
            }
        }
        int temp = arr[up];
        arr[up] = arr[beg];
        arr[beg] = temp;
        return up;
    }

    public static void mergeSort(int arr[], int low, int high){
        if(low < high){
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void merge(int arr[], int low, int mid, int high){
        int i=low, j=mid+1, k=0;
        int aux[] = new int[high+1];
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                aux[k++] = arr[i++];
            }else{
                aux[k++] = arr[j++];
            }
        }
        while(i<=mid){
            aux[k++] = arr[i++];
        }
        while(j<=high){
            aux[k++] = arr[j++];
        }

        k=0;
        for(int l=low; l<=high; l++){
            arr[l] = aux[k++];
        }
    }

    public static void heapSort(int arr[], int n){
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }
        for(int i=n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < n && arr[left] > arr[largest]) largest = left;
        if(right < n && arr[right] > arr[largest]) largest = right;

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
}
