#include<stdio.h>
int main(){
    int arr[] = {5, 4, 3, 2, 1, 55};
    // Print array before sorting
    printf("Before Sorting\n");
    for(int i=0; i<6; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");

    for(int i=1; i<6; i++){
        int temp = arr[i];
        int ptr = i-1;
        while(temp < arr[ptr] && ptr>= 0){
            arr[ptr+1] = arr[ptr];
            ptr -= 1;
        }
        arr[ptr+1] = temp;
    }

    // Print array after sorting
    printf("After Sorting\n");
    for(int i=0; i<6; i++){
        printf("%d ", arr[i]);
    }
    return 0;
}