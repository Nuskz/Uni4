import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        // SCanner
        Scanner teclado = new Scanner(System.in);
        // Primeiro numero
        System.out.println("Informe o primeiro número:");
        double numP = teclado.nextDouble();
        // Segundo numero
        System.out.println("Informe o segundo número:");
        double numS = teclado.nextDouble();
        // Terceiro numero
        System.out.println("Informe o terceiro número:");
        double numT = teclado.nextDouble();
        // Opções
        System.out
                .println("Escolha uma das opções:\n 1-Ordem crescente\n 2-Ordem decrescente\n 3-O maior valor no meio");
        int opcao = teclado.nextInt();

        teclado.close();
        // Fim Scanner
        double numeroMaior = numP;
        double numeroMedio = numP;
        double numeroMenor = numP;
        // Maior
        if (numS > numeroMaior) {
            numeroMaior = numS;
        }
        if (numT > numeroMaior) {
            numeroMaior = numT;
        }
        // Menor
        if (numS < numeroMenor) {
            numeroMenor = numS;
        }
        if (numT < numeroMenor) {
            numeroMenor = numT;
        }
        // Médio
        if (numS < numeroMaior && numS > numeroMenor) {
            numeroMedio = numS;
        }
        if (numT < numeroMaior && numT > numeroMenor) {
            numeroMedio = numT;
        }
        switch (opcao) {
            // Crescente
            case 1:
                System.out.println("Essa é a ordem: " + numeroMenor + " " + numeroMedio + " " + numeroMaior);
                break;
            // Decrescente
            case 2:
                System.out.println("Essa é a ordem: " + numeroMaior + " " + numeroMedio + " " + numeroMenor);
                break;
            // Numero maior no meio
            case 3:
                System.out.println("Essa é a ordem: " + numeroMedio + " " + numeroMaior + " " + numeroMenor);
                break;
        }

    }
}
