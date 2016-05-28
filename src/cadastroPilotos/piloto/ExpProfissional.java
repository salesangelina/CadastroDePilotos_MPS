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

public class ExpProfissional{

    private String dataI;  
    private String dataT;
    private String descricaoA;
    private String empresa;
    private String nCidade;
    private String estado;
    private int qtde;

    public ExpProfissional(String dataI, String dataT, String descricaoA, String empresa, String nCidade, String estado){
        this.dataI = dataI;
        this.dataT = dataT;
        this.descricaoA = descricaoA;
        this.empresa = empresa;
        this.nCidade = nCidade;
        this.estado = estado;
    }

    public String getDataI() {
        return dataI;
    }

    public String getDataT() {
        return dataT;
    }

    public String getDescricaoA() {
        return descricaoA;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getNCidade() {
        return nCidade;
    }
    
    public int getQtde() {
        return qtde;
    }
    
    public String getEstado(){
        return estado;
    }

    public void setDataI(String dataI) {
        this.dataI = dataI;
    }

    public void setDataT(String dataT) {
        this.dataT = dataT;
    }

    public void setDescricaoA(String descricaoA) {
        this.descricaoA = descricaoA;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setnCidade(String nCidade) {
        this.nCidade = nCidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
