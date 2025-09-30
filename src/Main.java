public class Main {
    public static void main(String[] args) {

        FilaDeEspera filaDeEspera = new FilaDeEspera();
        ListaDeAtendidos listaDeAtendidos = new ListaDeAtendidos();

        System.out.println("--- Chegada de Pacientes ---");
        filaDeEspera.adicionarPaciente (new Paciente ("João", 45));
        filaDeEspera.adicionarPaciente (new Paciente ("Maria", 22));
        filaDeEspera.adicionarPaciente (new Paciente ("Pedro", 78));
        filaDeEspera.adicionarPaciente (new Paciente ("Ana", 30));
        filaDeEspera.adicionarPaciente (new Paciente ("Carlos", 60));

        System.out.println("\n--- Atendimento de Pacientes ---");
        for (int i=0; i<3; i++) {
            if (!filaDeEspera.estaVazia()) {
                Paciente pacienteAtendido =
                        filaDeEspera.removerPaciente();
                pacienteAtendido.setAtendido (true);
                listaDeAtendidos.adicionarPacienteAtendido (pacienteAtendido);
                System.out.println("Paciente " +
                        pacienteAtendido.getNome () + " atendido e movido para a lista.");
            }
        }

        System.out.println("\n--- Próximo Paciente na Fila ---");
        Paciente proximo = filaDeEspera.proximoPaciente();
        if (proximo != null) {
            System.out.println("Próximo paciente a ser atendido: " + proximo.getNome());
        } else {
            System.out.println("A fila de espera está vazia.");
        }

        System.out.println("\n--- Pesquisa ---");
        String nomePesquisa = "Maria";
        if (listaDeAtendidos.pacienteFoiAtendido (nomePesquisa)) {
            System.out.println("O paciente " + nomePesquisa + " já foi atendido.");
        } else {
            System.out.println("O paciente "+ nomePesquisa + " ainda não foi atendido.");
        }
        listaDeAtendidos.exibirRelatorioDiario();
    }
}