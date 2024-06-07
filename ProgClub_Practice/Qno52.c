#include<stdio.h>
int main(){
    int l,b;
    printf("Enter length and width of rectangle: ");
    scanf("%d %d", &l, &b);

    int area = l*b;
    int peri = 2*(l+b);
    if(area > peri) printf("Area is greater than perimeter");
    else printf("Area is less than perimeter");
    return 0;
}