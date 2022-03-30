import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);
        // Escrever 1
        System.out.println("Entre com um valor inteiro maior do que 0: ");
        double valor = teclado.nextDouble();
        // fechar scanner
        teclado.close();
        // Se o resto de valor dividido por 2 for igual 0
        if (valor % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é impar");
        }

    }
}
