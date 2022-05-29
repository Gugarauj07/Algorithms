#include <stdio.h>

int main()
{
    int entrada, counter;
    scanf("%d", &entrada);
    for (int i = 0; i <entrada; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            counter++;
            printf("%d ", counter);
        }
        counter++;
        printf("PUM\n");
    }
    return 0;
}