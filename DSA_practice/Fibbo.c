#include<stdio.h>

int f[10] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

//Recursive function
int fib(int n){
    if(n<=1) return n;
    else return fib(n-2)+fib(n-1);
}

//Iterative function
int fib2(int n){
    int t0=0, t1=1,s;
    if(n<=1) return 1;
    else {
        for(int i=2; i<=n; i++){
            s = t1+t0;
            t0 = t1;
            t1 = s;
        }
        return s;
    }
}

//Optimized function
int fib3(int n){
    if(n<=1) {
        f[n] = n;
        return n;
    }
    else{
        if(f[n-2]==-1) f[n-2] = fib3(n-2);
        if(f[n-1]==-1) f[n-1] = fib3(n-1);
        return f[n-2]+f[n-1];
    }
}

int main(){
    printf("%d", fib3(10));
    return 0;
}