import java.util.LinkedList;
import java.util.Queue;

public class FilaDeEspera {
    private Queue<Paciente> fila = new LinkedList<>();

    public void adicionarPaciente (Paciente paciente) {
        fila.add(paciente);
        System.out.println("Paciente " + paciente.getNome() + " adicionado à fila.");
    }

    public Paciente removerPaciente() {
        return fila.poll();
    }

    public Paciente proximoPaciente() {
        return fila.peek();
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }
}