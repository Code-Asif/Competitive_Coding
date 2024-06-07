#include<stdio.h>

// Using recursion
long fact2(int n){
    if(n==0) return 1;
    else return fact2(n-1)*n;
}

// Using loop
long fact1(int n){
    long fac=1;
    for(int i=1; i<=n; i++){
        fac *= i;
    }
    return fac;
}
int main (){
    printf("%ld", fact1(34));
    return 0;
}