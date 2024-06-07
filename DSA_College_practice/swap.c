#include <stdio.h>
void swap(int *a, int *b)
{
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}
void swap2(int a, int b)
{
    int temp;
    temp = a;
    a = b;
    b = temp;
}
int main()
{
    printf("\nAsif Alam\n");
    printf("92201703058\n");
    int a = 10;
    int b = 20;
    int c = 10;
    int d = 20;
    printf("A = %d , B = %d\n", a, b);

    // call by reference
    swap(&a, &b);
    printf("After swap a and b %d %d\n", a, b);

    // call by value
    printf("C = %d , D = %d\n", c, d);
    swap2(c, d);
    printf("After swap c and d %d %d\n", c, d);
    return 0;
}