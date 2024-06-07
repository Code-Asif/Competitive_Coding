#include <stdio.h>

int CQ[20], size, A, element;
int Rear = -1;
int Front = -1;

void insert(int e)
{
    if ((Front == 0) && (Rear == size - 1) || (Front == Rear + 1))
        printf("Circular Queue Overflow");
    else
    {
        Rear = (Rear + 1) % size;
        CQ[Rear] = e;
    }
    if (Front == -1)
    {
        Front = 0;
    }
}

void delete()
{
    if(Front == -1)
        printf("Circular Queue is Underflow.");
    else{
        printf("%d is Deleted.",CQ[Front]);
        if(Front==Rear)
                Front=Rear=-1;
        else
            Front=(Front+1)%size;
    }
}

void change()
{
    int ele, value;
    int found=0;
    int i = Front;
    printf("Enter the element to replace: ");
    scanf("%d", &ele);
    printf("Enter the value to change: ");
    scanf("%d", &value);
    while(1){
        if(CQ[i] == ele){
            CQ[i] = value;
            found = 1;
            printf("Changed %d to %d\n", ele, value);
            break;
        }
        if(i==Rear) break;

        i = (i+1) % size;
    }
    if(!found){
        printf("%d not found in the queue", ele);
    }

}

void peek()
{
    if (Front == -1)
        printf("Circular Queue underflow");
    else
        printf("Peek element : %d", CQ[(Rear + 1) % size]);
}

void display()
{
    for (int i = Front; i != Rear; i = (i + 1) % size)
    {
        printf("%d\t", CQ[i]);
    }
    printf("\t%d", CQ[Rear]);
}

int main()
{
    printf("\nAnish Kumar Singh\n");
    printf("92201703021\n");
    printf("Enter the size of Circular Queue: ");
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