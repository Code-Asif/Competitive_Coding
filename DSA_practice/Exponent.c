#include<stdio.h>

//using loop
long Pow1(int m, int n){
    long ans=1;
    for(int i=1; i<=n; i++){
        ans *= m;
    }
    return ans;
}

// Using recursion 1
long Pow2(int m, int n){
    if(n==0) return 1;
    else return m*Pow2(m, n-1);
}

// Using recursion 2
long Pow3(int m, int n){
    if(n==0) return 1;
    if(n%2==0) return Pow3(m*m, n/2);
    else return m*Pow3(m*m, (n-1)/2);
}

int main(){
    printf("%ld", Pow2(2,5));
    return 0;
}