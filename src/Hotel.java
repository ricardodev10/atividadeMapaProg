import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private String endereco;
    private List<Quarto> quartos;

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }

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
        for (int i = 1; i < this.quartos.size(); i++) {
            if (this.quartos.get(i).getNumero() == numero) {
                return this.quartos.get(numero);
            }
        }
        return null;
    }
}