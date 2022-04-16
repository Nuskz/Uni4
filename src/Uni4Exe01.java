import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        // horas trabalhadas no mês
        System.out.println("Entre com as horas trabalhadas no mês: ");
        double horasMes = teclado.nextDouble();
        // valor pago por hora
        System.out.println("Entre com o valor pago por hora: ");
        double horasValor = teclado.nextDouble();
        // calcular salário
        double salarioTotal = horasMes * horasValor;
        // fechar scanner
        teclado.close();
        // Se horasMes >160
        if (horasMes > 160) {
            double salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }
        System.out.println("O salário total é: " + salarioTotal);
    }

}
