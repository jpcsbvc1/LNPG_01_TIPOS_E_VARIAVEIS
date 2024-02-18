import java.util.Scanner;

class quartaClasse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = myObj.nextInt();

        if (idade >= 0 && idade <18){
            System.out.println("Menor de idade.");
        } else if (idade >=18) {
            System.out.println("Maior de idade.");
        }
    }
}
