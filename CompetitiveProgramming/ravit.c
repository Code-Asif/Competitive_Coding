#include <stdio.h>
// #include<string.h>

/*
 *
 * *
 * * *
 * * * *
 * * * * *
 */

//  1, 2, 3
//  4, 5, 6
//  7, 8, 9

//  1, 2, 3
//  4, 5, 6
//  7, 8, 9

void number(int num)
{
    for (int a = num; a >= 1; a = a - 2)
    {
        printf("%d ", a);
    }
}

void matrix(int mat[][], int n, int m){
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            scanf("%d", &mat[i][j]);
        }
    }
}

void main()
{
    int n;
    printf("Enter n: ");
    scanf("%d", &n);

    int mat[n][n];
    matrix(mat);

}