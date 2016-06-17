package pagamento;

/**
 *
 * @author Angelina Sales
 */
public class ReservaAviaoPequenoPorte extends ReservaDecorator{

	public ReservaAviaoPequenoPorte(Reserva umaReserva) {
            super(umaReserva);
            String nome = "AviaoPequenoPorte";
            int preco = 1500;
	}

} 
