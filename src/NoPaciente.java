class NoPaciente {
    Paciente paciente;
    NoPaciente proximo;

    public NoPaciente(Paciente paciente) {
        this.paciente = paciente;
        this.proximo = null;
    }
}