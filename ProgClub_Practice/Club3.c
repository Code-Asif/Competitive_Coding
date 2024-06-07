#include <stdio.h>
#include <math.h>
#include <string.h>
int main()
{
    //Base 17 to decimal
    char hex[17];
    long sum;

    long val, size;
    sum = 0;

    printf("Enter : ");
    scanf("%s", hex);

    size = strlen(hex)-1;

    for (int i = 0; hex[i] != '\0'; i++)
    {
        if (hex[i] >= '0' && hex[i] <= '9')
        {
            val = hex[i] - 48;
        }
        else if (hex[i] >= 'A' && hex[i] <= 'G')
        {
            val = hex[i] - 55;
        }
        sum =  sum + (val *( (int)pow(17, size--)));
    }

    printf("%ld", sum);

    return 0;
}