#include <stdio.h>

int seis_impares(int X)
{
    for (int i = X; i < X+12; i+=2)
    {
        printf("%d\n", i);
    }
    return 0;
}

int main() {
    int X;
    scanf("%d", &X);
    if (X % 2 == 0)
    {
        seis_impares(X+1);
    }
    else
    {
        seis_impares(X);
    }
    return 0;
}