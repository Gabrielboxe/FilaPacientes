public class Main {
    public static void main(String[] args) {
        FilaDeEspera filaDeEspera = new FilaDeEspera();
        ListaDeAtendidos listaDeAtendidos = new ListaDeAtendidos();

        filaDeEspera.adicionarPaciente (new Paciente ("João"));
        filaDeEspera.adicionarPaciente (new Paciente ("Maria"));
        filaDeEspera.adicionarPaciente (new Paciente ("Pedro"));
        filaDeEspera.adicionarPaciente (new Paciente ("Ana"));
        filaDeEspera.adicionarPaciente (new Paciente ("Carlos"));

        for (int i=0; i<3; i++) {
            if (!filaDeEspera.estaVazia()) {
                pacienteAtendido.setAtendido (true);
                listaDeAtendidos.adicionarPacienteAtendido (pacienteAtendido);
            }
        }

        Paciente proximo = filaDeEspera.proximoPaciente();
        if (proximo != null) {
        } else {
            System.out.println("A fila de espera está vazia.");
        }

        listaDeAtendidos.exibirTodos();

        System.out.println("\n--- Pesquisa ---");
        String nomePesquisa = "Maria";
        if (listaDeAtendidos.pacienteFoiAtendido (nomePesquisa)) {
            System.out.println("O paciente " + nomePesquisa + " já foi atendido.");
        } else {
            System.out.println("O paciente "+ nomePesquisa + " ainda não foi atendido.");
        }
    }
}