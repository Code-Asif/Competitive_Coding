#include<stdio.h>
#include<stdlib.h>
    int main(){
    printf("\nAsif Alam\n");
    printf("92201703058\n");
    int n, *ptr, i;
    printf("Enter the size of data: ");
    scanf("%d", &n);
    ptr = (int *)malloc(n*sizeof(int));
    printf("Enter your data: ");
    for(i=0; i<n; i++){
        scanf("%d", ptr+i);
    }

    for(i=0; i<n; i++){
        printf("%d\t", *(ptr+i));
    }
    free(ptr);
    return 0;
}