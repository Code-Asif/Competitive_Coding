#include <stdio.h>

int main() {
    /*
    for n = 6
    6 6 6 6 6 6 5 5 5 5 5 5 4 4 4 4 4 4 3 3 3 3 3 3 2 2 2 2 2 2 1 1 1 1 1 1
    6 6 6 6 6 5 5 5 5 5 4 4 4 4 4 3 3 3 3 3 2 2 2 2 2 1 1 1 1 1
    6 6 6 6 5 5 5 5 4 4 4 4 3 3 3 3 2 2 2 2 1 1 1 1
    6 6 6 5 5 5 4 4 4 3 3 3 2 2 2 1 1 1
    6 6 5 5 4 4 3 3 2 2 1 1
    6 5 4 3 2 1
    */
    printf("Iterative approach\n");
    int n=6;
    for (int i = n; i >= 1; i--) {
        for (int j = n; j >= 1; j--) {
            for (int k = 1; k <= i; k++) {
                printf("%d ", j);
            }
        }
        printf("\n");
    }
    return 0;
}
