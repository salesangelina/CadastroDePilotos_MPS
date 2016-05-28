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

public class Titulacao {

    private int anoConclusao;
    private String nomeInstituicao;
    private String cidade;
    private String uF;
    private int qtde;

    public Titulacao(int anoConclusao, String nomeInstituicao, String cidade, String uF){
        this.anoConclusao = anoConclusao;
        this.nomeInstituicao = nomeInstituicao;
        this.cidade = cidade;
        this.uF = uF;
        qtde = 0;
    }

    public int getAnoConclusao(){
        return anoConclusao;
    }
    
    public int getQtde(){
        return qtde;
    }

    public String getNomeInstituicao(){
        return nomeInstituicao;
    }

    public String getCidade(){
        return cidade;
    }

    public String getuF(){
        return uF;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setuF(String uF) {
        this.uF = uF;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
    
}
