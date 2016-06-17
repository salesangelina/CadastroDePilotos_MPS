package pagamento;


import pagamento.PagamentoCommand;

/**
 *
 * @author Angelina Sales
 */
    
public class PagamentoCartaoDebito implements PagamentoCommand {

	@Override
	public void processarReserva(Reserva reserva) {
		System.out.println("Reserva feita com sucesso!\n" + reserva.getInfoNota());
	}

}
