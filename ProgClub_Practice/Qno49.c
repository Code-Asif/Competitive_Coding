// 49
#include<stdio.h>
int main(){
    int a,b;
    printf("Enter a: ");
    scanf("%d", &a);
    printf("Enter b: ");
    scanf("%d", &b);

    if(a-b > 0) printf("Difference is positive\n");
    else printf("Difference is negative\n");

    
    return 0;
}