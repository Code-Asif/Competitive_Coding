#include<stdio.h>

// Bubble sort
int main(){
    int arr[] = {5, 4, 3, 2, 1};
    // Array before sorting
    printf("Array before sorting...\n");
    for(int i=0; i<5; i++){
        printf("%d ", arr[i]);
    }
    for(int i=0; i<4; i++){
        for(int j=0; j<4-i; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

    // Array after sorting
    printf("\nArray after sorting...\n");
    for(int i=0; i<5; i++){
        printf("%d ", arr[i]);
    }
    return 0;
}
/*
Bubble Sort
for(int i=0; i<n-1; i++){
for(int j=0; j<n-1-i; j++){
if(arr[j]>arr[j+1]){
swap(arr[j], arr[j+1])}
}}

Insertion Sort
for(int i=1; i<n; i++){
int temp = arr[i];
int j = i-1;
while(j>=0 && arr[j]>temp){
arr[j+1] = arr[j];
j--;
}}

Selection sort
for(int i=0; i<n-1; i++){
int minIndex = i;
for(int j=i+1; j<n; j++){
if(arr[j]<arr[minIndex]) minIndex = j;
}
int temp = arr[minIndex];
arr[minIndex] = arr[i];
arr[i] = temp;
}
*/