#include<stdio.h>
#include<stdlib.h>
    int main(){
    printf("\nAsif Alam\n");
    printf("92201703058\n");
    int n1, n2, *ptr, i;
    printf("Enter the size of data: ");
    scanf("%d", &n1);
    ptr = (int *)malloc(n1*sizeof(n1));
    printf("Enter your data: \n");
    for(i=0; i<n1; i++){
        scanf("%d", ptr+i);
    }

    printf("Enter new size of data: ");
    scanf("%d", &n2);
    ptr = (int *)realloc(ptr, n2);
    printf ("Enter further data: \n");
    for(i = n1; i<n2; i++){
        scanf("%d", ptr+i);
    }

    for(i=0; i<n2; i++){
        printf("%d\t", *(ptr+i));
    }
    free(ptr);
    return 0;
}