/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroPilotos;

import java.util.ArrayList;
import piloto.Piloto;

/**
 *
 * @author Angelina Sales
 */
public abstract class OrdenadorTemplate {
	public abstract boolean isPrimeiro(Piloto piloto);

	protected ArrayList<Piloto> ordenarPiloto(ArrayList<Piloto> lista) {
		ArrayList<Piloto> novaLista = new ArrayList<>();
		for (Piloto piloto : lista) {
			novaLista.add(piloto);
		}

		for (int i = 0; i < novaLista.size(); i++) {
			for (int j = i; j < novaLista.size(); j++) {
				if (!isPrimeiro(novaLista.get(i), novaLista.get(j))) {
					Piloto temp = novaLista.get(j);
					novaLista.set(j, novaLista.get(i));
					novaLista.set(i, temp);
				}
			}
		}

		return novaLista;
	}

    private boolean isPrimeiro(Piloto get, Piloto get0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public class OrdenadorPorCTH extends OrdenadorTemplate {

            /**
             *
             * @param piloto
             * @return
             */
            @Override
	public boolean isPrimeiro(Piloto piloto) {
		if (piloto.breve) <= 0) {
                    return true;
		}
		return false;
	}

    }
   
   public class OrdenadorPorCMA extends OrdenadorTemplate {

	@Override
	public boolean isPrimeiro(Piloto piloto) {
		if (piloto.cma) <= 0) {
			return true;
		}
		return false;
	}

    }
}
