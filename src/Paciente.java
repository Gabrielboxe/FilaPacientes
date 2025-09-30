public class Paciente {
    private String nome;
    private int idade;
    private boolean foiAtendido;


    public Paciente (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.foiAtendido = false;
    }

    public String getNome () {
        return nome;
    }

    public int getIdade() {
        return idade;
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
                ", foiAtendido=" + foiAtendido +
                "]";
    }
}