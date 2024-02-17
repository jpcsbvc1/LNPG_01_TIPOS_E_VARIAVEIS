import java.util.Scanner;

class terceiraClasse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Qual a temperatura em celsius na sua cidade? ");

        int celsius = myObj.nextInt();

        double fahrenheit;

        fahrenheit = celsius * 1.8 + 32;

        System.out.println("A temperatura convertida para Fahreneit seria de " + fahrenheit);
    }
}
