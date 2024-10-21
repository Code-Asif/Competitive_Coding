#include<stdio.h>
#include<string.h>

char b[100][100], x[100], y[100];

void lcs(char x[], char y[]);
void sequence(int i, int j);

void main() {
    printf("Enter the Sequence No 1: ");
    scanf("%s", x);
    
    printf("Enter the Sequence No 2: ");
    scanf("%s", y);

    lcs(x, y);
}

void lcs(char x[], char y[]) {
    int c[100][100], i, j, m, n;
    m = strlen(x);
    n = strlen(y);

    for (i = 0; i <= m; i++) {
        for (j = 0; j <= n; j++) {
            c[i][j] = 0;
        }
    }

    for (i = 1; i <= m; i++) {
        for (j = 1; j <= n; j++) {
            if (x[i - 1] == y[j - 1]) {
                c[i][j] = c[i - 1][j - 1] + 1;
                b[i][j] = 'c'; 
            } else if (c[i - 1][j] >= c[i][j - 1]) {
                c[i][j] = c[i - 1][j];
                b[i][j] = 'u'; 
                } else {
                c[i][j] = c[i][j - 1];
                b[i][j] = 'l'; 
           }
        }
    }

    printf("    ");
    for (j = 0; j <= n; j++) {
        printf("%d ", j);  
    }
    printf("\n");

    for (i = 0; i <= m; i++) {
        printf("%d   ", i);
        for (j = 0; j <= n; j++) {
            printf("%d ", c[i][j]);  
        }
        printf("\n");
    }

    printf("\nLCS = ");
    sequence(m, n);  
    printf("\n");
}

void sequence(int i, int j) {
    if (i == 0 || j == 0) {
        return;
    } else if (b[i][j] == 'c') {
        sequence(i - 1, j - 1);
        printf("%c", x[i - 1]);  
    } else if (b[i][j] == 'u') {
        sequence(i - 1, j); 
    } else {
        sequence(i, j - 1); 
    }
}