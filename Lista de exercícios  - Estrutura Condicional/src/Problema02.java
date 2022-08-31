import java.util.Scanner;

/* Problema 02 "bhaskara": Fazer um programa para ler os três 
 * coeficientes de uma equação do segundo grau. Usando a 
 * fórmula de Bhaskara, calcular e mostrar os valores das 
 * raizes x1 e x2 da equação com quatro casas decimais, 
 * conforme exemplo. Se a equação não possuir raizes, 
 * mostrar uma mensagem. 
 */
public class Problema02 {
    public static void main(String[] args) {
         /** Variaveis de controle ***********************************/
         Scanner input = new Scanner(System.in);
         double  a, b, c, delta, x1, x2;

         /** Entrada *************************************************/
         System.out.print("Coeficiente a: ");
         a = input.nextDouble();
         System.out.print("Coeficiente b: ");
         b = input.nextDouble();
         System.out.print("Coeficiente c: ");
         c = input.nextDouble();

         /** Calculos necessarios *************************************/
        delta = (b * b) - (4 * a * c);
        
         /** Saida ****************************************************/
        if (delta > 0) {
            x1 = ((-1 *b) + Math.sqrt(delta))/(2*a);
            x2 = ((-1 *b) - Math.sqrt(delta))/(2*a);
            System.out.printf("X1 = %.4f\n",x1);
            System.out.printf("X2 = %.4f\n",x2);
        } else {
            System.out.println("Esta equação não possui raízes reais.");            
        }
        input.close();
    }
    
}
