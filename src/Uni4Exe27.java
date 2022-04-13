import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);
        // Chegada
        System.out.println("Informe a sua chegada: ");
        System.out.print("Hora: ");
        int horaEntrada = teclado.nextInt();
        
        System.out.print("Minutos: ");
        int minutosEntrada = teclado.nextInt();

        // Saída
        System.out.println("Informe a sua saída: ");
        System.out.print("Horas: ");
        int horaSaida = teclado.nextInt();
        System.out.println("Minutos: ");
    }
}
