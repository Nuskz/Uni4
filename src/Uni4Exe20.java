import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);
        // Prova1
        System.out.print("Informe a nota da primeira prova:");
        double prova1 = teclado.nextDouble();
        // Prova2
        System.out.print("Informe a nota da segunda prova:");
        double prova2 = teclado.nextDouble();
        prova2 = prova2 * 2;
        // Prova3
        System.out.print("Informe a nota da terceira prova:");
        double prova3 = teclado.nextDouble();
        prova3 = prova3 * 3;
        // Exercícios
        System.out.print("Informe a nota dos exercícios:");
        double exercicios = teclado.nextDouble();

        teclado.close();
        // Fim do Scanner

        double media = (prova1 + prova2 + prova3 + exercicios) / 7;
        String conceito = "0";
        DecimalFormat deci = new DecimalFormat("0.00");
        System.out.println("A média de aproveitamento é de: " + deci.format(media));

        if (media >= 9.0) {
            conceito = "A";
            System.out.println("Nota conceito: " + conceito);
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
            System.out.println("Nota conceito: " + conceito);
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
            System.out.println("Nota conceito: " + conceito);
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
            System.out.println("Nota conceito: " + conceito);
        } else if (media < 4.0) {
            conceito = "E";
            System.out.println("Nota conceito: " + conceito);
        }
        if (conceito == "A" || conceito == "B" || conceito == "C") {
            System.out.println("Aprovado");
        } else if (conceito == "D" || conceito == "E") {
            System.out.println("Reprovado");
        }
    }
}