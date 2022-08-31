import java.util.Scanner;

/* Problema 12 "tempo_de_jogo": Leia a hora inicial e a hora final de jogo. A seguir calcule
 * a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
 * tendo uma duração mínima de 1 hora e máxima de 24hrs. 
 */
public class Problema12 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in); 
        int horaFinal, horaInicial, duraçãoDoJogo;

        /** Entrada *************************************************/
        System.out.print("Hora inicial: ");
        horaInicial = input.nextInt();
        System.out.print("Hora final: ");
        horaFinal = input.nextInt();

        /** Calculos necessarios ************************************/
        duraçãoDoJogo =    (horaInicial - horaFinal) + 24;

        /** Saida ***************************************************/
        System.out.printf(" %d", duraçãoDoJogo);
        input.close();
    }
    
}