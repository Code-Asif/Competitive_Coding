// 35
#include <stdio.h>
int main()
{
    int n;
    printf("Enter no:");
    scanf("%d", &n);

    int a, b, c, d, e, f;

    a = n / 100;

    n = n % 100;
    b = n / 50;

    n = n % 50;
    c = n / 10;

    n = n % 10;
    d = n / 5;

    n = n % 5;
    e = n / 2;

    n = n % 2;
    f = n / 1;

    printf("RS 100:%d\n", a);
    printf("RS 50:%d\n", b);
    printf("RS 10:%d\n", c);
    printf("RS 5:%d\n", d);
    printf("RS 2:%d\n", e);
    printf("RS 1:%d\n", f);

    return 0;
}