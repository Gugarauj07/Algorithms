#include <stdio.h>

int main()
{
    int L, i, j;
    char T;
    double result, array[12][12];
    scanf("%d", &L);
    scanf(" %c", &T);

    for (i = 0; i < 12; i++)
    {
        for (j = 0; j < 12; j++)
        {
            scanf("%lf", &array[i][j]);
            if (i == L) result += array[L][j];
        }
    }

    if (T == 'M') result /= 12;
    printf("%.1f\n", result);
    return 0;
}