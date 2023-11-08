import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Crie um programa que converta uma quantia em dólares para outra moeda, como euros ou reais.
         Peça ao usuário para inserir a quantia em dólares e a taxa de câmbio atual.
         Em seguida, calcule e exiba o valor convertido.
         */

        System.out.println("Digite a quantia em dólares:");
        double quantiaDolares = scanner.nextDouble();

        System.out.println("Digite a taxa de câmbio atual:");
        double taxaCambio = scanner.nextDouble();

        double conversor = quantiaDolares * taxaCambio;

        System.out.println("A quantia convertida é: " + conversor);

        scanner.close();
    }
}
