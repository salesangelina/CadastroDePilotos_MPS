/* Projeto MPS - Cadastro de pilotos de aeronave
 * 
 * Professora: Raoni Kulesza
 * 
 * Grupo: Angelina Sales
          Jorismar Barbosa
          Nycholas de Sousa
 * 
 * Descrição da Classe:
 */

package cadastroPilotos.piloto;

import cadastroPilotos.Cadastro;

public class TipoAeronave{
    private String modelo;
    private int capacidadePassageiros;
    private int horasDeVoo;
    private int qtde;

    public TipoAeronave(String modelo, int capacidadePassageiros, int horasDeVoo){
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.horasDeVoo = horasDeVoo;
    }

    public String getModelo(){
        return modelo;
    }

    public int getCapacidadePassageiros(){
        return capacidadePassageiros;
    }

    public int getHorasDeVoo(){
        return horasDeVoo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }
    
}
