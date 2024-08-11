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
        return quarto.getPrecoDiaria() * dias;
    }

    public void confirmarReserva() {
        quarto.reservar();
    }
}