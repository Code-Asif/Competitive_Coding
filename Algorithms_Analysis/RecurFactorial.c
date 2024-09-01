#include<stdio.h>
int factorial(int n){
    if(n==1)return 1;
    else return n*factorial(n-1);
}
int main(){
    int num;
    printf("Enter number to find factorial: ");
    scanf("%d", &num);
    printf("Factorial : %d", factorial(num));
    return 0;
}