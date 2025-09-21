import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListaDeAtendidos {
    private List<Paciente> lista = new ArrayList<>();

    public void adicionarPacienteAtendido(Paciente paciente) {
        lista.add(paciente);
    }

    public void exibirTodos() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum paciente foi atendido ainda.");
        } else {
            System.out.println("\n--- Pacientes Atendidos ---");
            lista.forEach(System.out::println);
        }
    }

    public boolean pacienteFoiAtendido(String nome) {
        return lista.stream()
                .anyMatch(p -> p.getNome().equalsIgnoreCase(nome));
    }
}