public class IdadeParaVotar {
    /**
     * Escreva um programa que leia a idade do usuário e imprima respostas diferentes
     * dependendo do número colocado:
     * Se for menor de 16 anos, avisar que não pode votar
     * Se tiver 16 ou 17, avisar que o voto é facultativo
     * Se tiver mais de 65, avisar que também é facultativo o voto
     * De 18 até 65, é obrigatório votar.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Digite sua idade: ");
        int idade;
        idade = scanner.nextInt();


        // Usamos 'else if' para garantir que somente 1 print seria exibido
        if (idade < 16) {
            System.out.println("Você não pode votar.");
        } else if (idade <= 17 || idade> 65) {
            System.out.println("O voto é facultativo.");
        } else {
            System.out.println("O voto é obrigatório.");
        }

        scanner.close();
    }

}
