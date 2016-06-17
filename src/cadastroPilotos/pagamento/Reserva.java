package pagamento;

/**
 *
 * @author Angelina Sales
 */
public class Reserva {
	static int CONTADOR_ID;
	protected int idNotaFiscal;
	protected String nomeDoAeroclube;
	protected double valorTotal;

	public Reserva(String nomeDoAeroclube) {
		this.nomeDoAeroclube = nomeDoAeroclube;
		idNotaFiscal = ++CONTADOR_ID;
	}

	public void setValor(double valor) {
		this.valorTotal = valor;
	}

	public String getInfoNota() {
		return new String("Nota fiscal nº: " + idNotaFiscal + "\nLoja: "
				+ nomeDoAeroclube + "\nValor: " + valorTotal);
	}

    String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double getPreco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
