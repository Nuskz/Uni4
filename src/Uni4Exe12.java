import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {

        // Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o comprimento do lado1: ");
        double lado1 = teclado.nextDouble();
        System.out.println("Entre com o comprimento do lado2: ");
        double lado2 = teclado.nextDouble();
        System.out.println("Entre com o comprimento do lado3: ");
        double lado3 = teclado.nextDouble();
        // fechar teclado
        teclado.close();

        // Entrada
        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("é equilatero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("é isósceles");
            } else {
                System.out.println("é escaleno");
            }
        } else {
            System.out.println("não formam um triângulo");
        }

    }

}
