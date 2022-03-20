#include <stdio.h>
#include <math.h>

int main()
{
    float veloc, tempo;
    scanf("%f\n%f", &tempo, &veloc);
    printf("%.3f\n", tempo * veloc / 12);
    return 0;
}