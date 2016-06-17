package estado;


import estado.EstadoAeronave;
import estado.AeronaveLivre;

/**
 *
 * @author Angelina Sales
 */
public class ReservaAeronave {
	protected EstadoAeronave estado;
	
	public ReservaAeronave() {
		estado = (EstadoAeronave) new AeronaveLivre();
	}
        
	public void livre() {
		estado = estado.livre();
	}
        
        public void reservada() {
		estado = estado.reservada();
	}

	public void manutencao() {
		estado = estado.manutencao();
	}

	public void emViagem() {
		estado = estado.emViagem();
	}
}