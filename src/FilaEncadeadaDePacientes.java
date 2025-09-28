public class FilaEncadeadaDePacientes {
    private NoPaciente primeiro;
    private NoPaciente ultimo;

    public FilaEncadeadaDePacientes() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void adicionarPaciente(Paciente paciente) {
        NoPaciente novoNo = new NoPaciente(paciente);

        if (estaVazia()) {
            primeiro = novoNo;
        } else {
            ultimo.proximo = novoNo;
        }

        ultimo = novoNo;
        System.out.println("Paciente " + paciente.getNome() + " adicionado à fila encadeada.");
    }

    public Paciente removerPaciente() {
        if (estaVazia()) {
            return null;
        }

        Paciente pacienteRemovido = primeiro.paciente;

        primeiro = primeiro.proximo;

        if (primeiro == null) {
            ultimo = null;
        }

        return pacienteRemovido;
    }

    public Paciente proximoPaciente() {
        if (estaVazia()) {
            return null;
        }
        return primeiro.paciente;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }
}