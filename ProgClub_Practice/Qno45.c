// 45
#include<stdio.h>
int main(){
    int low, high, num;
    printf("Enter range: ");
    scanf("%d %d", &low, &high);

    printf("Enter number: ");
    scanf("%d", &num);

    if(num >= low && num <=high) printf("%d is in range b/w %d and %d\n", num, low, high);
    else printf("%d is out of range\n", num);
    return 0;
}