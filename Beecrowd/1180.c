#include <stdio.h>

int main()
{
    int tamanho, menor, posicao;
    
    scanf("%d", &tamanho);
    int array[tamanho];

    for (int i = 0; i < tamanho; i++)
    {
        scanf("%d", &array[i]);
        if (i == 0){
            menor = array[i];
            posicao = i;
        }
        else if (array[i] < menor) {
            menor = array[i];
            posicao = i;
        }      
    }
    
    printf("Menor valor: %d\n", menor);
    printf("Posicao: %d\n", posicao);
    return 0;
}