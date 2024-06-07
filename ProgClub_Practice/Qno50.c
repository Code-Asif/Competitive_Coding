// 50
#include<stdio.h>
int main(){
    int CURR,YOE;
    printf("Enter current year: ");
    scanf("%d", &CURR);

    printf("Enter service starting year: ");
    scanf("%d", &YOE);

    if((CURR-YOE) >3 ) printf("Bonus: 2500");
    return 0;
}