#include<stdio.h>
int main(){
    int x,y;
    printf("Enter x: ");
    scanf("%d", &x);
    if(x<=10) printf("y : %d", (3*x)+5);
    else if(x>10) printf("y : %d", (8*x)+5);
    return 0;
}