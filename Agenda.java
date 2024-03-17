import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Evento {
    String titulo;
    String data;
    String horario;
    int duracao;

    public Evento(String titulo, String data, String horario, int duracao) {
        this.titulo = titulo;
        this.data = data;
        this.horario = horario;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Evento: " + titulo + ", Data: " + data + ", Horário: " + horario + ", Duração: " + duracao + " minutos\n";
    }
}

public class Agenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Qual o nome do evento:");
            String titulo = scanner.nextLine();

            System.out.println("Qual a data do evento (dd/MM/yyyy):");
            String data = scanner.nextLine();

            System.out.println("Qual o horário do evento (HH:mm):");
            String horario = scanner.nextLine();

            System.out.println("Qual a duração do evento (em minutos):");
            int duracao = scanner.nextInt();
            scanner.nextLine(); 

            Evento evento = new Evento(titulo, data, horario, duracao);
            salvarEvento(evento);

            System.out.println("Deseja inserir um novo evento? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        scanner.close();
    }

    private static void salvarEvento(Evento evento) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("eventos.txt", true))) {
            writer.write(evento.toString());
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar o evento.");
            e.printStackTrace();
        }
    }
}
