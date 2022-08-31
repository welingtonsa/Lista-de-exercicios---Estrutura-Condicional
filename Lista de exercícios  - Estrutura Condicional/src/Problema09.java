import java.util.Scanner;

/* Problema 09 "lanchonete": Uma lanchonete possui vários produtos. Cada produto possui
 * um código e um preço. Você deve fazer um programa para ler o código e a quantidade
 * comprada de um produto (suponha um código válido), e dai informar qual o calor
 * a ser pago, com duas casas decimais, conforme tabela de produtos ao lado.
 */
public class Problema09 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);
        int codigoDoProduto, quantidadeDoProduto;
        double valordoProduto = 0, valorAPagar;

        /** Entrada *************************************************/
        System.err.print("Código do produto comprado: ");
        codigoDoProduto = input.nextInt();
        System.out.print("Quantidade do produto: ");
        quantidadeDoProduto = input.nextInt();

        /** Calculos necessarios ************************************/
        switch (codigoDoProduto) {
            case 1:
                valordoProduto = 5.00;                
                break;
            case 4:
                valordoProduto = 8.90;
                break;
            default:
                break;
        }
        valorAPagar = quantidadeDoProduto * valordoProduto;

        /** Saida ***************************************************/
        System.out.printf("Valor a pagar: %.2f", valorAPagar);
        input.close();
    }
    
}