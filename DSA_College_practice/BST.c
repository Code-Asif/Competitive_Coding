#include <stdio.h>
#include <stdlib.h>

/*
 * Node Declaration
 */
struct node
{
    int info;
    struct node *left;
    struct node *right;
} *root;

void insert(struct node *, struct node *);
void delete1(struct node *, int);
void preorder(struct node *);
void inorder(struct node *);
void postorder(struct node *);
void display(struct node *, int);

/*
 * Main Contains Menu
 */
int main()
{
    printf("\nAsif Alam");
    printf("\n92201703058");
    int choice, num, key;

    struct node *temp;

    while (1)
    {
        printf("-----------------\n");
        printf("Operations on BST\n");
        printf("-----------------\n");
        printf("1.Insert Element\n ");
        printf("2.Delete Element\n ");
        printf("3.Inorder Traversal\n ");
        printf("4.Preorder Traversal\n ");
        printf("5.Postorder Traversal\n ");
        printf("6.Display\n ");
        printf("7.Quit\n ");

        printf("Enter your choice : \n ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            temp = (struct node *)malloc(sizeof(struct node));
            printf("Enter the number to be inserted : \n");
            scanf("%d", &temp->info);

            if (root == NULL)
            {
                root = (struct node *)malloc(sizeof(struct node));
                root->info = temp->info;
                root->left = NULL;
                root->right = NULL;
                printf("Root Node is Added\n");
            }
            else
                insert(root, temp);
            break;

        case 2:
            if (root == NULL)
            {
                printf("Tree is empty, nothing to delete\n");
                continue;
            }
            printf("Enter number to be deleted\n");
            scanf("%d", &key);
            delete1(root, key);
            break;
        case 3:
            printf("Inorder Traversal of BST:\n");
            inorder(root);
            printf("\n");
            break;
        case 4:
            printf("Preorder Traversal of BST:\n");
            preorder(root);
            printf("\n");
            break;
        case 5:
            printf("Postorder Traversal of BST:\n");
            postorder(root);
            printf("\n");
            break;
        case 6:
            printf("Display BST:\n");
            display(root, 1);
            printf("\n");
            break;

        case 7:
            exit(1);

        default:
            printf("Wrong choice\n");
        }
    }

    return 0;
}

/*
 * Inserting Element into the Tree
 */
void insert(struct node *tree, struct node *newnode)
{

    /*if (root == NULL)
       {
        root = (struct node *)malloc(sizeof(struct node));
         root->info = newnode->info;
         root->left = NULL;
         root->right = NULL;
         printf("Root Node is Added\n");

         return;
     }*/
    if (tree->info == newnode->info)
    {
        printf("Element already in the tree\n");
        return;
    }
    if (tree->info > newnode->info)
    {
        if (tree->left != NULL)
        {
            insert(tree->left, newnode);
        }
        else
        {
            tree->left = newnode;
            (tree->left)->left = NULL;
            (tree->left)->right = NULL;
            printf("Node Added To Left\n");
            return;
        }
    }
    else
    {
        if (tree->right != NULL)
        {
            insert(tree->right, newnode);
        }
        else
        {
            tree->right = newnode;
            (tree->right)->left = NULL;
            (tree->right)->right = NULL;
            printf("Node Added To Right\n");
            return;
        }
    }
}

/*
 * Pre Order Traversal
 */
void preorder(struct node *ptr)
{
    if (root == NULL)
    {
        printf("Tree is empty\n");
        return;
    }
    if (ptr != NULL)
    {
        printf("%d  ", ptr->info);
        preorder(ptr->left);
        preorder(ptr->right);
    }
}
/*
 * In Order Traversal
 */
void inorder(struct node *ptr)
{
    if (root == NULL)
    {
        printf("Tree is empty\n");
        return;
    }
    if (ptr != NULL)
    {
        inorder(ptr->left);
        printf("%d  ", ptr->info);
        inorder(ptr->right);
    }
}

/*
 * Postorder Traversal
 */
void postorder(struct node *ptr)
{
    if (root == NULL)
    {
        printf("Tree is empty\n");
        return;
    }
    if (ptr != NULL)
    {
        postorder(ptr->left);
        postorder(ptr->right);
        printf("%d  ", ptr->info);
    }
}

void delete1(struct node *root, int key)
{
    if (root == NULL)
        printf("Tree is Empty !!!");
    if (key < root->info)
        delete1(root->left, key);
    else if (key > root->info)
        delete1(root->right, key);
    else
    {
        struct node *p = (struct node *)malloc(sizeof(struct node));
        if (root->left == NULL) // if node has only right child       //or node has no child
        {

            p = root;
            root = root->right;
            printf("%d  is deleted", p->info);
            //    delete p;
            free(p);
        }

        else if (root->right == NULL) // if node has only left child
        {
            p = root;
            root = root->left;
            printf("%d  is deleted\n", p->info);

            free(p);
        }

        else // find inorder predecessor, replace node to be deleted with inorder predecessor value
        {
            p = root->left;
            while (p->right != NULL)
                p = p->right;
            root->info = p->info;
            delete1(root->left, p->info);
        }
    }
}

/*
 * Display Tree Structure
 */
void display(struct node *ptr, int level)
{
    int i;
    if (ptr != NULL)
    {
        display(ptr->right, level + 1);
        printf("\n");
        if (ptr == root)
            printf("Root->:  ");
        else
        {
            for (i = 0; i < level; i++)
                printf("       ");
        }
        printf("%d", ptr->info);
        display(ptr->left, level + 1);
    }
}