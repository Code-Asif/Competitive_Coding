#include <stdio.h>
int main()
{
    int arr[] = {2, 3, 1, 9, 12, 4, 0};
    printf("Before Sorting\n");
    for (int i = 0; i < 7; i++)
    {
        printf("%d ", arr[i]);
    }

    // Sorting
    for (int i = 0; i < 7 - 1; i++)
    {
        int minIndex = i;
        for (int j = i + 1; j < 7; j++)
        {
            if (arr[j] < arr[minIndex])
                minIndex = j;
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }

    printf("\nAfter Sorting\n");
    for (int i = 0; i < 7; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}