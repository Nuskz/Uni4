import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println(
                "Escolha uma opção:\n Calcular a área de um:\n (1)Triângulo \n (2)Quadrado\n (3)Retângulo\n (4)Circulo");
        int opcao = teclado.nextInt();

        switch (opcao) {
            // Triângulo
            case 1:
                System.out.println("Digite a base e a altura do triângulo: ");
                double base = teclado.nextDouble();
                double altura = teclado.nextDouble();

                System.out.println("Área do triângulo = " + (base * altura) / 2);
                break;
            // Quadrado
            case 2:
                System.out.println("Digite o lado:");
                double lado = teclado.nextDouble();

                System.out.println("Área do quadrado = " + lado * lado);
                break;
            // Retângulo
            case 3:
                System.out.println("Digite a base e a altura do retângulo: ");
                double b = teclado.nextDouble();
                double h = teclado.nextDouble();

                System.out.println("Área do retângulo = " + b * h);
                break;
            // Cirulo
            case 4:
                System.out.println("Digite o raio:");
                double raio = teclado.nextDouble();

                System.out.println("Área do circulo = " + Math.PI * Math.pow(raio, 2));
                break;

        }
        //fechar Scanner
        teclado.close();
    }
}
