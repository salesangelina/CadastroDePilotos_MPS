package pagamento;

/**
 *
 * @author Angelina Sales
 */
public class ReservaAviaoExecutivo extends ReservaDecorator{
	public ReservaAviaoExecutivo(Reserva umaReserva) {
            
            super(umaReserva);
            String nome = "AviaoExecutivo";
	    int preco = 1000;
	} 
}
