#include <stdio.h>
 
int main() {
    int J = 60;
    int I = 1;
    for (int x = 0; x <= 12; x++)
    {
        printf("I=%d ", I);
        printf("J=%d\n", J);
        J-=5;
        I+=3;
    }
    return 0;
}