import java.util.Scanner;

public class Uni4Exe09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // valor1
        System.out.println("Informe um valor inteiro:");
        int valor1 = teclado.nextInt();

        // valor2
        System.out.println("Informe mais um valor inteiro:");
        int valor2 = teclado.nextInt();
        // fechar teclado
        teclado.close();

        // Saída
        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Eles não são múltiplos");
        }
    }
}