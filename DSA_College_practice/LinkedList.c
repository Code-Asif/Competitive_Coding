#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *start = NULL, *ptr = NULL, *nn = NULL;
int value;
void create_list()
{
    int stop_value;
    start = NULL;
    printf("Enter -1 to stop: Enter a value: ");
    scanf("%d", &stop_value);
    while (stop_value != -1)
    {
        nn = (struct node *)malloc(sizeof(struct node));
        if (nn == NULL)
        {
            printf("Memory overflow");
            return;
        }
        (*nn).data = stop_value;
        (*nn).next = NULL;
        if (start == NULL)
            start = nn;
        else
        {
            ptr = start;
            while ((*ptr).next != NULL)
                ptr = (*ptr).next;
            (*ptr).next = nn;
        }
        printf("Enter -1 to stop: Enter a value: ");
        scanf("%d", &stop_value);
    }
}

void insertAtBegin()
{
    int value;
    printf("Enter a value to insert at beginning: ");
    scanf("%d", &value);
    nn = (struct node *)malloc(sizeof(struct node));
    if (nn == NULL)
    {
        printf("Memory overflow");
        return;
    }
    else
        (*nn).data = value;
    (*nn).next = start;
    start = nn;
}

void insertAtEnd()
{
    int value;
    printf("Enter a value to insert at end: ");
    scanf("%d", &value);
    nn = (struct node *)malloc(sizeof(struct node));
    if (nn == NULL)
    {
        printf("Memory overflow");
        return;
    }
    else
    {
        while ((*ptr).next != NULL)
        {
            ptr = (*ptr).next;
        }
    }
    (*ptr).next = nn;
}

void insertAtPos()
{
    int pos, count = 1, value;
    struct node *preptr = ptr;

    printf("Enter a position to insert value: ");
    scanf("%d", &pos);
    if (pos == 1)
    {
        insertAtBegin();
    }
    else
    {
        ptr = start;
        printf("Enter the value to insert: ");
        scanf("%d", &value);
        nn = (struct node *)malloc(sizeof(struct node));
        if (nn == NULL)
        {
            printf("Memory overflow");
            return;
        }
        else
        {
            (*nn).data = value;
            while (pos != count && ptr != NULL)
            {
                count++;
                preptr = ptr;
                ptr = (*ptr).next;
            }
        }
        (*preptr).next = nn;
        (*nn).next = ptr;
    }
}

void sort()
{
    int temp;
    struct node *p1, *p2;
    for (p1 = start; p1 != NULL; p1 = (*p1).next)
    {
        for (p2 = (*p1).next; p2 != NULL; p2 = (*p2).next)
        {
            if ((*p1).data > (*p2).data)
            {
                temp = (*p1).data;
                (*p1).data = (*p2).data;
                (*p2).data = temp;
            }
        }
    }
}

void insert_in_sorted(int value)
{
    struct node *preptr;
    sort();
    nn = (struct node *)malloc(1 * sizeof(struct node));
    if (nn == NULL)
    {
        printf("Memory Overflow");
        return;
    }
    (*nn).data = value;
    (*nn).next = NULL;
    if (start == NULL || (*start).data > (*nn).data)
    {
        (*nn).next = start;
        start = nn;
        return;
    }
    ptr = start;
    preptr = start;
    while (ptr != NULL && (*ptr).data < (*nn).data)
    {
        preptr = ptr;
        ptr = (*ptr).next;
    }
    (*nn).next = ptr;
    (*preptr).next = nn;
}

void delete_first()
{
    if (start == NULL)
    {
        printf("List is Empty.");
        return;
    }
    ptr = start;
    printf("%d is deleted.", (*ptr).data);
    start = (*start).next;
    free(ptr);
}

void delete_last()
{
    struct node *preptr, *cur;
    if (start == NULL)
    {
        printf("List is Empty.");
        return;
    }
    for (preptr = start, ptr = start; (*ptr).next != NULL; ptr = (*ptr).next)
        preptr = ptr;
    (*preptr).next = NULL;
    printf("%d is deleted.", (*ptr).data);
    if ((*start).next == NULL)
        start = NULL;
    free(ptr);
}

void delete_before_position()
{
    int pos, count;
    struct node *preptr, *cur;
    if (start == NULL)
    {
        printf("List is already Empty.");
        return;
    }
    printf("Enter a Position");
    scanf("%d", &pos);
    if (pos <= 1)
    {
        printf("Enter Valid position before to delete a Node.");
        return;
    }
    if (pos == 2)
    {
        delete_first();
        return;
    }
    ptr = start;
    preptr = start;
    cur = start;
    for (count = 1; cur != NULL && count < pos; count++)
    {
        preptr = ptr;
        ptr = cur;
        cur = (*cur).next;
    }
    (*preptr).next = cur;
    printf("%d is deleted.", (*ptr).data);
    free(ptr);
}

void delete_all_ocurrence()
{
    int value;
    struct node *preptr;
    if (start == NULL)
    {
        printf("List is Empty.");
        return;
    }
    printf("Enter a Value to delete:");
    scanf("%d", &value);
Again:
    if ((*start).data == value)
        delete_first();
    else
    {
        preptr = start;
        ptr = start;
        while (ptr != NULL && (*ptr).data != value)
        {
            preptr = ptr;
            ptr = (*ptr).next;
        }
        if (ptr == NULL)
            return;
        (*preptr).next = (*ptr).next;
        free(ptr);
    }
    goto Again;
}

void display()
{
    if (start == NULL)
        printf("List is empty. ");
    else
    {
        printf("\nList is: ");
        for (ptr = start; ptr != NULL; ptr = (*ptr).next)
        {
            printf("-->%d\t", (*ptr).data);
        }
    }
}

int main()
{
    printf("\nAnish Kumar Singh");
    printf("\n92201703021");
    int ch;
    while (ch != 11)
    {
        printf("\n***************************LinkedList Program*********************************\n");
        printf("1.Create Linkedlist\n");
        printf("2.Display Linkedlist\n");
        printf("3.Insertion at begining\n");
        printf("4.Insertion at end\n");
        printf("5.Insertion at position\n");
        printf("6.Insertion in sorted list\n");
        printf("7.Deletion at begining\n");
        printf("8.Deletion at end\n");
        printf("9.Deletion before position\n");
        printf("10.Deletion all ocurrence\n");
        printf("11.Exit\n");
        printf("Enter choice: ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            create_list();
            break;
        case 2:
            display();
            break;
        case 3:
            insertAtBegin();
            break;
        case 4:
            insertAtEnd();
            break;
        case 5:
            insertAtPos();
            break;
        case 6:
            printf("Enter a value to insert in sorted list: ");
            scanf("%d", &value);
            insert_in_sorted(value);
            break;
        case 7:
            delete_first();
            break;
        case 8:
            delete_last();
            break;
        case 9:
            delete_before_position();
            break;
        case 10:
            delete_all_ocurrence();
            break;
        case 11:
            break;
        default:
            printf("Invalid choice\n");
            break;
        }
    }
    return 0;
}