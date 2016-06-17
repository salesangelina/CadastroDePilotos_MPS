package estado;

/**
 *
 * @author Angelina Sales
 */
public interface EstadoAeronave {
        
        EstadoAeronave livre();
        
	EstadoAeronave reservada();

	EstadoAeronave manutencao();

	EstadoAeronave emViagem();

}
