import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String [] args) {
//Criar um programa que leia o valor do salário mínimo
        double SalarioMinimo = 1320.0;

//o valor do salário de um usuário
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o valor do salário: ");
        double salario = scanner.nextDouble();

//calcule a quantidade de salários mínimos que esse usuário ganha
        double quantidade = salario / SalarioMinimo;

//imprima na tela a quantia que o usuario ganha
        System.out.printf("O usuário ganha %.2f salários mínimos.", quantidade);

        scanner.close();
    }
}
