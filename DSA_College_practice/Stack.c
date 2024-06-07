#include <stdio.h>
int Stack[20], n, top = -1, A, el;
void push(int e)
{
    if (top == n - 1)
    {
        printf("Stack Overflow");
        return;
    }
    Stack[++top] = e;
}

int pop()
{
    if (top == -1)
    {
        printf("Stack Underflow");
        return 0;
    }
    top--;
    return Stack[top + 1];
}
void change()
{
    int pos, value;
    printf("Enter the position of the index: ");
    scanf("%d", &pos);
    printf("Enter the value to change: ");
    scanf("%d", &value);
    if ((top - pos + 1) < 0)
    {
        printf("Stack underflow");
    }
    else
    {
        Stack[top - pos + 1] = value;
    }
}

void display(int arr[])
{
    printf("Stack elements are: ");
    for (int i = 0; i < top + 1; i++)
    {
        printf("%d\t", Stack[i]);
    }
}
void peep(int arr[])
{
    if (top == -1)
    {
        printf("Stack underflow\n");
    }
    printf("Top element = %d\n", arr[top]);
}
int main()
{
    printf("\nAsif Alam\n");
    printf("92201703058\n");
    printf("Enter the size of stack: ");
    scanf("%d", &n);
    while (A != 6)
    {
        printf("\nEnter 1 for push, 2 for pop, 3 for display the stack, 4 for peep and, 5 for change \n");
        scanf("%d", &A);
        switch (A)
        {
        case 1:
            printf("Enter element to push: ");
            scanf("%d", &el);
            push(el);
            break;
        case 2:
            printf("Element removed : ", pop());
            break;
        case 3:
            display(Stack);
            break;
        case 4:
            peep(Stack);
            break;
        case 5:
            change();
            printf("Element value changed");
            break;
        }
    }

    return 0;
}