import java.util.Scanner;

public class exercicio11 {
    /*Peça ao usuário que digite uma palavra ou frase e conte quantas vogais
     * (a, e, i, o, u) estão presentes. Exiba o número de vogais na tela.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra que contenha vogais: ");
        String palavra = scanner.nextLine().toLowerCase();

        int contarVogais = 0;

        for (int i = 0; i < palavra.length(); i++) {
            // Pega cada letra do texto, testa se é vogal e acumula
            char letter = palavra.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                contarVogais++;
            }
        }
        System.out.println("O número de vogais na entrada é: " + contarVogais);

        scanner.close();

    }
}
