#include<stdio.h>
int main(){
    int a,b;
    printf("Enter number1: ");
    scanf("%d", &a);
    printf("Enter number2: ");
    scanf("%d", &b);

    if((a%6 ==0 && a%7==0)&&(b%6==0 && b%7==0)) printf("%d and %d is divisible by 6 and 7\n",a,b);
    else printf("%d and %d is not evenly divisible by 6 and 7\n", a, b);

    return 0;
}