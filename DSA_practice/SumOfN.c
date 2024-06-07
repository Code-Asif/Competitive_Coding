#include<stdio.h>

//Using formula
int sum1(int n){
    return n*(n+1)/2;
}

//Using Recursion
int sum2(int n){
    if(n==0) return 0;
    else return sum2(n-1)+n;
}

//Using loop
int sum3(int n){
    int sum=0;
    for(int i=1; i<=n; i++){
        sum += i;
    }
    return sum;
}
int main(){
    printf("%d", sum3(100000));
    return 0;
}