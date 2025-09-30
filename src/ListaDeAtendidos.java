import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListaDeAtendidos {
    private List<Paciente> lista = new ArrayList<>();

    public void adicionarPacienteAtendido (Paciente paciente) {
        lista.add(paciente);
    }

    public void exibirTodos () {
        if (lista.isEmpty()) {
            System.out.println("Nenhum paciente foi atendido ainda.");
        } else {
            System.out.println("\n--- Pacientes Atendidos ---");
            lista.forEach (System.out::println);
        }
    }

    public boolean pacienteFoiAtendido (String nome) {
        return lista.stream()
                .anyMatch (p->p.getNome().equalsIgnoreCase(nome));
    }

    public long contarAtendidos() {
        return lista.stream().count();
    }

    public double calcularMediaIdade() {
        if (lista.isEmpty()) {
            return 0.0;
        }
        return lista.stream()
                .mapToInt(Paciente::getIdade)
                .average()
                .orElse(0.0);
    }

    public Optional<Paciente> encontrarPacienteMaisIdoso() {
        return lista.stream()
                .max((p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));
    }

    public void exibirRelatorioDiario() {
        long totalAtendidos = contarAtendidos();
        double mediaIdade = calcularMediaIdade();
        Optional<Paciente> maisIdoso = encontrarPacienteMaisIdoso();

        String nomeMaisIdoso = maisIdoso.map(p -> p.getNome() + " (" + p.getIdade() + " anos)").orElse("N/A");

        System.out.println("\n==========================================");
        System.out.println("====== RELATÓRIO DIÁRIO DE ATENDIMENTO =====");
        System.out.println("==========================================");
        System.out.println("Total de pacientes atendidos: " + totalAtendidos);
        System.out.printf("Média de idade: %.2f\n", mediaIdade);
        System.out.println("Paciente mais idoso: " + nomeMaisIdoso);
        System.out.println("==========================================");
    }
}