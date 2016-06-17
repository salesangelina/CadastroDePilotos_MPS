package estado;

/**
 *
 * @author Angelina Sales
 */
public class AeronaveIndisponivel implements EstadoAeronave {
    
    	@Override
	public EstadoAeronave reservada () {
		return this;
	}

    /**
     *
     * @return
     */
    @Override
        public EstadoAeronave manutencao () {
		return this;
	}

    /**
     *
     * @return
     */
    @Override
        public EstadoAeronave emViagem () {
		return this;
	}

    @Override
    public EstadoAeronave livre() {
        throw new UnsupportedOperationException("Não suportado ainda.");
    }
}
