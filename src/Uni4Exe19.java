import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("x = ");
        double x = teclado.nextDouble();

        System.out.println("y = ");
        double y = teclado.nextDouble();

        teclado.close();
        // fechar Scanner

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 4");
        }
    }
}
