package estado;

/**
 *
 * @author Angelina Sales
 */
public class AeronaveLivre implements EstadoAeronave {
	@Override
	public EstadoAeronave livre() {
		return this;
	}

    @Override
    public EstadoAeronave reservada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoAeronave manutencao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoAeronave emViagem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
