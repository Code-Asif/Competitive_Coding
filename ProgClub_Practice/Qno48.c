// 48
#include<stdio.h>
int main(){
    int n;
    printf("Enter any number: ");
    scanf("%d", &n);
    if(n>0) printf("Absolute: %d", n);
    else printf("Absolute: %d", n-(2*n));

    return 0;
}