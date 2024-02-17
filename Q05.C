#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    float nota_um, nota_dois,nota_tres, peso_um, peso_dois, peso_tres, media_ponderada;

    printf("Qual a sua primeira nota? ");
    scanf("%f", &nota_um);
    printf("E qual o peso dela? ");
    scanf("%f", &peso_um);

    printf("Qual a sua segunda nota? ");
    scanf("%f", &nota_dois);
    printf("E qual o peso dela? ");
    scanf("%f", &peso_dois);

    printf("Qual a sua terceira nota? ");
    scanf("%f", &nota_tres);
    printf("E qual o peso dela? ");
    scanf("%f", &peso_tres);

    media_ponderada = ((peso_um * nota_um) + (peso_dois * nota_dois) + (peso_tres * nota_tres)) / (peso_um + peso_dois + peso_tres);
    
    printf("Sua média ponderada vale:%f ", media_ponderada);

    return 0;

}