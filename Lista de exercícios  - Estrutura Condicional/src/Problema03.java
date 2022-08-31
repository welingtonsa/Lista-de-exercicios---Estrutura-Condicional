import java.util.Scanner;
/* Problema 03 "menor_de_tres": Fazer um programa para ler três
 * números inteiros. Em seguida, mostrar qual o menor dentre os 
 * três números lidos. Em caso de empate, mostrar apenas uma
 * vez.
 */
public class Problema03 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);
        double primeiroValor, segundoValor, terceiroValor, menor;

         /** Entrada *************************************************/
        System.out.print("Primeiro valor: ");
        primeiroValor = input.nextDouble();
        System.out.print("Segundo valor: ");
        segundoValor = input.nextDouble();
        System.out.print("Terceiro valor: ");
        terceiroValor = input.nextDouble();

         /** Calculos necessarios *************************************/
         menor = primeiroValor;
         if (segundoValor < menor) {
            menor = segundoValor;
         }
         if (terceiroValor < menor) {
            menor = terceiroValor;            
         }

         /** Saida ****************************************************/
         System.out.printf("Menor = %.0f", menor);
         input.close();
    }
}
