import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o seu genêro:\n (M)asculino\n (F)eminino\n Não (I)nformar");
        String genero = teclado.nextLine();
        teclado.close();
        // Scanner fechado

        genero = genero.trim().toUpperCase();

        if (genero.equals("M")) {
            System.out.println("Masculino");
        } else if (genero.equals("F")) {
            System.out.println("Feminino");
        } else if (genero.equals("I")) {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada Incorreta");
        }

    }
}
