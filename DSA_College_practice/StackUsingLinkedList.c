//Program to implement stack using linked list

#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* top = NULL;

void push(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory allocation failed. Cannot push.\n");
        return;
    }

    newNode->data = value;
    newNode->next = top;
    top = newNode;

    printf("Pushed %d\n", value);
}

void pop() {
    if (top == NULL) {
        printf("Stack is empty. Cannot pop.\n");
        return;
    }

    struct Node* temp = top;
    top = top->next;
    printf("Popped %d\n", temp->data);
    free(temp);
}

void peep() {
    if (top == NULL) {
        printf("Stack is empty.\n");
        return;
    }
    printf("Top element: %d\n", top->data);
}

void display() {
    if (top == NULL) {
        printf("Stack is empty.\n");
        return;
    }

    printf("Stack elements:\n");
    struct Node* current = top;
    while (current != NULL) {
        printf("%d\n", current->data);
        current = current->next;
    }
}

void change(int oldValue, int newValue) {
    if (top == NULL) {
        printf("Stack is empty. Cannot change.\n");
        return;
    }

    struct Node* current = top;
    while (current != NULL) {
        if (current->data == oldValue) {
            current->data = newValue;
            printf("Changed %d to %d\n", oldValue, newValue);
            return;
        }
        current = current->next;
    }

    printf("%d not found in the stack.\n", oldValue);
}

int main() {
    printf("\nAnish Kumar Singh\n");
    printf("92201703021\n");
    int choice, value, oldValue, newValue;

    do {
        printf("Stack Menu:\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Peep\n");
        printf("4. Display\n");
        printf("5. Change\n");
        printf("6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to push: ");
                scanf("%d", &value);
                push(value);
                break;
            case 2:
                pop();
                break;
            case 3:
                peep();
                break;
            case 4:
                display();
                break;
            case 5:
                printf("Enter old value to change: ");
                scanf("%d", &oldValue);
                printf("Enter new value: ");
                scanf("%d", &newValue);
                change(oldValue, newValue);
                break;
            case 6:
                printf("Exiting program.\n");
                break;
            default:
                printf("Invalid choice. Please choose again.\n");
        }
    } while (choice != 6);

    return 0;
}