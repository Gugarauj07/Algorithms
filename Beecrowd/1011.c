#include <stdio.h>
#include <math.h>

int main() {
    double raio;
    
    scanf("%lf", &raio);
    printf("VOLUME = %.3lf\n", (4.0/3) * 3.14159 * pow(raio, 3));
    return 0;

}