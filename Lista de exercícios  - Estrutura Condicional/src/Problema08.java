import java.util.Scanner;

/* Problema 08 "temperatura": Deseja-se converter uma medida de temperatura da escola
 * Celsius para Fahrenheit ou vice-versa. Para isso, você deve construir um programa
 * que leia a letra "C" ou "F" indicando em qual escola vai ser informado uma 
 * temperatura. Em seguida o programa deve mostrar a temperatura na outra escola com 
 * duas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para 
 * Celsius ( você deve deduzir a fórmula de Celsius para Fahrenheit) 
 *   C = 5/9(F -32)    F 
 */
public class Problema08 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);
        char escalaDeTemperatura;
        double temperatura;

        /** Entrada *************************************************/
        System.out.print("Voê vai digitar a temperatura em qual escala (C/F)?");
        escalaDeTemperatura = input.next().charAt(0);

        /** Calculos necessarios ************************************/        
        if (escalaDeTemperatura == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = input.nextDouble();
            System.out.printf("Temperatura equivalente em Celsius: %.2f", (temperatura - 32)* 5/9) ;
        } 
        if (escalaDeTemperatura == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = input.nextDouble();
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", (temperatura * 1.8) + 32) ;

        }
        input.close();
    }
    
}
