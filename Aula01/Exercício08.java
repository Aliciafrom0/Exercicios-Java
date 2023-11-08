import java.util.Scanner;

public class filaPrioritaria {
    public static void main(String[] args) {
        /*Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir um menu
        de opções, perguntando se a pessoa é Gestante, Idosa, PCD ou Nenhuma das alternativas.
        Se ela for PCD, Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito*/

        Scanner scanner = new Scanner(System.in);
        //criei um print para cada uma das opçoes ja que são várias
        System.out.println("Selecione uma opção:");
        System.out.println("1. Gestante");
        System.out.println("2. Idosa");
        System.out.println("3. PCD");
        System.out.println("4. Nenhuma das alternativas");

        //variável para guardar o número digitado pelo usuário
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Voce tem direito a fila prioritária como gestante.");
                break;
            case 2:
                System.out.println("Voce tem direito a fila prioritária como pessoa idosa.");
                break;
            case 3:
                System.out.println("Voce tem direito a fila prioritária como pessoa com deficiência.");
                break;
            case 4:
                System.out.println("Voce não tem direito a fila prioritária.");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
