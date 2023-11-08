import java.util.Scanner;
        import java.util.Calendar;

public class anoDeNascimento {
    public static void main(String[] args) {
        /*Crie um programa em Java que peça ao usuário para inserir seu ano de nascimento e,
        em seguida, calcule e exiba a idade.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira seu ano de nascimento: ");
        int anoDeNascimento = scanner.nextInt();

        //Criei um objeto do tipo Calendar, o 'calendario' e armazenei o ano atual em um int
        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);
        int idade = anoAtual - anoDeNascimento;

        System.out.println("A sua idade é " + idade + ".");

    }
}
