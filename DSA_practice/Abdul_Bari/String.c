#include<stdio.h>
#include<stdlib.h>

void ChangingTheCase(char string[], int n){
    for(int i=0; i<n; i++){
        string[i] += 32;
        printf("%c", string[i]);
    }
    printf("\n");
}
void Reverse(char string[], int n){
    for(int i=0; i<n/2; i++){
        char temp = string[i];
        string[i] = string[n-i-1];
        string[n-i-1] = temp;
    }
    for(int i=0; i<=n; i++){
        printf("%c", string[i]);
    }
}

void CheckPalindrome (char string[], int n){
    for(int i=0; i<n/2; i++){
        if(string[i] != string[n-i-1]){
            printf("\nString is not palindrome...\n");
            return;
        }
    }
    printf("\nString is palindrome...\n");
    return;
}

int main(){
    char str[] = "MADAM";
    char i=str[0];
    int count=0;
    for(char i =0; str[i] != '\0'; i++){
        count++;
    }
    printf("Length : %d\n", count);
    ChangingTheCase(str, 5);
    printf("Reverse: "); 
    Reverse(str, 5);
    CheckPalindrome(str, 5);
    return 0;
}