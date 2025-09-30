public class Paciente implements Comparable<Paciente> {
    private String nome;
    private int idade;
    private boolean foiAtendido;
    private boolean urgente;

    public Paciente (String nome, int idade, boolean urgente) {
        this.nome = nome;
        this.idade = idade;
        this.foiAtendido = false;
        this.urgente = urgente;
    }

    public Paciente (String nome, int idade) {
        this(nome, idade, false);
    }

    public String getNome () {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public boolean isFoiAtendido () {
        return foiAtendido;
    }

    public void setAtendido (boolean foiAtendido) {
        this.foiAtendido = foiAtendido;
    }

    @Override
    public String toString() {
        return "Paciente [" +
                "nome=" + nome +
                ", idade=" + idade +
                ", urgente=" + urgente +
                ", foiAtendido=" + foiAtendido +
                "]";
    }

    @Override
    public int compareTo(Paciente outroPaciente) {
        if (this.isUrgente() && !outroPaciente.isUrgente()) {
            return -1;
        }
        if (!this.isUrgente() && outroPaciente.isUrgente()) {
            return 1;
        }

        boolean thisEIdoso = this.getIdade() >= 60;
        boolean outroEIdoso = outroPaciente.getIdade() >= 60;

        if (thisEIdoso && !outroEIdoso) {
            return -1;
        }
        if (!thisEIdoso && outroEIdoso) {
            return 1;
        }
        return Integer.compare(outroPaciente.getIdade(), this.getIdade());
    }
}