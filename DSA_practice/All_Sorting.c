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

//Quick Sort
void Quick(int A[], int l, int h){
    int j;
    if(l<h){
        j = Partition(A, l, h);
        Quick(A, l, j);
        Quick(A, j+1, h);
    }
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

int main(){
    int Arr[11] = {10,3,2,5,9,0,8,4,1,7,6};
    Insertion(Arr, 11);
    for(int i=0; i<11; i++){
        printf("%d\t", Arr[i]);
    }
    return 0;
}