#include<stdio.h>
#include<stdlib.h>

int main(){
    int *p, *q;
    p = (int *)malloc(5*sizeof(int));
    p[0]=5;
    p[1]=10;
    p[2]=15;
    p[3]=20;
    p[4]=25;

    int n;
    printf("Enter n: ");
    scanf("%d", &n);

    q = (int *)malloc(n*sizeof(int));

    for(int i=0; i<n; i++){
        printf("Enter the value of index %d : ", i );
        scanf("%d", &q[i]);
    }

    for(int i=0; i<n; i++){
        printf("Element at index %d is %d\n", i, q[i]);
    }
    return 0;
}