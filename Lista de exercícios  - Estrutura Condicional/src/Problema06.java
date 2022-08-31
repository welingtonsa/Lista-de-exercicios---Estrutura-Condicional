import java.util.Scanner;

/* Problema 06 "glicose": Fazer um programa para ler a quantidade de glicose
 * no sangue de uma pessoa e depois mostrar na tela a clssificação desta
 * glicose de acordo com a tabela de referência ao lado.
 * 
 *  Classificasção :   Glicose
 *  Normal             Até 100mg/dl
 *  Elevado            Maior que 100 até 140mg/dl
 *  Diabetes           Maior de 140 mg/dl
*/
public class Problema06 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in); 
        double valorDaGlicose;

        /** Entrada *************************************************/
        System.out.print("Digite a medida da glicose: ");
        valorDaGlicose = input.nextDouble();

        /** Saida ****************************************************/
        if (valorDaGlicose <= 100) {
            System.out.println("Classificação: normal");
        }
        if (valorDaGlicose > 100 & valorDaGlicose <= 140) {
            System.out.println("Classificação: elevado");
        }
        if (valorDaGlicose > 140) {
            System.out.println("Classificação: diabetes");
        }
        input.close();
    }
    
}
