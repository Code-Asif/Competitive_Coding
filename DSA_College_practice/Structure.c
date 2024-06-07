#include <stdio.h>

struct Rectangle
{
    int length;
    int breadth;
};
void initilize(struct Rectangle *r1, int l, int b){
    (*r1).length = l;
    (*r1).breadth = b;
}
int area(struct Rectangle r){
    return r.breadth*r.length;
}
void changeLength(struct Rectangle *r, int l){
    (*r).length = l;
}
int main()
{
    struct Rectangle r;
    initilize(&r, 10, 20);
    printf("Length = %d, Bredth = %d\n", r.length, r.breadth);
    printf("Area = %d\n", area(r));
    changeLength(&r, 20);
    printf("New length = %d\n", r.length);

    return 0;
}