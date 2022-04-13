import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println(
                "Escolha uma opção:\n Calcular a área de um:\n (T)riângulo \n (Q)uadrado\n (R)etângulo\n (C)irculo");
        char opcao = teclado.next().toUpperCase().charAt(0);

        switch (opcao) {
            // Triângulo
            case 'T':
                System.out.println("Digite a base e a altura do triângulo: ");
                double base = teclado.nextDouble();
                double altura = teclado.nextDouble();

                System.out.println("Área do triângulo = " + (base * altura) / 2);
                break;
            // Quadrado
            case 'Q':
                System.out.println("Digite o lado:");
                double lado = teclado.nextDouble();

                System.out.println("Área do quadrado = " + lado * lado);
                break;
            // Retângulo
            case 'R':
                System.out.println("Digite a base e a altura do retângulo: ");
                double b = teclado.nextDouble();
                double h = teclado.nextDouble();

                System.out.println("Área do retângulo = " + b * h);
                break;
            // Cirulo
            case 'C':
                System.out.println("Digite o raio:");
                double raio = teclado.nextDouble();

                System.out.println("Área do circulo = " + Math.PI * Math.pow(raio, 2));
                break;
            
                default:
                System.out.println("Escolha apenas uma das opções acima.");
        }
        // fechar Scanner
        teclado.close();
    }
}
