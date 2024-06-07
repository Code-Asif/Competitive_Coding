#include<stdio.h>
int Ans(int A[], int N){
    int min = A[0];
        int max = A[0];
        for(int i=0; i<N; i++){
            if(A[i]<min) min = A[i];
            if(A[i]>max) max = A[i];
        }
        return max+min;
}

int main(){
    int arr[] = {1,3,-4, 5,20, 40};
    printf("%d",Ans(arr, 6));
}