#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int idade;

    printf("Qual a sua idade? ");
    scanf("%d", &idade);

    if (idade >= 0 && idade < 18 )
    {
        printf("Você é menor de idade.");
    }
    else if (idade >= 18 )
    {
        printf("Você é maior de idade.");
    }
    
}