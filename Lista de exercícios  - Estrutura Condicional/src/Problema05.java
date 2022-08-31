import java.util.Scanner;

/* Problema 05 "troco_verificado": Fazer um programa para calcular o troco no processo
 * de pagamento de um produto de uma mercearia. O programa deve ler o preço unitário
 * do produto, a quantidade de unidades compradas deste produto, e o valor em dinheiro
 * dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido ao cliente.
 * Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando
 * o valor restante conforme o exemplo.
 */
public class Problema05 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in); 
        double valorPorUnidade, valorRecebido;
        int quantidadeDeProdutos;

        /** Entrada *************************************************/
        System.out.print("Preço unitário do produto: ");
        valorPorUnidade = input.nextDouble();
        System.out.print("Quantidade comprada: ");
        quantidadeDeProdutos = input.nextInt();
        System.out.print("Dinheiro recebido: ");
        valorRecebido = input.nextDouble();

        /** Saida ***************************************************/
        if ((quantidadeDeProdutos * valorPorUnidade) < valorRecebido) {
            System.out.printf("TROCO = %.2f", valorRecebido - (quantidadeDeProdutos * valorPorUnidade));
        }else{
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f", (valorRecebido - (quantidadeDeProdutos * valorPorUnidade)) * -1);
        }
        input.close();
    }
    
}
