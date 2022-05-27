#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int fibonnaci(unsigned long long int entrada)
{
    unsigned long long int array[entrada];
    for (unsigned int i = 0; i <= entrada; i++)
    {
        if (i==0) array[i] = 0; 
        else if (i==1) array[i] = 1; 
        else 
        {
            array[i] = array[i-1] + array[i-2];
        }
    }
    printf("Fib(%lld) = %lld\n", entrada, array[entrada]);
    return 0;
}

int main() {
    unsigned long long int num, entrada;
    scanf("%lld", &num);
    unsigned long long int  vetor_entrada[num];
    for (unsigned int i = 0; i < num; i++) 
    {
        scanf("%lld", &entrada);
        if (entrada >= 0 && entrada <= 60){
            vetor_entrada[i] = entrada;
        }
        else continue;
        
    }
    for (unsigned int i = 0; i < num; i++) 
    {
        fibonnaci(vetor_entrada[i]);
    }

    return 0;
}