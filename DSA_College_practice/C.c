#include <stdio.h>
#include <stdlib.h>

int main()
{
    union test
    {
        int i;
        float f;
        char c;
    };
    union test *t;
    t = (union test *)malloc(sizeof(union test));
    t->f = 10.10f;
    printf("%f", t->f);
    return 0;
}