import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        /*Criar para uma empresa de consórcio. No teste inicial, você deve perguntar para o
        usuário a idade dele e o seu salário. A pessoa só pode comprar um automóvel se for
        de maior e ganhar mais de R$ 2.000,00.*/

        Scanner lerNumeros = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = lerNumeros.nextInt();

        System.out.print("Digite o seu salário: ");
        double salario = lerNumeros.nextDouble();

        if (idade > 18 && salario > 2.000) {
            System.out.println("Voce está autorizado a comprar um automóvel.");
        } else {
            System.out.println("Voce não está autorizado a comprar um automóvel.");
        }
    }
}
