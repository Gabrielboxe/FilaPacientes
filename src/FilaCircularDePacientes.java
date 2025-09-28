public class FilaCircularDePacientes {
    private Paciente[] array;
    private int tamanhoMaximo;
    private int inicio;
    private int fim;
    private int contagem;

    public FilaCircularDePacientes(int capacidade) {
        this.tamanhoMaximo = capacidade;
        this.array = new Paciente[tamanhoMaximo];
        this.inicio = 0;
        this.fim = -1;
        this.contagem = 0;
    }

    public void adicionarPaciente(Paciente paciente) {
        if (estaCheia()) {
            System.out.println("ERRO: A fila circular está cheia. Não é possível adicionar " + paciente.getNome());
            return;
        }

        fim = (fim + 1) % tamanhoMaximo;
        array[fim] = paciente;
        contagem++;
        System.out.println("Paciente " + paciente.getNome() + " adicionado à fila circular.");
    }

    public Paciente removerPaciente() {
        if (estaVazia()) {
            return null;
        }

        Paciente pacienteRemovido = array[inicio];
        array[inicio] = null;

        inicio = (inicio + 1) % tamanhoMaximo;
        contagem--;
        return pacienteRemovido;
    }

    public Paciente proximoPaciente() {
        if (estaVazia()) {
            return null;
        }
        return array[inicio];
    }

    public boolean estaVazia() {
        return contagem == 0;
    }

    public boolean estaCheia() {
        return contagem == tamanhoMaximo;
    }
}