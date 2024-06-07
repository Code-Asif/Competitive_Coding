#include <stdio.h>
long fact(long n)
{
    if (n == 0 || n == 1)
        return 1;
    else
        return n * fact(n - 1);
}

int main()
{
    long num;
    printf("Enter a number: ");
    scanf("%ld", &num);
    printf("Fact : %ld", fact(num));
}