// Qno. 34
#include<stdio.h>
int main(){
    float tv, vcr, remote, cd, tape;
    printf("Enter the quantity of each equipment: \n");
    printf("No. of TV: ");
    scanf("%f", &tv);

    printf("No. of VCR: ");
    scanf("%f", &vcr);

    printf("No. of Remote controller: ");
    scanf("%f", &remote);

    printf("No. of CD: ");
    scanf("%f", &cd);

    printf("No. of Tape recorder: ");
    scanf("%f", &tape);
    double subtotal = (tv*400)+(vcr*220)+(remote*35.20)+(cd*300)+(tape*150);
    printf("Subtotal : %lf\n", subtotal);
    double total = (subtotal)+(subtotal*0.0825);
    printf("Total : %lf", total);
    return 0;
}