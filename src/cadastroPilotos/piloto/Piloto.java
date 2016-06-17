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
package piloto;

import java.util.LinkedList;

public class Piloto {

    private String nome;
    private String endereco;
    private String fone;
    private String mail;
    public String breve;
    private String registroP;
    private LinkedList<CHT> titulacoes;
    private LinkedList<ExpProfissional> expProfissional;
    private LinkedList<TipoAeronave> tipoAeronave;
    private int qtde_titulacoes, qtde_exp, qtde_tip;
    public boolean cma;

    public Piloto(String nome, String endereco, String fone, String mail, String breve, String registroP) {
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.mail = mail;
        this.breve = breve;
        this.registroP = registroP;
        titulacoes = new LinkedList<>();
        qtde_titulacoes = 0;
        expProfissional = new LinkedList<>();
        qtde_exp = 0;
        tipoAeronave = new LinkedList<>();
        qtde_tip = 0;
    }

    public Piloto(String nome, String endereco, String fone, String mail, String breve,
            String registroP, LinkedList<CHT> tit, int qtde1, LinkedList<ExpProfissional> exp,
            int qtde2, LinkedList<TipoAeronave> tip, int qtde3) {
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.mail = mail;
        this.breve = breve;
        this.registroP = registroP;
        titulacoes = tit;
        qtde_titulacoes = qtde1;
        expProfissional = exp;
        qtde_exp = qtde2;
        tipoAeronave = tip;
        qtde_tip = qtde3;

    }

    public void addTitulacao(CHT titulacao) {
        titulacoes.add(titulacao);
        qtde_titulacoes++;
    }

    public void addExpProfissional(ExpProfissional exp) {
        expProfissional.add(exp);
        qtde_exp++;
    }

    public void addTipoAeronave(TipoAeronave tipo) {
        tipoAeronave.add(tipo);
        qtde_tip++;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getFone() {
        return fone;
    }

    public String getMail() {
        return mail;
    }

    public String getBreve() {
        return breve;
    }

    public String getRegistroP() {
        return registroP;
    }
    
    public LinkedList<CHT> getTitulacao() {
        return titulacoes;
    }

    public LinkedList<ExpProfissional> getExpProfissional() {
        return expProfissional;
    }

    public LinkedList<TipoAeronave> getTipoAeronave() {
        return tipoAeronave;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setBreve(String breve) {
        this.breve = breve;
    }

    public void setRegistroP(String registroP) {
        this.registroP = registroP;
    }
}
