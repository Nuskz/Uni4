import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);
        // Pagamento
        System.out.print("Informe o valor do produto: R$ ");
        double valorPagamento = teclado.nextDouble();
        // Dia do Pagamento
        System.out.print("Informe o dia do pagamento dia: ");
        int diaPagamento = teclado.nextInt();
        // Dia do Vencimento
        System.out.print("Informe o dia do vencimento: ");
        int vencimento = teclado.nextInt();

        teclado.close();
        // Fim do Scanner
        double pagamento = 0;
        // Até o dia 10 (vencimento)
        if (diaPagamento <= vencimento) {
            double desconto = valorPagamento * 0.1;
            pagamento = (valorPagamento - desconto);
            System.out.println("O valor total a ser pago será de: R$ " + pagamento);
            System.out.println("O desconto foi de: R$ " + desconto);
        } else if (diaPagamento <= (vencimento + 5)) {
            System.out.println("O valor total a ser pago será de: R$ " + valorPagamento);
        } else if (diaPagamento > (vencimento + 5)) {
            double diaAtraso = (diaPagamento - vencimento);
            double multa = diaAtraso * (0.02 * valorPagamento);
            pagamento = valorPagamento + multa;
            System.out.println("O valor total a ser pago será de: R$ " + pagamento);
            System.out.println("O valor da multa é de: R$ " + multa);
        }

    }
}
