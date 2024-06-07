#include <stdio.h>

void LinearSearch(int arr[], int n, int key)
{
    printf("Linear Search: \n");
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == key)
        {
            printf("Element found at index %d\n", i);
            return;
        }
    }
    printf("Element not found\n");
}

void BinarySearch(int arr[], int n, int key)
{
    printf("Binary Search: \n");
    int low = 0;
    int high = n - 1;
    int mid;
    while (low <= high)
    {
        mid = (low + high) / 2;
        if (key > arr[mid])
            low = mid + 1;
        if (key < arr[mid])
            high = mid - 1;
        if (key == arr[mid])
        {
            printf("Key found at %d index\n", mid);
            return;
        }
    }
    printf("Element not found\n");
    return;
}

int main()
{
    printf("Asif Alam\n");
    printf("92201703058\n");
    int arr[50], size;
    printf("Enter size: ");
    scanf("%d", &size);
    for (int i = 0; i < size; i++)
    {
        printf("Enter element: ");
        scanf("%d", &arr[i]);
    }
    int ln, bn;
    // printf("Enter element to search through linear search: ");
    // scanf("%d", &ln);
    // LinearSearch(arr, size, ln);
    printf("Enter element to search through Binary search: ");
    scanf("%d", &bn);
    BinarySearch(arr, size, bn);
    return 0;
}