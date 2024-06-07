// 44
#include<stdio.h>
int main(){
    int a,b;
    printf("Enter a: ");
    scanf("%d", &a);
    printf("Enter b: ");
    scanf("%d", &b);

    if(a%b==0) printf("%d is evenly divisible by %d\n", a,b);
    else printf("%d is not evenly divisible by %d\n", a, b);
    
    return 0;
}