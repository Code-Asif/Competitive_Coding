#include <stdio.h>

void bubbleSort(int arr[], int n)
{
    int temp;
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    printf("\nSorted array by bubble sorting: \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d \t", arr[i]);
    }
    printf("\n");
}

void insertion(int arr[], int n)
{
    int temp, j;
    for (int i = 1; i < n; i++)
    {
        temp = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > temp)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }
    printf("\nSorted array by insertion sorrting: \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d \t", arr[i]);
    }
    printf("\n");
}

void merge(int left[], int right[], int arr[], int l, int r)
{
    int i = 0, j = 0, k = 0;
    while (i < l && j < r)
    {
        if (left[i] < right[j])
        {
            arr[k] = left[i];
            i++;
        }
        else
        {
            arr[k] = right[j];
            j++;
        }
        k++;
    }
    while (i < l)
    {
        arr[k] = left[i];
        i++;
        k++;
    }
    while (j < r)
    {
        arr[k] = right[j];
        j++;
        k++;
    }
}
void mergeSort(int arr[], int n)
{
    int mid = n / 2;
    int left[mid];
    int right[n - mid];
    for (int i = 0; i < mid; i++)
    {
        left[i] = arr[i];
    }
    for (int i = mid; i < n; i++)
    {
        right[i - mid] = arr[i];
    }
    mergeSort(left, mid);
    mergeSort(right, n - mid);
    merge(left, right, arr, mid, n - mid);

    printf("\nSorted array by merge sorting: \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d \t", arr[i]);
    }
}

void QuickSort(int arr[], int n)
{
    int pivot = arr[n - 1];
    int i = 0;
    int j = n - 2;
    while (i < j)
    {
        while (arr[i] < pivot)
        {
            i++;
        }
        while (arr[j] > pivot)
        {
            j--;
        }
        if (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[i];
    arr[i] = arr[n - 1];
    arr[n - 1] = temp;
    QuickSort(arr, i);
    QuickSort(arr + i + 1, n - i - 1);

    printf("Sorted array: \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d \t", arr[i]);
    }
}

int main()
{
    printf("Asif Alam\n");
    printf("92201703058\n");
    while (1)
    {
    int Arr[50];
    int size;
    printf("Enter size of array: ");
    scanf("%d", &size);
    for (int i = 0; i < size; i++)
    {
        printf("Enter element: ");
        scanf("%d", &Arr[i]);
    }
    printf("\nUnsorted array: \n");
    for (int i = 0; i < size; i++)
    {
        printf("%d\t", Arr[i]);
    }
    printf("\n Enter sorting algorithm: \n");
    printf("1. Bubble Sort\n");
    printf("2. Merge sort\n");
    printf("3. Quick Sort\n");
    printf("4. Exit\n");

    int choice;
        printf("Enter choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            bubbleSort(Arr, size);
            break;
        case 2:
            mergeSort(Arr, size);
            break;
        case 3:
            QuickSort(Arr, size);
            break;
        case 4:
            printf("Exit\n");
            return 0;
        default:
            printf("Invalid choice\n");
        }
    }

    return 0;
}