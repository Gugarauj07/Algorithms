#include <stdio.h>

int main()
{
    int entrada, i=1;
    while (entrada != 0)
    {
        scanf("%d", &entrada);
        while ( i != entrada )
        {
            printf("%d ", i++);
        }
        printf("%i\n", i);
    }
    return 0;
}