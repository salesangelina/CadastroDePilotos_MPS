
package piloto;

/**
 *
 * @author Angelina Sales
 */
 public interface Aeronave extends TipoAeronave {
	AviaoExecutivo criarAviaoExecutivo();

    /**
     *
     * @return
     */
    AviaoPequenoPorte criarAviaoPequenoPorte();

    public class Helicoptero implements AviaoExecutivo {
    }

    public class AviaoJato implements AviaoPequenoPorte {
    }

    public class TurboHelice implements AviaoPequenoPorte {
    }
}