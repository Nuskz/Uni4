import java.util.Scanner;

public class Uni4Exe04 {
     public static void main(String[] args) {
         // Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero = teclado.nextDouble();

        teclado.close();
        //Scanner

        if(numero % 1 ==0){
            System.out.println("Ele não tem casas decimais");
        } else {
            System.out.println("Ele tem casas decimais");
        }

        System.out.println("Fim");
     }
}
