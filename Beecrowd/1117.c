#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#define max_lim 10
#define min_lim 0

bool fora_de_limite(int num)
{
    if (max_lim < num || min_lim > num)
    {
        printf("nota invalida\n");
        return 1;
    }
    else return 0;
}

int main() {
    int j=0;
    float n, N[3];
    while (true) 
    {
        scanf("%f", &n);
        if (fora_de_limite(n)) {continue;}
        N[j] = n;
        j++;
        if (j>1) break;
    }

    float media = (N[0] + N[1]) / 2.0;
    printf("media = %.2f\n", media);
    
    return EXIT_SUCCESS;
}