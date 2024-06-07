#include<stdio.h>

//Factorial function
int fact(int n){
    if(n==0 || n==1) return 1;
    else return fact(n-1)*n;
}

//Combination function
int com(int n, int r){
    int t1, t2, t3;
    t1 = fact(n);
    t2 = fact(r);
    t3 = fact(n-r);
    return t1/(t2*t3);
}
int main(){
    printf("%d", com(5,2));
    return 0;
}