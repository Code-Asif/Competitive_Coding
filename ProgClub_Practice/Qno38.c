#include<stdio.h>
int main(){
    int n;
    printf("Enter number: ");
    scanf("%d", &n);
    int n100000 = n/10000;
    int n10000 = (n%10000)/1000;
    int n1000 = (n%1000)/100;
    int n100 = (n%100)/10;
    int n10 = n%10;

    printf("%d   %d   %d   %d   %d\n", n100000, n10000, n1000, n100, n%10);

    return 0;
}