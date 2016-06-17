package pagamento;

/**
 *
 * @author Angelina Sales
 */
public abstract class ReservaDecorator extends Reserva {
    
	Reserva reserva;
    private final Reserva umaReserva;

    /**
     *
     * @param <error>
     * @param <error>
     * @param umaReserva
     */
    public ReservaDecorator(Reserva umaReserva) {
        this.umaReserva = umaReserva;
        idNotaFiscal = ++CONTADOR_ID;
	}

	public String getNome(String nome) {
		return reserva.getNome() + " + " + nome;
	}

	public double getPreco(double preco) {
		return reserva.getPreco() + preco;
	}

    private static class umaReserva {

        public umaReserva() {
        }
    }
}