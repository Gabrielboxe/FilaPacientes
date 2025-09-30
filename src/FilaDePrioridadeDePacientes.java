import java.util.PriorityQueue;
import java.util.Queue;

public class FilaDePrioridadeDePacientes {
    private Queue<Paciente> fila = new PriorityQueue<>();

    public void adicionarPaciente (Paciente paciente) {
        fila.add(paciente);
        System.out.println("Paciente " + paciente.getNome() + " (Idade: " + paciente.getIdade() + ", Urgente: " + paciente.isUrgente() + ") adicionado à fila de prioridade.");
    }

    public Paciente atenderProximoPaciente() {
        Paciente proximo = fila.poll();
        if (proximo != null) {
            System.out.println("\nATENDIMENTO: " + proximo.getNome() + " (Prioridade: " + getPrioridadeStatus(proximo) + ")");
        } else {
            System.out.println("\nA fila de prioridade está vazia.");
        }
        return proximo;
    }

    public Paciente proximoPaciente() {
        return fila.peek();
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    private String getPrioridadeStatus(Paciente p) {
        if (p.isUrgente()) return "URGENTE";
        if (p.getIdade() >= 60) return "IDOSO";
        return "NORMAL";
    }

    public void exibirFila() {
        System.out.println("\n--- ESTADO ATUAL DA FILA DE PRIORIDADE (Ordem de Atendimento) ---");
        Paciente[] arrayFila = fila.toArray(new Paciente[0]);
        java.util.Arrays.sort(arrayFila);

        if (arrayFila.length == 0) {
            System.out.println("A fila está vazia.");
        } else {
            for (Paciente p : arrayFila) {
                System.out.println("- " + p.getNome() + " (Idade: " + p.getIdade() + ", Urgente: " + p.isUrgente() + ")");
            }
        }
    }
}