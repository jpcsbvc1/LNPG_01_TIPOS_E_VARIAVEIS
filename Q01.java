import java.util.Scanner;

class primeiraClasse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numero = myObj.nextInt();

        Scanner mySecondObj = new Scanner(System.in);
        System.out.println("Digite outro número: ");

        int numeroDois = mySecondObj.nextInt();

        int soma;
        int subtracao;
        int divisao;
        int multiplicacao;

        soma = numero + numeroDois;
        subtracao = numero - numeroDois;
        divisao = numero / numeroDois;
        multiplicacao = numero * numeroDois;

        System.out.println("A soma seria: " + soma );
        System.out.println("A subtração seria: " + subtracao );
        System.out.println("A multiplicação seria: : " + multiplicacao );
        System.out.println("A divisão seria: " + divisao );

    }
}
