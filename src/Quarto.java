public class Quarto {
    // Atributos
    private int numero;
    private double precoDiaria;
    private boolean disponivel;

    // Construtor
    public Quarto(int numero, double precoDiaria) {
        this.numero = numero;
        this.precoDiaria = precoDiaria;
        this.disponivel = true;
    }

    // Métodos
    public int getNumero() {
        return this.numero;
    }

    public double getPrecoDiaria() {
        return this.precoDiaria;
    }

    public void reservar() {
        disponivel = false;
    }

    public void liberar() {
        if (!disponivel) {
            disponivel = true;
        } else {
            System.out.println("Quarto já está disponível.");
        }
    }

    // Adicionado para verificar se existe quarto disponível
    public boolean isDisponivel() {
        return disponivel;
    }
}