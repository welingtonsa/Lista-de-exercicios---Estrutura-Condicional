import java.util.Scanner;

/* Problema 01 "Notas": Fazer um programa para ler as duas notas
 *  que um aluno obteve no primeiro e segundo semestres de uma 
 * disciplina anual. Em segida, mostrar a nota final fque o aluno
 * obteve (com uma casa decimal) no ano juntamente com um tecto
 * explicatico. Caso a nota final do aluno seja inferior a 
 * 60.00, mostrar a mensagem "REPROVADO", conforme exemplos.
 */
public class Problema01 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);
        double total, nota01, nota02;

        /** Entrada *************************************************/
        System.out.print("Digite a primeira nota: ");
        nota01 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota02 = input.nextDouble();

        /** Calculos necessarios ************************************ */
        total = nota01 + nota02;

        /** Saida ****************************************************/
        if (total > 60) {
            System.out.printf("NOTA FINAL = %.1f", total);
        } else {
            System.out.printf("NOTA FINAL = %.1f\nREPROVADO", total);
            
        }
        input.close();;
    }
    
}
