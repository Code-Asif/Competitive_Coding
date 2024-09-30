#include <stdio.h>
#include <limits.h>

int matrixChainOrder(int p[], int n) {
    int m[n][n];

    for (int i = 1; i < n; i++)
        m[i][i] = 0;

    for (int L = 2; L < n; L++) {
        for (int i = 1; i <= n - L; i++) {
            int j = i + L - 1;
            m[i][j] = INT_MAX;

            for (int k = i; k < j; k++) {
                int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                if (q < m[i][j])
                    m[i][j] = q;
            }
        }
    }

    return m[1][n - 1];
}

int main() {
    int n;

    printf("Enter the number of matrices: ");
    scanf("%d", &n);

    int p[n + 1];
    printf("Enter the dimensions of the matrices (length %d):\n", n + 1);
    for (int i = 0; i <= n; i++) {
        printf("p[%d]: ", i);
        scanf("%d", &p[i]);
    }

    int minCost = matrixChainOrder(p, n + 1);

    printf("Minimum number of scalar multiplications is: %d\n", minCost);

    return 0;
}
