import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println(
                "Escolha uma das opções:\n 1 - Soma de dois números\n 2 - Diferença entre dois números\n 3 - Produto entre dois números \n 4 - Divisão entre dois números (o denominador não pode ser zero");
        int opcao = teclado.nextInt();

        if (opcao < 1 || opcao > 4) {
            teclado.close();
            throw new Error("Algo de errado não está certo");
        }

        System.out.println("Agora informe o primeiro número: ");
        double numeroUm = teclado.nextDouble();

        System.out.println("Agora informe o segundo número: ");
        double numeroDois = teclado.nextDouble();

        teclado.close();
        // Fim do Scanner
        switch (opcao) {
            // Soma
            case 1:
                double soma = numeroUm + numeroDois;
                System.out.println("Esse é o resultado: " + soma);
                break;
            // Diferença
            case 2:
                double Diferenca = numeroUm - numeroDois;
                System.out.println("Esse é o resultado: " + Diferenca);
                break;
            // Multiplicação
            case 3:
                double produto = numeroUm * numeroDois;
                System.out.println("Esse é o resultado: " + produto);
                break;
            // Divisão
            case 4:
                double divisao = numeroUm / numeroDois;
                System.out.println("Esse é o resultado: " + divisao);
                break;
        }
    }
}
