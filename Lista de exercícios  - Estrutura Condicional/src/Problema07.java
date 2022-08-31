import java.util.Scanner;

/* Problema 07 "dardo": No arremesso de dardo, o atleta tem três chances
 * para lançar o dardo à maior distância que conseguir. Você deve criar
 * um prgrama para, dadas as medidas das três tentativas de lanlamento, 
 * informar qual foi a maior. 
 */
public class Problema07 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);
        double arremesso_01, arremesso_02, arremesso_03, maior;

        /** Entrada *************************************************/
        System.out.println("digite as três distâncias:");
        arremesso_01 = input.nextDouble();
        arremesso_02 = input.nextDouble();
        arremesso_03 = input.nextDouble();

        /** Calculos necessarios ************************************/
        maior = arremesso_01;
        if (arremesso_02 > maior) {
            maior = arremesso_02;
        }
        if (arremesso_03 > maior) {
            maior = arremesso_03;
        }
        /** Saida ***************************************************/
        System.out.printf("MAIOR DISTÂNCIA = %.2f", maior);
        input.close();
    }
    
}