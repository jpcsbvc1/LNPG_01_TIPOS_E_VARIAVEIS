import java.util.Scanner;

class quintaClasse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double primeiraNota = myObj.nextInt();

        Scanner secondObj = new Scanner(System.in);
        System.out.println("Digite o peso da nota: ");
        double primeiroPeso = secondObj.nextInt();

        Scanner terceiroObj = new Scanner(System.in);
        System.out.println("Digite sua segunda nota: ");
        double segundaNota = terceiroObj.nextInt();

        Scanner quartoObj = new Scanner(System.in);
        System.out.println("Digite o peso da nota: ");
        double segundoPeso = quartoObj.nextInt();

        Scanner quintoObj = new Scanner(System.in);
        System.out.println("Digite a terceira nota: ");
        double terceiraNota = quintoObj.nextInt();

        Scanner sextoObj = new Scanner(System.in);
        System.out.println("Digite o peso da nota: ");
        double terceiroPeso = sextoObj.nextInt();

        double mediaPonderada;

        mediaPonderada = ((primeiraNota * primeiroPeso) + (segundaNota * segundoPeso) + (terceiraNota * terceiroPeso)) / (primeiroPeso + segundoPeso + terceiroPeso);

        System.out.println("Sua média ponderada seria: " + mediaPonderada );
    }
}
