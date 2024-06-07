#include <stdio.h>

int Queue[20], size, A, element;
int Rear = -1;
int Front = -1;

void insert(int e)
{
    if (Rear == size - 1)
        printf("Queue Overflow");
    else
    {
        Rear++;
        Queue[Rear] = e;
    }
    if (Front == -1)
    {
        Front = 0;
    }
}

void delete()
{
    if (Front == -1)
        printf("Queue is Underflow");
    else
    {
        printf("%d is deleted\n", Queue[Front]);
        Front++;
    }
    if (Front == Rear)
    {
        Front = Rear = -1;
    }
}

void change()
{
    int pos, value;
    printf("Enter the position of the index: ");
    scanf("%d", &pos);
    printf("Enter the value to change: ");
    scanf("%d", &value);
    if ((Rear - Front + 1) < pos)
    {
        printf("Invalid Position");
    }
    else
    {
        Queue[pos + Front - 1] = value;
    }
}

void peek()
{
    if (Front == -1)
        printf("Queue underflow");
    else
        printf("Peek element : %d", Queue[Rear]);
}

void display()
{
    for (int i = Front; i <= Rear; i++)
    {
        printf("%d\t", Queue[i]);
    }
}

int main()
{
    printf("\nAnish Kumar Singh\n");
    printf("92201703021\n");
    printf("Enter the size of Queue: ");
    scanf("%d", &size);
    while (A != 6)
    {
        printf("\nEnter 1 for insert, 2 for delete, 3 for display the Queue, 4 for peep and, 5 for change and 6 for Stop\n");
        scanf("%d", &A);
        switch (A)
        {
        case 1:
            printf("Enter element to push: ");
            scanf("%d", &element);
            insert(element);
            break;
        case 2:
            printf("Element removed : ");
            delete ();
            break;
        case 3:
            display();
            break;
        case 4:
            peek();
            break;
        case 5:
            change();
            printf("Element value changed");
            break;
        }
    }
    return 0;
}
