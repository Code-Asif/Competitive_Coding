#include<stdio.h>
int main(){
    int dis;
    printf("Enter distance: ");
    scanf("%d", &dis);

    float kmsToMeter = dis*1000;
    float kmsTofeet = dis*3280.64;
    float kmsToInches = dis*39370.079;
    float kmsToYard = dis*1093.613;
    float kmsToCenti = dis*100000;

    printf("Distance in Meter: %f\n", kmsToMeter);
    printf("Distance in feet: %f\n", kmsTofeet);
    printf("Distance in inches: %f\n", kmsToInches);
    printf("Distance in yard: %f\n", kmsToYard);
    printf("Distance in centimeter: %f\n", kmsToCenti);


    return 0;
}