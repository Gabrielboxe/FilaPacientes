public class Main {
    public static void main(String[] args) {

        FilaDeEspera filaDeEspera = new FilaDeEspera();
        ListaDeAtendidos listaDeAtendidos = new ListaDeAtendidos();

        FilaCircularDePacientes filaCircular = new FilaCircularDePacientes(3);
        FilaEncadeadaDePacientes filaEncadeada = new FilaEncadeadaDePacientes();

        System.out.println("=========================================");
        System.out.println("--- TESTE DA FILA ORIGINAL (LinkedList) ---");
        System.out.println("=========================================");

        System.out.println("\n--- Chegada de Pacientes (Original) ---");
        filaDeEspera.adicionarPaciente (new Paciente ("João"));
        filaDeEspera.adicionarPaciente (new Paciente ("Maria"));
        filaDeEspera.adicionarPaciente (new Paciente ("Pedro"));
        filaDeEspera.adicionarPaciente (new Paciente ("Ana"));
        filaDeEspera.adicionarPaciente (new Paciente ("Carlos"));

        System.out.println("\n--- Atendimento de Pacientes (Original) ---");
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

        System.out.println("\n--- Próximo Paciente na Fila (Original) ---");
        Paciente proximo = filaDeEspera.proximoPaciente();
        if (proximo != null) {
            System.out.println("Próximo paciente a ser atendido: " +
                    proximo.getNome());
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

        System.out.println("\n========================================");
        System.out.println("--- TESTE DA FILA CIRCULAR (Array) ---");
        System.out.println("========================================");

        filaCircular.adicionarPaciente(new Paciente("Fábio"));
        filaCircular.adicionarPaciente(new Paciente("Gisele"));
        filaCircular.adicionarPaciente(new Paciente("Helena"));
        filaCircular.adicionarPaciente(new Paciente("Igor"));

        System.out.println("Próximo: " + filaCircular.proximoPaciente().getNome());

        System.out.println("Atendendo: " + filaCircular.removerPaciente().getNome());
        System.out.println("Próximo: " + filaCircular.proximoPaciente().getNome());

        System.out.println("\nAdicionando paciente que reutiliza o espaço:");
        filaCircular.adicionarPaciente(new Paciente("Julia"));
        System.out.println("Próximo: " + filaCircular.proximoPaciente().getNome());

        System.out.println("\n==========================================");
        System.out.println("--- TESTE DA FILA ENCADEADA (Nós) ---");
        System.out.println("==========================================");

        filaEncadeada.adicionarPaciente(new Paciente("Marcos"));
        filaEncadeada.adicionarPaciente(new Paciente("Paula"));

        System.out.println("Próximo: " + filaEncadeada.proximoPaciente().getNome());

        System.out.println("Atendendo: " + filaEncadeada.removerPaciente().getNome());
        System.out.println("Próximo: " + filaEncadeada.proximoPaciente().getNome());

        filaEncadeada.adicionarPaciente(new Paciente("Ricardo"));
    }
}