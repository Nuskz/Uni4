import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);
        // Chegada
        System.out.println("Informe o horário de sua chegada: ");
        System.out.print("Horas: ");
        int horaEntrada = teclado.nextInt();

        System.out.print("Minutos: ");
        int minutosEntrada = teclado.nextInt();

        // Saída
        System.out.println("Informe o horário de sua saída: ");
        System.out.print("Horas: ");
        int horaSaida = teclado.nextInt();
        System.out.print("Minutos: ");
        int minutosSaida = teclado.nextInt();

        teclado.close();
        // Fim do Scanner

        // Error Horas
        if (horaEntrada > 24 || horaEntrada < 0 || horaSaida > 24 || horaSaida < 0) {
            throw new Error("Horas inválidas!");
        }
        // Erro Minutos
        if (minutosEntrada > 60 || minutosEntrada < 0 || minutosSaida > 60 || minutosSaida < 0) {
            throw new Error("Minutos inválidos!");
        }
        // Arredondar
        if (minutosSaida - minutosEntrada > 29) {
            horaSaida += 1;
        }
        int horaEstacionamento = 0;
        if (horaSaida > horaEntrada) {
            horaEstacionamento = horaSaida - horaEntrada;
        } else {
            horaEstacionamento = horaEntrada - horaSaida;
        }
        if (horaEstacionamento < 1) {
            horaEstacionamento = 1;
        }
        if (horaEstacionamento <= 2) {
            System.out.println("Valor do estacionamento: R$ " + (5 * horaEstacionamento));
        }
        if (horaEstacionamento <= 4) {
            System.out.println("Valor do estacionamento: R$ " + (7.5 * horaEstacionamento));
        }
        if (horaEstacionamento >= 5) {
            System.out.println("Valor do estacionamento: R$ " + (10 * horaEstacionamento));
        }
    }
}
