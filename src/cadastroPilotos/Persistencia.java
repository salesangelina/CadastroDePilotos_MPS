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
package cadastroPilotos;

import cadastroPilotos.piloto.*;
import java.io.*;
import java.util.LinkedList;

/**
 *
 * @author Nycholas
 */
public class Persistencia {

    private static LinkedList<Piloto> cadPiloto = new LinkedList<Piloto>();
    private static DataOutputStream outputPiloto, outputTitulacao, outputExperiencia, outputTipo;
    private static DataInputStream inputPiloto, inputTitulacao, inputExperiencia, inputTipo;
    private static boolean moreRecords = true;
    private static int qtde_piloto;
    
    public static LinkedList getCadPiloto(){
        return cadPiloto;
    }

    //Método que adiciona um piloto
    public static void addPiloto(Piloto piloto) {
        cadPiloto.add(piloto);
    }

    //Método que atualiza um piloto em certo indice
    public static void attPiloto(Piloto piloto, int indice) {
        cadPiloto.set(indice, piloto);
    }

    //Método que retorna todos os pilotos já cadastrados
    public static LinkedList<Piloto> getListaPiloto() {
        return cadPiloto;
    }

    //Método que retorna um piloto em determinada posição "indice"
    public static Piloto getPiloto(int indice) {
        return cadPiloto.get(indice);
    }

    //Método que checa se os arquivos existem, caso não existam, novos arquivos são criados
    public static void checkFiles() {
        boolean Piloto = (new File("Piloto.dat")).exists();
        boolean Titulacao = (new File("Titulacao.dat")).exists();
        boolean ExpProfissional = (new File("ExpProfissional.dat")).exists();
        boolean TipoAeronave = (new File("TipoAeronave.dat")).exists();
        try {
            if (!Piloto || !Titulacao || !ExpProfissional || !TipoAeronave) {
                outputPiloto = new DataOutputStream(new FileOutputStream("Piloto.dat", false));
                outputTitulacao = new DataOutputStream(new FileOutputStream("Titulacao.dat", false));
                outputExperiencia = new DataOutputStream(new FileOutputStream("ExpProfissional.dat", false));
                outputTipo = new DataOutputStream(new FileOutputStream("TipoAeronave.dat", false));
            }

        } catch (IOException e) {
            System.out.println("[checkFiles] - Erro na Verificação dos Arquivos.");
            System.exit(1);
        }
    }

    //Método que abre os arquivos existentes para realizar a Leitura deles
    public static void setupLer() {
        try {
            inputPiloto = new DataInputStream(new FileInputStream("Piloto.dat"));
            inputTitulacao = new DataInputStream(new FileInputStream("Titulacao.dat"));
            inputExperiencia = new DataInputStream(new FileInputStream("ExpProfissional.dat"));
            inputTipo = new DataInputStream(new FileInputStream("TipoAeronave.dat"));
        } catch (IOException e) {
            System.err.println("[SetupLer] - Falha na Abertura do Arquivo para Leitura\n" + e.toString());
            System.exit(1);
        }
    }
    
    public static boolean checkCad(String breve, String registro){
        for(Piloto p : cadPiloto){
            if(breve.equals(p.getBreve()) || registro.equals(p.getRegistroP())){
                return true;
            }
        }
        return false;
    }

    //Método que apaga os arquivos
//    public static void removeFiles() {
//        try {
//            outputPiloto = new DataOutputStream(new FileOutputStream("Piloto.dat", false));
//            outputTitulacao = new DataOutputStream(new FileOutputStream("Titulacao.dat", false));
//            outputExperiencia = new DataOutputStream(new FileOutputStream("ExpProfissional.dat", false));
//            outputTipo = new DataOutputStream(new FileOutputStream("TipoAeronave.dat", false));
//        } catch (IOException e) {
//            System.out.println("[setupGravar] - Erro na Abertura do Arquivo.");
//            System.exit(1);
//        }
//    }

    //Método que abre o arquivo para realizar gravação deles
    public static void setupGravar() {
        try {
            outputPiloto = new DataOutputStream(new FileOutputStream("Piloto.dat", false));
            outputTitulacao = new DataOutputStream(new FileOutputStream("Titulacao.dat", false));
            outputExperiencia = new DataOutputStream(new FileOutputStream("ExpProfissional.dat", false));
            outputTipo = new DataOutputStream(new FileOutputStream("TipoAeronave.dat", false));
        } catch (IOException e) {
            System.out.println("[setupGravar] - Erro na Abertura do Arquivo.");
            System.exit(1);
        }
    }

    //Método responsável em fechar o arquivo após os dados terem sido descarregados na coleção
    public static void cleanupGravar() {
        try {
            outputPiloto.close();
            outputTitulacao.close();
            outputExperiencia.close();
            outputTipo.close();
        } catch (IOException e) {
            System.err.println("[cleanupGravar] - Falha no Fechamento do Arquivo durante Leitura\n" + e.toString());
            System.exit(1);
        }
    }

    //Método responsável em fechar os arquivos após toda a leitura deles ter sido feita
    public static void cleanupLer() {
        try {
            inputPiloto.close();
            inputTitulacao.close();
            inputExperiencia.close();
            inputTipo.close();
        } catch (IOException e) {
            System.err.println("[cleanupLer] - Falha no Fechamento do Arquivo durante Leitura\n" + e.toString());
            System.exit(1);
        }
    }

