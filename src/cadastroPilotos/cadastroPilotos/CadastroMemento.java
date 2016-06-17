package cadastroPilotos;

import java.util.ArrayList;

/**
 *
 * @author Angelina Sales
 */
public class CadastroMemento {
	protected String estadoCadastro;

	public CadastroMemento(String texto) {
            String cadastro = null;
		estadoCadastro = cadastro;
	}

	public String getCadastroSalvo() {
		return estadoCadastro;
        }

    public class CadastroCareTaker {
            protected ArrayList<CadastroMemento> estados;

            public CadastroCareTaker() {
                    estados = new ArrayList<>();
            }

            public void adicionarMemento(CadastroMemento memento) {
                    estados.add(memento);
            }

            public CadastroMemento getUltimoEstadoSalvo() {
                    if (estados.size() <= 0) {
                            return new CadastroMemento("");
                    }
                    CadastroMemento estadoSalvo = estados.get(estados.size() - 1);
                    estados.remove(estados.size() - 1);
                    return estadoSalvo;
            }
    }
}