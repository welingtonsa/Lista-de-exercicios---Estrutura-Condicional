import java.util.Scanner;

/* Problema 04 "operado": Uma pperadora de telefonia cobra R$50,00 por
 * um plano básico que dá direito a 100 minutps de telefone. Cada minutp
 * que exceder a franquia de 100 minutos custa R$2,00. Fazer um programa
 * para ler a quantidade de minutos que uma pessoa consumiu, dai mostrar o 
 * valor a ser pago. 
 */
public class Problema04 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);
        int minutos;
        double total;

        /** Entrada *************************************************/
        System.out.print("Digite a quantidade de minutos: ");
        minutos = input.nextInt();

        /** Saida ****************************************************/  
        if (minutos >= 101 ) {
            total = ((minutos %100) * 2) + 50;
            System.out.printf("Valor a pagar : R$%.2f", total);
        } else {
            total = 50;
            System.out.printf("Valor a pagar : R$%.2f", total);
        }
         input.close(); 
    }
    
    
}
