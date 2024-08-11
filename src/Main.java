public class Main {
    public static void main(String[] args) {
        // Criando instância do hotel
        Hotel hotel = new Hotel("Hotel Central", "Avenida Principal, 123");

        // Criando instâncias de quartos
        Quarto quarto1 = new Quarto(101, 150.00);
        Quarto quarto2 = new Quarto(102, 200.00);

        // Adicionando quartos ao hotel
        hotel.adicionarQuarto(quarto1);
        hotel.adicionarQuarto(quarto2);

        // Listando quartos disponíveis
        System.out.println("Quartos disponíveis:");
        for (Quarto q : hotel.listarQuartos()) {
            System.out.println("Quarto " + q.getNumero() + " - Valor da diária: R$ " + q.getPrecoDiaria());
        }

        // Buscando um quarto específico
        Quarto quartoEncontrado = hotel.buscarQuarto(101);
        if (quartoEncontrado != null) {
            System.out.println("Quarto encontrado: " + quartoEncontrado.getNumero());
        } else {
            System.out.println("Quarto não encontrado.");
        }

        // Criando uma reserva
        Reserva reserva1 = new Reserva(quarto1, "João Silva", 10);

        // Confirmando a reserva
        reserva1.confirmarReserva();
        System.out.println("Reserva confirmada por R$: " + reserva1.calcularValor());

        // Tentando reservar novamente o mesmo quarto
        reserva1.confirmarReserva(); // Isso deve mostrar que o quarto já está reservado

        // Liberando o quarto e reservando novamente
        quarto1.liberar();
        reserva1.confirmarReserva();

        // Verificando a lista de quartos novamente
        System.out.println("Quartos disponíveis após a reserva:");
        for (Quarto q : hotel.listarQuartos()) {
            System.out.println("Quarto " + q.getNumero() + " - R$ " + q.getPrecoDiaria());
        }
    }
}
