#include <stdio.h>
int main()
{
    int Arr[9];
    int avg1 = 0, avg2 = 0, avg3 = 0;
    for (int i = 0; i < 9; i++)
    {
        scanf("%d", &Arr[i]);
    }
    for (int i = 0; i < 9; i = i + 3)
    {
        avg1 += Arr[i];
    }
    for (int i = 1; i < 9; i = i + 3)
    {
        avg2 += Arr[i];
    }
    for (int i = 2; i < 9; i = i + 3)
    {
        avg3 += Arr[i];
    }
    avg1 = avg1 / 3;
    avg2 = avg2 / 3;
    avg3 = avg3 / 3;

    if (avg1 > avg2)
    {
        if (avg1 > avg3)
        {
            printf("Trainee Number: 1\n");
        }
        else
        {
            if (avg1 == avg3)
                printf("Trainee Number: 1\n");
            printf("Trainee Number: 3\n");
        }
    }
    else
    {
        if (avg2 > avg3)
            printf("Trainee Number: 2\n");
        else
        {
            if (avg1 == avg3)
                printf("Trainee Number: 1\n");
            if (avg2 == avg3)
                printf("Trainee Number: 2\n");
            printf("Trainee Number: 3\n");
        }
    }
    if (avg1 < 90 && avg2 < 90 && avg3 < 90)
        printf("All trainee are unfit\n");
    return 0;
}