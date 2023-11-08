import java.util.Scanner;

//Criar um programa que leia 3 números

public class MaiorMenorMedia {
    public static void main(String[] args) {
        double PrimeiroNumero, SegundoNumero, TerceiroNumero, MaiorNumero,
                MenorNumero, MediaAritmetica;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        PrimeiroNumero = Scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        SegundoNumero = Scanner.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        TerceiroNumero = Scanner.nextDouble();

//que imprima o maior numero
        if (PrimeiroNumero > SegundoNumero) {
            if (PrimeiroNumero > TerceiroNumero) {
                MaiorNumero = PrimeiroNumero;
            }
            else {
                MaiorNumero = TerceiroNumero;
            }
        }
            else {
            if (SegundoNumero > TerceiroNumero)
                MaiorNumero = SegundoNumero;
            }

//que imprima o menor numero
        if (PrimeiroNumero < SegundoNumero) {
            if (PrimeiroNumero < TerceiroNumero) {
                MenorNumero = PrimeiroNumero;
            } else {
                MenorNumero = PrimeiroNumero;
            }
        } else {
            if (SegundoNumero < TerceiroNumero) {
                MenorNumero = SegundoNumero;
        } else {
                MenorNumero = TerceiroNumero;
            }


        }

//e que de a média aritmética.
//obs: sempre usar parenteses para definir a prioridade nos cálculos.
        MediaAritmetica = (PrimeiroNumero + SegundoNumero + TerceiroNumero) / 3.0;

        System.out.println ("[solução com if] O maior número é: " + MaiorNumero);
        System.out.println ("[solução com if] O menor número é: " + MenorNumero);
        System.out.println ("[solução com if] A média aritmética é: " + MediaAritmetica);

        Scanner.close();
    }
}
