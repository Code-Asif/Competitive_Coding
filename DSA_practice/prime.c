#include<stdio.h>
int main(){
    int n=10; 
        int i=2;
        int count=0;
        while(i<n){
            if(n%i==0) {
                count++;
                break;
            }
            i++;
        }
        if(count==0) printf("Prime number");
        else printf("Not a prime number");
    return 0;
}