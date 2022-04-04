import java.util.Scanner;

public class Uni4Exe03 {

    public static void main(String[] args) {
        // scanner
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escreva um número inteiro:");
        int numero1 = teclado.nextInt();
        
        System.out.println("Escreva mais um número inteiro:");
        int numero2 = teclado.nextInt();

        teclado.close();
        // scanner fechado
        //if
        if(numero1 > numero2){
            System.out.println("Esse é maior número: " + numero1);
        } else { System.out.println("Esse é o maior número: " + numero2);
            }
            System.out.println("Fim");
    
    
    
    }
}
