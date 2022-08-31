import java.util.Scanner;

/* Problema 10 "aumento": Um empresa vai conceder um aumento percentual de salário aos
 * seus funcionários dependendo de quanto cada pessoa ganha, conforme tabela ao lado.
 * Fazer um programa para ler o salário de uma pessoa, daí mostrar qual o novo salário
 * desta pessoa depois do aumento, quanto doi o aumento e qual doi a porcentagem de 
 * aumento.
 */
public class Problema11 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);
        double salarioRecebido = 0, novoSalario = 0, aumentoSalarial =0;
        int porcentagem = 0;

        /** Entrada *************************************************/
        System.out.print("Digite o salário da pessoa: ");
        salarioRecebido = input.nextDouble();
        
        /** Calculos necessarios ************************************/
        if (salarioRecebido <= 1000.00) {
            aumentoSalarial = (salarioRecebido / 100) * 20;
            novoSalario = aumentoSalarial + salarioRecebido;
        }
        if (salarioRecebido > 1000.00 || salarioRecebido <= 3000.00 ) {
            aumentoSalarial = (salarioRecebido / 100) * 15;
            novoSalario = aumentoSalarial + salarioRecebido;
            porcentagem = 15;
        }
        if (salarioRecebido > 3000.00 || salarioRecebido < 8000.00 ) {
            aumentoSalarial = (salarioRecebido / 100) * 10;
            novoSalario = aumentoSalarial + salarioRecebido;
            porcentagem = 10;
        }
        if (salarioRecebido > 8000.00 ) {
            aumentoSalarial = (salarioRecebido / 100) * 5;
            novoSalario = aumentoSalarial + salarioRecebido;
            porcentagem = 5;
        }

        /** Saida ***************************************************/
        System.out.printf("Novo salário = R$ %.2f\n", novoSalario);
        System.out.printf("Aumento = R$ %.2f\n", aumentoSalarial);
        System.out.printf("Porcentagem = %d%% \n", porcentagem);
        input.close();
    }
    
}