    //Método responsável por descarregar toda a coleção nos arquivos
    public static void addRecords() {

        try {
            outputPiloto.writeInt(cadPiloto.size());
            for (Piloto p : cadPiloto) {
                outputPiloto.writeUTF(p.getNome());
                outputPiloto.writeUTF(p.getEndereco());
                outputPiloto.writeUTF(p.getFone());
                outputPiloto.writeUTF(p.getMail());
                outputPiloto.writeUTF(p.getBreve());
                outputPiloto.writeUTF(p.getRegistroP());
                LinkedList<Titulacao> cadTitulacao = p.getTitulacao();
                outputTitulacao.writeInt(cadTitulacao.size());
                for (Titulacao tit : cadTitulacao) {
                    outputTitulacao.writeInt(tit.getAnoConclusao());
                    outputTitulacao.writeUTF(tit.getNomeInstituicao());
                    outputTitulacao.writeUTF(tit.getCidade());
                    outputTitulacao.writeUTF(tit.getuF());
                }
                LinkedList<ExpProfissional> cadExpProfissional = p.getExpProfissional();
                outputExperiencia.writeInt(cadExpProfissional.size());
                for (ExpProfissional exp : cadExpProfissional) {
                    outputExperiencia.writeUTF(exp.getDataI());
                    outputExperiencia.writeUTF(exp.getDataT());
                    outputExperiencia.writeUTF(exp.getDescricaoA());
                    outputExperiencia.writeUTF(exp.getEmpresa());
                    outputExperiencia.writeUTF(exp.getNCidade());
                    outputExperiencia.writeUTF(exp.getEstado());
                }
                LinkedList<TipoAeronave> cadTipoAeronave = p.getTipoAeronave();
                outputTipo.writeInt(cadTipoAeronave.size());
                for (TipoAeronave tip : cadTipoAeronave) {
                    outputTipo.writeUTF(tip.getModelo());
                    outputTipo.writeInt(tip.getCapacidadePassageiros());
                    outputTipo.writeInt(tip.getHorasDeVoo());
                }

            }
        } catch (IOException e) {
            System.err.println("[addRecords] - Erro durante gravação no arquivo\n" + e.toString());
            System.exit(1);
        }
    }

    //Método responsável por ler os arquivos e jogar na coleção
    public static void readRecords() {
        String nome, endereco, fone, mail, breve, registroP;
        LinkedList<Titulacao> titulacoes;
        LinkedList<ExpProfissional> expProf;
        LinkedList<TipoAeronave> tipAero;
        int i, anoConc;
        String nomeInst, cidade, uF;

        String dataI;
        String dataT;
        String descricaoA;
        String empresa;
        String nCidade;
        String estado;

        String modelo;
        int capacidadePassageiros;
        int horasDeVoo;
        int qtde_tit, qtde_exp, qtde_tip;
        int num_pilotos;

        try {
            num_pilotos = inputPiloto.readInt();
            while (moreRecords){
                nome = inputPiloto.readUTF();
                endereco = inputPiloto.readUTF();
                fone = inputPiloto.readUTF();
                mail = inputPiloto.readUTF();
                breve = inputPiloto.readUTF();
                registroP = inputPiloto.readUTF();

                titulacoes = new LinkedList<Titulacao>();
                qtde_tit = inputTitulacao.readInt();
                for (i = 0; i < qtde_tit; i++) {
                    anoConc = inputTitulacao.readInt();
                    nomeInst = inputTitulacao.readUTF();
                    cidade = inputTitulacao.readUTF();
                    uF = inputTitulacao.readUTF();
                    titulacoes.add(new Titulacao(anoConc, nomeInst, cidade, uF));
                }
                expProf = new LinkedList<ExpProfissional>();
                qtde_exp = inputExperiencia.readInt();
                for (i = 0; i < qtde_exp; i++) {
                    dataI = inputExperiencia.readUTF();
                    dataT = inputExperiencia.readUTF();
                    descricaoA = inputExperiencia.readUTF();
                    empresa = inputExperiencia.readUTF();
                    nCidade = inputExperiencia.readUTF();
                    estado = inputExperiencia.readUTF();
                    expProf.add(new ExpProfissional(dataI, dataT, descricaoA, empresa, nCidade, estado));
                }
                tipAero = new LinkedList<TipoAeronave>();
                qtde_tip = inputTipo.readInt();
                for (i = 0; i < qtde_tip; i++) {
                    modelo = inputTipo.readUTF();
                    capacidadePassageiros = inputTipo.readInt();
                    horasDeVoo = inputTipo.readInt();
                    tipAero.add(new TipoAeronave(modelo, capacidadePassageiros, horasDeVoo));
                }
                cadPiloto.add(new Piloto(nome, endereco, fone, mail, breve, registroP, titulacoes,
                        qtde_tit, expProf, qtde_exp, tipAero, qtde_tip));

            }
        } catch (EOFException eof) {
            moreRecords = false;
            //System.out.println("[readRecords] - Erro no laço de repetição");
        } catch (IOException e) {
            System.err.println("[readRecords] - Erro durante leitura do arquivo\n" + e.toString());
            System.exit(1);
        }
    }

    //Método para salvar todos os arquivos
    public static void saveFile(){
        setupGravar(); //Abre os arquivos para gravar
        addRecords(); //Adiciona a coleção nos arquivos
        cleanupGravar(); // Fecha os arquivos após a gravação
    }
    
    //Método que verifica data da titulação
    public static boolean checkDataTit(String data){
        for(Piloto p : cadPiloto){
            if(Integer.parseInt(data.toString()) > 2013 || Integer.parseInt(data.toString()) < 1843){
                return true;
            }
        }
        return false;
    }
}
