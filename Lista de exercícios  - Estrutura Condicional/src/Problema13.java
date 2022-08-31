import java.util.Scanner;

/* Problema 13 "Coordenadas": Leia os valores das coordenadas X e Y de um ponto no 
 * plano cartesiano. A seguir, determine qual o quadrante ao qual pertence o ponto
 * ( Q1, Q2, Q3 e Q4). Se o ponto estiver na origem, escreva a ,emsage, "Origem".
 * Se o ponto estiver sobre um dos eixos escreva "Eixo X" ou "Eixo Y", conforme
 * for a situação.
 */
public class Problema13 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);
        double valorX, valorY;

        /** Entrada *************************************************/
        System.out.print("Valor de X: ");
        valorX = input.nextDouble();
        System.out.print("Valor de Y: ");
        valorY = input.nextDouble();

        /** Calculos necessarios ************************************/
        if (valorX > 0 & valorY > 0) {
            System.out.print("Q1 ");
        }
        if (valorX < 0 & valorY > 0) {
            System.out.print("Q2 ");
        }
        if (valorX < 0 & valorY < 0) {
            System.out.print("Q3 ");
        }
        if (valorX > 0 & valorY < 0) {
            System.out.print("Q4");
        }
        if (valorX == 0 & valorY == 0) {
            System.out.println("Origem");
        }        
        if (valorX == 0 & valorY > 0) {
            System.out.println("Eixo Y");
        }
        if (valorY == 0 & valorX > 0) {
            System.out.println("Eixo X");
        }
        input.close();
    }
    
}