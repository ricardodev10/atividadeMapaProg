import java.util.ArrayList;
import java.util.List;

public class Hotel {
    // Atributos
    private String nome;
    private String endereco;
    private List<Quarto> quartos;

    // Construtor
    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }

    // Métodos
    public List<Quarto> listarQuartos() {
        return quartos;
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos = new ArrayList();
        quartos.add(quarto);
    }

    public void removerQuarto(Quarto quarto) {
        quartos.remove(quarto);
    }

    public Quarto buscarQuarto(int numero) {
        // Estrutura de repetição: passa por todos os quartos cadastrados
        for (int i = 1; i < this.quartos.size(); i++) {
            // Estrutura de seleção: verifica se o número de quartos é o mesmo
            if (this.quartos.get(i).getNumero() == numero) {
                return this.quartos.get(numero); // retorna o quarto encontrado
            }
        }
        return null;
    }
}