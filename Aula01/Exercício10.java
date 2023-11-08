import java.util.Scanner;
/*Crie um programa em Java que peça ao usuário para inserir uma temperatura em graus Celsius
         e, em seguida, converta essa temperatura em graus Fahrenheit usando a fórmula:
         Fahrenheit = (Celsius * 9/5) + 32. Exiba o resultado na tela.*/

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma temperatura em graus Celsius: ");
        double Celsius = scanner.nextDouble();

        double Fahrenheit = (Celsius * 9/5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + Fahrenheit + ".");

        scanner.close();
    }
}
