#include<stdio.h>
void MergeSort(int arr[], int low, int high);
void Merge(int arr[], int low, int mid, int high);
int main(){
    int arr[] = {1,34,2,5,0};
    printf("Array before sorting...\n");
    for (int i = 0; i < 5; i++)
    {
        printf("%d ", arr[i]);
    }

    MergeSort(arr, 0, 4);

    printf("\nArray after sorting...\n");
    for (int i = 0; i < 5; i++)
    {
        printf("%d ", arr[i]);
    }
    
    return 0;
}
void MergeSort(int arr[], int low, int high){
    int mid;
    if(low<high){
        mid = (low+high)/2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);
        Merge(arr, low, mid, high);
    }
}
void Merge(int arr[], int low, int mid, int high){
    int i=low, j=mid+1, k=low;
    int ans[5];
    while(i<= mid && j<=high){
        if(arr[i]<arr[j]) ans[k++] = arr[i++];
        else ans[k++] = arr[j++];
    }

    for(; i<=mid; i++){
        ans[k++] = arr[i];
    }
    for(; j<=high; j++){
        ans[k++] = arr[j];
    }
    for(i=low; i<=high; i++){
        arr[i] = ans[i];
    }
}