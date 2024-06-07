// 51
#include<stdio.h>
int main(){
    int a1, a2, a3;
    printf("Enter 1st angle: ");
    scanf("%d", &a1);
    printf("Enter 2nd angle: ");
    scanf("%d", &a2);
    printf("Enter 3rd angle: ");
    scanf("%d", &a3);
    if(a1+a2+a3 == 180) printf("Triangle is valid\n");
    else printf("Triangle is invalid\n");
    return 0;
}