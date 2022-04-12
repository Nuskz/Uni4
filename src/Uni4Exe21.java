import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);
        // Peso
        System.out.println("Informe o seu peso em kg: ");
        double massa = teclado.nextDouble();
        // Altura
        System.out.println("Informe a sua altura em metros: ");
        double altura = teclado.nextDouble();

        teclado.close();
        // Fim do Scanner
        altura = Math.pow(altura, 2);
        double imc = massa / altura;

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc < 25) {
            System.out.println("Saudável");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade Grau II (severa)");
        } else if (imc >= 40) {
            System.out.println("Obesidade Grau III (mórbida)");
        }

    }
}
