#include<stdio.h>
int main(){
    int n1, n2;
    printf("Enter number 1: ");
    scanf("%d", &n1);
    printf("Enter number 2: ");
    scanf("%d", &n2);
    if(n1*n2 >= 100) printf("Product is equal or greater than 100\n");
    else printf("Product is less than 100\n");
    return 0;
}