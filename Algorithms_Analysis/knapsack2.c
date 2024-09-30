#include <stdio.h>

int max(int a, int b) {
    return (a > b) ? a : b;
}

int knapsack(int W, int n, int w[], int v[]) {
    int dp[n + 1][W + 1];

    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= W; j++) {
            if (i == 0 || j == 0)
                dp[i][j] = 0; 
            else if (w[i - 1] <= j)
                dp[i][j] = max(dp[i - 1][j], v[i - 1] + dp[i - 1][j - w[i - 1]]);
            else
                dp[i][j] = dp[i - 1][j]; 
        }
    }

    return dp[n][W];
}

int main() {
    int n, W;

    printf("Enter the number of items: ");
    scanf("%d", &n);

    printf("Enter the capacity of the knapsack: ");
    scanf("%d", &W);

    int w[n], v[n];

    printf("Enter the weights of the items:\n");
    for (int i = 0; i < n; i++) {
        printf("Item %d: ", i + 1);
        scanf("%d", &w[i]);
    }

    printf("Enter the values of the items:\n");
    for (int i = 0; i < n; i++) {
        printf("Item %d: ", i + 1);
        scanf("%d", &v[i]);
    }

    int max_value = knapsack(W, n, w, v);
    printf("The maximum value that can be obtained is: %d\n", max_value);

    return 0;
}
