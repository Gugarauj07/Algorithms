#include <stdio.h>
#include <stdlib.h>

int main() {
    int entrada;
    scanf("%d", &entrada);
    int horas = entrada / 3600;
    int min = (entrada % 3600) / 60;
    int segund = ((entrada % 3600) % 60);
    printf("%d:%d:%d", horas, min, segund);
    return 0;
}