#include <stdio.h>
int main()
{
    //Difference of sum of evenly odd position
    long num;
    printf("Enter a number: ");
    scanf("%ld", &num);
    long tem1 = num;
    int sum1 = 0;
    long tem2 = num;
    int sum2 = 0;
    int count = 0;
    while (num > 0)
    {
        count++;
        num /= 10;
    }
    if (count % 2 == 0)
    {
        while (tem1 > 0)
        {
            sum1 += tem1 % 10;
            tem1 /= 10;
            tem1 /= 10;
        }
    }
        while (tem2 > 0)
        {
            tem2 /= 10;
            sum2 += tem2 % 10;
            tem2 /= 10;
        }

    printf("Difference : %d", sum1-sum2);
    return 0;
}