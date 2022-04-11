import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        
        // Scanner 
        Scanner teclado = new Scanner(System.in);
        // Homem
        System.out.println("Digite a idade do primeiro homem:");
        int idadeHPrimeiro = teclado.nextInt();

        System.out.println("Digite a idade do segundo homem");
        int idadeHSegundo = teclado.nextInt();
        // Mulher
        System.out.println("Digite a idade da primeira mulher:");
        int idadeMPrimera = teclado.nextInt();
        
        System.out.println("Digite a idade da segunda mulher:");
        int idadeMSegunda = teclado.nextInt();

        int homemNovo, homemVelho, mulherNova, mulherVelha = 0;
        teclado.close();
        // Fim do Scanner
        if (idadeHPrimeiro < idadeHSegundo) {
            homemNovo = idadeHPrimeiro;
            homemVelho = idadeHSegundo;
        } else {
            homemNovo = idadeHSegundo;
            homemVelho = idadeHPrimeiro;
        }
        if (idadeMPrimera < idadeMSegunda) {
            mulherNova = idadeMPrimera;
            mulherVelha = idadeMSegunda;
        } else {
            mulherNova = idadeMSegunda;
            mulherVelha = idadeMPrimera;
        }
        System.out.println("Essa é a soma das idades do homem mais velho com a mulher mais nova: " + (homemVelho + mulherNova));
        System.out.println("E esse é o produto das idades do homem mais novo com a mulher mais velha: " + (homemNovo * mulherVelha));

    
    }
}
