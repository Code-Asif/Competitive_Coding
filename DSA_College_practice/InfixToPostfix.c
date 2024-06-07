#include <limits.h>
#include <stdio.h>
#include <stdlib.h>
#include<stdbool.h>

char *arrayStack = NULL;
int top = -1;
int totalSize = -1;

int isEmpty()
{
    if (totalSize == -1 || arrayStack == NULL)
        return -1;

    return top == -1;
}

int isFull()
{
    if (totalSize == -1 || arrayStack == NULL)
        return -1;

    return top == totalSize - 1;
}

char peek()
{
    if (isEmpty())
        return -1;
    return arrayStack[top];
}

char pop()
{
    if (isEmpty())
        return -1;

    char ch = arrayStack[top];
    top--;
    return (ch);
}

void push(char element)
{
    if (isFull())
        printf("Stack is already Full.");
    else
        arrayStack[++top] = element;
}

int precedence(char ch)
{
    switch (ch)
    {
    case '+':
    case '-':
        return 1;

    case '*':
    case '/':
    case '%':
        return 2;

    case '^':
        return 3;
    }
    return -1;
}

bool isOperand(char element)
{
    if (element >= 'A' && element <= 'Z' || element >= 'a' && element <= 'z' || element >= '1' && element <= '9')
        return true;
    else
        return false;
}

void infixToPostfix(char *expressionArray)
{
    printf("Corresponding Postfix Expression: ");
    int currIndex = 0;
    while (expressionArray[currIndex] != '\0')
    {
        if (isOperand(expressionArray[currIndex]))
            printf("%c", expressionArray[currIndex]);

        else if (expressionArray[currIndex] == '(')
            push(expressionArray[currIndex]);

        else if (expressionArray[currIndex] == ')')
        {
            while (peek() != '(')
                printf("%c", pop());

            pop();
        }
        else
        {
            if (precedence(peek()) >= precedence(expressionArray[currIndex]))
                printf("%c", pop());
            push(expressionArray[currIndex]);
        }
        currIndex++;
    }
    while (top != -1)
    {
        printf("%c", pop());
    }
}

int main()
{
    printf("\nAsif Alam\n");
    printf("92201703058\n");
    char expressionArray[40];

    totalSize = 40;
    arrayStack = (char *)malloc(sizeof(char) * 60);

    printf("Enter a Infix Expression: ");
    scanf("%s", expressionArray);

    // printf("Entered Infix Expression: %s\n", expressionArray);

    infixToPostfix(expressionArray);
    return 0;
}