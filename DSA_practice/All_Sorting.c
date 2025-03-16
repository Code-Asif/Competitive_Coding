#include<stdio.h>

//Bubble sort
void Bubble(int A[], int n){
    int flag, temp;
    for(int i=0; i<n-1; i++){
        flag =0;
        for(int j=0; j<n-1-i; j++){
            if(A[j]>A[j+1]){
                temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;
                flag=1;
            }
        }
        if(flag==0) return;
    }
}

//Insertion sort
void Insertion(int A[], int n){
    int i, j, x;
    for(i=1; i<n; i++){
        j=i-1;
        x = A[i];
        while(j>-1 && A[j]>x){
            A[j+1] = A[j];
            j--;
        }
        A[j+1] = x;
    }
}

//Selection sort
void Selection(int A[], int n){
    int i, j, k;
    for(i=0; i<n-1; i++){
        for(j=k=i; j<n; j++){
            if(A[j]<A[k]){
                k=j;
            }
        }
        int temp = A[i];
        A[i] = A[k];
        A[k] = temp;
    }
}

void Swap(int *a, int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

//Partition function for Quick Sort
int Partition(int A[], int l, int h){
    int pivot = A[l];
    int i=l, j=h;
    do{
        do{i++;}while(A[i]<=pivot);
        do{j--;}while(A[j]>pivot);
        if(i<j) Swap(&A[i], &A[j]);
    }while(i<j);
    int temp = A[l];
    A[l] = A[j];
    A[j] = temp;
    return j;
}

//Quick Sort
void Quick(int A[], int l, int h){
    int j;
    if(l<h){
        j = Partition(A, l, h);
        Quick(A, l, j);
        Quick(A, j+1, h);
    }
}


void merge(int arr[], int low, int mid, int high){
    int i=low, j=mid, k=0;
    int aux[high];
    while(i<mid && j<high){
        if(arr[i]<arr[j]){
            aux[k++] = arr[i++];
        }else aux[k++] = arr[j++];
    }

    while(i<mid){
        aux[k++] = arr[i++];
    }

    while(j<high){
        aux[k++] = arr[j++];
    }

    for(i=0; i<high; i++){
        arr[i] = aux[i];
    }
}

void mergeSort(int arr[], int low, int high){
    if(low<high){
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
}

int main(){
    int Arr[11] = {10,3,2,5,9,0,8,4,1,7,6};
    for(int i=0; i<11; i++){
        printf("%d ", Arr[i]);
    }
    printf("\n");
    mergeSort(Arr, 0, 11);
    for(int i=0; i<11; i++){
        printf("%d ", Arr[i]);
    }
    // Insertion(Arr, 11);
    // for(int i=0; i<11; i++){
    //     printf("%d\t", Arr[i]);
    // }
    return 0;
}