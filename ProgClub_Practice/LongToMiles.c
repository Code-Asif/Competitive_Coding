// Qno. 33
#include<stdio.h>
#include<math.h>
int main(){
    int money;
    int count10, count50, count100;
    count10 = count50 = count100 =0;
    printf("Money to be withdrawn: ");
    scanf("%d", &money);
    int a=money;
    
    count10 = money/10;
    count50 = money/50;
    count100 = money/100;

    printf("For %d amount of money:\n", a);
    printf("No. of 10Rs note = %d\n", count10);
    printf("No.of 50Rs note = %d\n", count50);
    printf("No. of 100Rs note = %d\n", count100);
    return 0;
}