import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);
        // Entrada
        System.out.println("Informe o ano do primeiro irmão:");
        int ano1 = teclado.nextInt();
        System.out.println("Informe o ano do segundo irmão:");
        int ano2 = teclado.nextInt();
        System.out.println("Informe o ano do terceiro irmão:");
        int ano3 = teclado.nextInt();
        // teclado fechar
        teclado.close();

        // Saída
        if (ano1 != ano2 && ano1 != ano3 && ano2 != ano3) {
            System.out.println("Apenas irmãos");
        } else if (ano1 == ano2 && ano1 == ano3) {
            System.out.println("Trigêmeos");
        } else {
            System.out.println("Gêmeos");
        }
    }
}
