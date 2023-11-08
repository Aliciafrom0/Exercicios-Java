import java.util.Scanner;

public class exercicio13 {
    /*Escreva um programa que calcule o fatorial de um número inteiro não negativo fornecido pelo
     * usuário. O fatorial de um número N é o produto de todos os inteiros de 1 até N.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo:");
        int numeroInteiro = scanner.nextInt();

        if (numeroInteiro >= 0) {
            long fatorial = 1;

            for (int i = 1; i <= numeroInteiro; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numeroInteiro + " é: " + fatorial);

        } else {
            System.out.println("O número deve ser não negativo.");
        }

        scanner.close();
    }
}
