#include<stdio.h>

//Pascal triangle using combination formula
int pas(int n, int r){
    if(r==0 || n==r) return 1;
    else return pas(n-1, r-1)+pas(n-1,r);
}

int main(){ 
    for(int i=1; i<=10; i++){
        for(int j=1; j<=i; j++){
            printf("%d\t", pas(i,j));
        }
        printf("\n");
    }
    return 0;
}