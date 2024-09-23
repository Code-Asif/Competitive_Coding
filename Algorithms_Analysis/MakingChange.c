#include<stdio.h>
void makingChange(int n, int d[], int a);

void main(){
    int n, d[10], i, a;
    printf("Enter the dimentions of coins: ");
    scanf("%d", &n);

    for(int i=0; i<n; i++){
        printf("Enter the dimentions value at %d : ", i);
        scanf("%d", &d[i]);
    }

    printf("Enter the value of amount: ");
    scanf("%d", &a);

    // for(int i=0; i<a; i++){
    //     printf("%5d", d[i]);
    // }

    makingChange(n, d, a);
}

void makingChange(int n, int d[], int a){
    int c[100][100], s[10], t=0;
    for(int i=0; i<n; i++){
        for(int j=0; j<a; j++){
            c[i][j] = 0;
        }
    }

    for(int i=1; i<n; i++){
        for(int j=1; j<a; j++){
            if(i == 1 && j<d[i]){
                c[i][j] = -1;
            }
            else if(i==1){
                c[i][j] = 1+c[i][j-d[1]];
            }
            else if(j<d[i]){
                c[i][j] = c[i-1][j];
            }
            else {
                if(c[i-1][j] < (1+c[i][j-d[i]])){
                    c[i][j] = c[i-1][j];
                }else{
                    c[i][j] = 1+c[i][j-d[i]];
                }
            }
        }
    }

    for(int i=0; i<n; i++){
        for(int j=0; j<a; j++){
            printf("%5d", c[i][j]);
        }
    }
}