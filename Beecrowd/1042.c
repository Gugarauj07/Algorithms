#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, b, c, temp;
    
    scanf("%d %d %d", &a, &b, &c);
    int array[] = {a, b, c};
    int len = sizeof(array)/sizeof(array[0]);
    for (int i = 0; i < len-1; i++)
    {
        for (int j = 0; j < len-i-1; j++)
        {
              if(array[j] > array[j + 1]){               

                temp = array[j];

                array[j] = array[j + 1];

                array[j + 1] = temp;
              }
        }
    }
    for(int x = 0; x < len; x++){

        printf("%d\n", array[x]);

    }

    printf("\n");

    
    printf("%d\n", a);
    printf("%d\n", b);
    printf("%d\n", c);

    return 0;
}