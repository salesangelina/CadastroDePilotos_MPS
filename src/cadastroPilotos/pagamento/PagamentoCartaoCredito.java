package pagamento;

/**
 *
 * @author Angelina Sales
 */
public class PagamentoCartaoCredito implements PagamentoCommand {

	@Override
	public void processarReserva(Reserva reserva) {
		System.out.println("Reserva feita com sucesso!\n" + reserva.getInfoNota());
	}

}