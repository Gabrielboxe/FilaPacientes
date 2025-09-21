public class Paciente {
    private String nome;
    private boolean foiAtendido;

    public Paciente(String nome) {
        this.nome = nome;
        this.foiAtendido = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isFoiAtendido() {
        return foiAtendido;
    }

    public void setAtendido(boolean foiAtendido) {
        this.foiAtendido = foiAtendido;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", foiAtendido=" + foiAtendido +
                '}';
    }
}