import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);
        // Opções
        System.out.println(
                "Qual desses cursos é o seu?\n 1-Ciência da Computação\n 2-Licenciatura da Computação\n 3-Sistemas de Informação");
        int opcao = teclado.nextInt();

        teclado.close();
        // Fim do Scanner
        switch (opcao) {
            // Ciencia da computacao
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;

            // Licenciatura da computacao
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            // Sistemas de Informação    
            case 3:
                System.out.println("Bacharel em Sistemas da Informação");
                break;
            default:
                System.out.println("Essa opção não existe");
        }

    }

}
