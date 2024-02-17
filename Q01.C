#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int num, num2, soma, sub, mul, div;

    printf("Digite um inteiro: ");
    scanf("%d", &num);

    printf("Digite outro inteiro: ");
    scanf("%d", &num2);

    soma = num + num2;
    sub = num - num2;
    mul = num * num2;
    div = num / num2;

    printf("A soma de %d e %d vale: %d\n", num, num2, soma);
    printf("A subtração de %d e %d vale: %d\n", num, num2, sub);
    printf("O produto de %d e %d vale: %d\n", num, num2, mul);
    printf("A divisão de %d e %d vale: %d\n", num, num2, div);
}
