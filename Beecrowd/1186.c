#include <stdio.h>

int main()
{
    float matriz[12][12];
    char operacao;
    float soma = 0, count = 0;
    scanf("%c", &operacao);


    for (int i = 0; i < 12; i++)
    {
        for (int j = 0; j < 12; j++)
        {
            scanf("%f", &matriz[i][j]);
            if (j>=((12) - i)) {soma += matriz[i][j];
            count++;}
        }
    }
    if (operacao == 'S') printf("%.1f\n", soma);
    else if (operacao == 'M') printf("%.1f\n", soma/count);
    return 0;
}