import java.util.Scanner;

public class Uni4Exe10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // Marquinhos
        System.out.println("Informe a idade de Marquinhos:");
        int idadem = teclado.nextInt();

        // Zezinho
        System.out.println("Informe a idade de Zezinho:");
        int idadez = teclado.nextInt();

        // Luluzinha
        System.out.println("Informe a idade da Luluzinha:");
        int idadel = teclado.nextInt();
        // fechar teclado
        teclado.close();

        // Saída
        if (idadem < idadez && idadem < idadel) {
            System.out.println("Marquinhos é o caçula");
        } else if (idadez < idadem && idadez < idadel) {
            System.out.println("Zezinho é o caçula");
        } else {
            System.out.println("Luluzinha é a caçula");
        }

    }
}
