#include <stdio.h>

int main()
{
    printf("\nAsif Alam\n");
    printf("92201703058\n");
    int arr[50], n, p;
    printf("enter size of array: ");
    scanf("%d", &n);
    printf("Enter elements");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Enter which element you want to delete: ");
    scanf("%d", &p);

    for (int i = p - 1; i < n; i++)
    {
        arr[i] = arr[i + 1];
    }

    printf("Array elements: ");
    for (int i = 0; i < n - 1; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}