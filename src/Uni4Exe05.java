import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("A cor é azul? ");
        boolean cor = teclado.nextBoolean();
        teclado.close();
        if (cor) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

    }
}
