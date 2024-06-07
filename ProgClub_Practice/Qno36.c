// 36
#include <stdio.h>
int main()
{
    int n;
    printf("Enter number: ");
    scanf("%d", &n);

    int year = n / 356;
    int week = (n % 365) / 7;
    int rem = (n/365)%7;

    printf("Year: %d\n", year);
    printf("Week: %d\n", week);
    printf("Remaining days: %d\n", rem);

    return 0;
}