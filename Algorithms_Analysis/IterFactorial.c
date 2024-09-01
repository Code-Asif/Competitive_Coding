#include<stdio.h>

// Iterative Approach
int main(){
    int num;
    printf("Enter number to find factorial: ");
    scanf("%d", &num);

    int fact = 1;
    for(int i=2; i<=num; i++){
        fact *= i;
    }
    
    printf("Factorial : %d", fact);
    return 0;
}