#include<stdio.h>

void QuickSort(int arr[], int low, int high);
int Partition(int arr[], int low, int high);
int main(){
    int arr[] = {1, 23, 4, 5, 0};
    printf("Array before sorting\n");
    for(int i=0; i<5; i++){
        printf("%d ", arr[i]);
    }

    QuickSort(arr, 0, 4);

    printf("\nArray after sorting\n");
    for(int i=0; i<5; i++){
        printf("%d ", arr[i]);
    }
}
void QuickSort(int arr[], int low, int high){
    if(low<=high){
        int index = Partition(arr, low, high);
        QuickSort(arr, low, index-1);
        QuickSort(arr, index+1, high);
    }
}

int Partition(int arr[], int low, int high){
    int pivot = arr[low];
    int i=low;
    for(int j=low+1;j<=high;j++)
    {
        if(arr[j]<= pivot){
            i+=1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[i];
    arr[i] = arr[low];
    arr[low] = temp;
    return low;
}
