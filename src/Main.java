public class Main {
    public static void main(String[] args) {

        FilaDePrioridadeDePacientes filaDePrioridade = new FilaDePrioridadeDePacientes();
        ListaDeAtendidos listaDeAtendidos = new ListaDeAtendidos();

        System.out.println("==============================================");
        System.out.println("--- SIMULAÇÃO: FILA DE PRIORIDADE (10 Pacientes) ---");
        System.out.println("==============================================");

        System.out.println("\n--- Chegada de Pacientes na Fila de Prioridade ---");
        filaDePrioridade.adicionarPaciente(new Paciente("P1 - Maria", 75, false)); // Idosa
        filaDePrioridade.adicionarPaciente(new Paciente("P2 - João", 30, false)); // Normal
        filaDePrioridade.adicionarPaciente(new Paciente("P3 - Ana", 40, true)); // URGENTE (Prioridade Máxima)
        filaDePrioridade.adicionarPaciente(new Paciente("P4 - Carlos", 62, false)); // Idoso
        filaDePrioridade.adicionarPaciente(new Paciente("P5 - Beatriz", 25, false)); // Normal
        filaDePrioridade.adicionarPaciente(new Paciente("P6 - Pedro", 15, true)); // URGENTE
        filaDePrioridade.adicionarPaciente(new Paciente("P7 - Sofia", 50, false)); // Normal
        filaDePrioridade.adicionarPaciente(new Paciente("P8 - Eva", 80, false)); // Idosa (Mais Idosa)
        filaDePrioridade.adicionarPaciente(new Paciente("P9 - Leo", 55, true)); // URGENTE
        filaDePrioridade.adicionarPaciente(new Paciente("P10 - Rui", 40, false)); // Normal

        filaDePrioridade.exibirFila();

        System.out.println("\n==============================================");
        System.out.println("--- INÍCIO DO ATENDIMENTO (Prioridade) ---");
        System.out.println("==============================================");

        for (int i = 0; i < 5; i++) {
            Paciente pacienteAtendido = filaDePrioridade.atenderProximoPaciente();
            if (pacienteAtendido != null) {
                pacienteAtendido.setAtendido(true);
                listaDeAtendidos.adicionarPacienteAtendido(pacienteAtendido);
            }
        }

        filaDePrioridade.exibirFila();
        listaDeAtendidos.exibirRelatorioDiario();
        System.out.println("\n==============================================");
        System.out.println("--- REFLEXÃO: COMPLEXIDADE ALGORÍTMICA (Fila de Prioridade) ---");
        System.out.println("==============================================");
        System.out.println("Em uma Fila de Prioridade (implementada com Heap Binária, como o Java PriorityQueue):");
        System.out.println("- Inserção (adicionarPaciente): Complexidade O(log n).");
        System.out.println("- Remoção do Máximo/Prioritário (atenderProximoPaciente): Complexidade O(log n).");
        System.out.println("Essa complexidade é mais lenta que O(1) da Fila normal (LinkedList), mas garante que o paciente com maior prioridade esteja sempre no topo.");
    }
}