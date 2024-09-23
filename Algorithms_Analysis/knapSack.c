#include<stdio.h>

void main(){
    float p[] = {10, 5, 12, 20, 3};
    float w[] = {3, 14, 2, 10, 1};
    int n = 5;
    float x[n];
    int M = 20;

    float pByw[n];
    printf("P/W: ");
    for(int i=0; i<n; i++){
        pByw[i] = (float)p[i] / (float)w[i];
        printf("%.3f ", pByw[i]);
    }
    printf("\n");

    for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1; j++){
            if(pByw[j] < pByw[j+1]){
                float temp = pByw[j];
                pByw[j] = pByw[j+1];
                pByw[j+1] = temp;

                int temp2 = w[j];
                w[j] = w[j+1];
                w[j+1] = temp2;

                int temp3 = p[j];
                p[j] = p[j+1];
                p[j+1] = temp3;
            }
        }
    }
    printf("P/W: ");
    for(int i=0; i<n; i++){
        printf("%.3f ", pByw[i]);
    }
    printf("\n");

    int totalW = 0;
    int totalP = 0;

    for(int i=0; i<n; i++){
        if(totalW + w[i] <= M){
            totalW += w[i];
            totalP += p[i];
            x[i] = 1;
        } else {
            int rem = M - totalW;
            float perc = p[i]*((float)rem/w[i]);
            totalP += perc;
            x[i] = perc-1;
            totalW = M;
            break;
        }
    }

    printf("Element inserted (Fesiable Solution) :");
    for(int i=0; i<n; i++){
        printf("%.3f ", x[i]);
    }
    printf("\n");

    printf("Total Weight: %d\n", totalW);
    printf("Total Profit (Optimal Solution): %d\n", totalP);

}
