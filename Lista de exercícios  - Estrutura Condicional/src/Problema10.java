import java.util.Scanner;

/* Problema 10 "multiplos": Fazer um programa para ler dois números inteiros, 
 * e dizer se um número é múltiplo do outro. Os números podem ser digitados
 * em qualquer ordem. 
 */
public class Problema10 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);
        int inteiroA, inteiroB;

        /** Entrada *************************************************/
        System.out.println("Digite dois números inteiros:");
        inteiroA = input.nextInt();
        inteiroB = input.nextInt();

         /** Saida ***************************************************/
        if ((inteiroA % inteiroB) == 0 || (inteiroB % inteiroA) == 0) {
            System.out.println("São multiplos!");  
                      
        }else{
            System.out.println("Não são múltiplos");
        }
        input.close();
       
    }
    
}