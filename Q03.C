#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int celsius;
    float fahrenheit;
    printf("Quantos graus Celsius está na sua cidade? ");
    scanf("%d", &celsius);

    fahrenheit = celsius * 1.8 + 32;
    printf("A temperatura da sua cidade equivaleria a %f\n ", fahrenheit);
    
}