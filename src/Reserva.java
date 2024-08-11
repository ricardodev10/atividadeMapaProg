public class Reserva {
    // Atributos
    private Quarto quarto;
    private String nomeCliente;
    private int dias;

    // Construtor
    public Reserva(Quarto quarto, String nomeCliente, int dias) {
        this.quarto = quarto;
        this.nomeCliente = nomeCliente;
        this.dias = dias;
    }

    // Métodos
    public double calcularValor() {
        double valor = quarto.getPrecoDiaria() * dias;
        if (dias >= 10) {
            valor *= 0.9; // Aplica desconto de 10%
        }
        return valor;
    }

    public void confirmarReserva() {
        if (quarto != null && quarto.isDisponivel()) { // Usando o método isDisponivel()
            quarto.reservar();
        } else {
            System.out.println("O quarto já está reservado.");
        }
    }
}
