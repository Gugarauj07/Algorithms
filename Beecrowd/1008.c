#include <stdio.h>

int main() {
    int number, horas; 
    float valor, salario;
    scanf("%d", &number);
    scanf("%d", &horas);
    scanf("%f", &valor);
    salario = horas * valor;

    printf("NUMBER = %d\n", number);
    printf("SALARY = U$ %.2f\n", salario);
    return 0;
}