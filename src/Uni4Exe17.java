import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a renda anual:\n R$ ");
        double rendaAnual = teclado.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        int dependentes = teclado.nextInt();

        teclado.close();
        // Fim do Scanner
        double rendaLiquida = rendaAnual * (1 - (dependentes * 2 / 100));
        double imposto = 0;
        if (rendaAnual < 2000) {
            System.out.println("Isento");
        } else if (rendaAnual <= 5000) {
            imposto = rendaLiquida * .05;
            System.out.println("Imposto de R$ " + imposto);
        } else if (rendaAnual <= 10000) {
            imposto = rendaLiquida * 0.1;
            System.out.println("Imposto de R$ " + imposto);
        } else if (rendaAnual > 10000) {
            imposto = rendaLiquida * 0.15;
            System.out.println("Imposto de R$ " + imposto);
        }

    }
}

