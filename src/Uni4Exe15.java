import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de meses da admissão:");
        int meses = teclado.nextInt();

        System.out.print("Digite o salário para o reajuste:\nR$ ");
        double salario = teclado.nextDouble();

        teclado.close();
        // Fim do Scanner

        int porcentagem = 0;

        if (meses < 12) {
            porcentagem = 5;
        } else if (meses <= 48) {
            porcentagem = 7;
        }
        salario += salario * porcentagem / 100;
        DecimalFormat deci = new DecimalFormat("0.00");
         System.out.println("O novo salário é de: R$ " + deci.format(salario));
    }
}
