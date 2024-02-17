import java.util.Scanner;

class segundaClasse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numero = myObj.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é par.");
        }
        else if (numero % 2 != 0) {
            System.out.println("O número é ímpar.");
        }
    }
}
