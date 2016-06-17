/* Projeto MPS - Cadastro de pilotos de aeronave
 * 
 * Professora: Raoni Kulesza
 * 
 * Grupo: Angelina Sales
          Jorismar Barbosa
          Nycholas de Sousa
 * 
 * Descrição da Classe: Classe responsável pelo cadastro das informações do piloto
 */
package cadastroPilotos;

import piloto.TipoAeronave;
import piloto.ExpProfissional;
import piloto.CHT;
import piloto.Piloto;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro
     */
    private Piloto piloto;
    private ExpProfissional expProfissional;
    private TipoAeronave tipoAeronave;
    private CHT titulacao;
    String nomePiloto;
    String enderecoPiloto;
    String fonePiloto;
    String emailPiloto;
    String breve;
    String registro;
    String ano;
    String nomeInstituicao;
    String cidadePiloto;
    String ufPiloto;
    String data, dataT;
    String descricaoAtividade;
    String empresaExperiencia;
    String cidadeExperiencia;
    String estadoExperiencia;
    String modeloAeronave;
    String passageiros;
    String horasVoo;

    public Cadastro() {
        protected String cadastro;
        initComponents(); //Default NetBeans
        setSize(1024, 904); //Tamanho da tela
        jPanel1.setVisible(false); //Deixa o jPanel invisível
        jPanel2.setVisible(false); //Deixa o jPanel invisível
        jPanel3.setVisible(false); //Deixa o jPanel invisível
        gravar.setEnabled(false); //Desabilita o botão
        
        pButton.setToolTipText("Próxima etapa do cadastro."); //Mostra informações sobre o botão para o usuário
        sButton.setToolTipText("Próxima etapa do cadastro."); //Mostra informações sobre o botão para o usuário
        tButton.setToolTipText("Próxima etapa do cadastro."); //Mostra informações sobre o botão para o usuário
        qButton.setToolTipText("Próxima etapa do cadastro."); //Mostra informações sobre o botão para o usuário
        gravar.setToolTipText("Concluir cadastro."); //Mostra informações sobre o botão para o usuário
        
        public void desfazerCadastro() {
		cadastro = caretaker.getUltimoEstadoSalvo().getCadastroSalvo();
	}
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        Nome = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        Fone = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Breve = new javax.swing.JLabel();
        Registro = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        nBreve = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        registroProf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fone = new javax.swing.JFormattedTextField();
        pButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Breve1 = new javax.swing.JLabel();
        Breve2 = new javax.swing.JLabel();
        Breve3 = new javax.swing.JLabel();
        Breve4 = new javax.swing.JLabel();
        sButton = new javax.swing.JButton();
        anoConc = new javax.swing.JFormattedTextField();
        cidade = new javax.swing.JTextField();
        nomeInt = new javax.swing.JTextField();
        uf = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dInicio = new javax.swing.JFormattedTextField();
        dTermino = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        empresa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nCidade = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        tButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        qButton = new javax.swing.JButton();
        gravar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Dados");
        setAutoscrolls(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastroPilotos/imagens/aviao.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(897, 265));
        setPreferredSize(new java.awt.Dimension(897, 265));
        setVisible(true);

        Nome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Nome.setText("Nome: ");

        Endereco.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Endereco.setText("Endereço:");

        Fone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Fone.setText("Registro Profissional:");

        Email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Email.setText("E-mail:");

        Breve.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Breve.setText("Número do Brevê:");

        Registro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Registro.setText("Fone:");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        nBreve.setName(""); // NOI18N
        nBreve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nBreveActionPerformed(evt);
            }
        });

        try {
            fone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        pButton.setText("Próximo");
        pButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Dados Pessoais:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Titulação:");

        Breve1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Breve1.setText("Ano de Conclusão:");

        Breve2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Breve2.setText("Nome da Instituição:");

        Breve3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Breve3.setText("Cidade:");

        Breve4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Breve4.setText("UF:");

        sButton.setText("Próximo");
        sButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonActionPerformed(evt);
            }
        });

        try {
            anoConc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            uf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Breve1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(anoConc))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Breve2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeInt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Breve3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Breve4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(sButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Breve1)
                    .addComponent(Breve3)
                    .addComponent(anoConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Breve2)
                    .addComponent(Breve4)
                    .addComponent(nomeInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(sButton)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Experiência Profissional:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Data de Início:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Data de Término:");

        try {
            dInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dInicioActionPerformed(evt);
            }
        });

        try {
            dTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Empresa:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Cidade:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Estado:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Descrição da Atividade:");

        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane1.setViewportView(descricao);

        tButton.setText("Próximo");
        tButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dInicio))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estado)
                                    .addComponent(nCidade)
                                    .addComponent(empresa))))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(dTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Tipo de Aeronave:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Modelo:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Capacidade de Passageiros:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Horas de Vôo:");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        qButton.setText("Próximo");
        qButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qButtonActionPerformed(evt);
            }
        });

        gravar.setText("Gravar");
        gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(modelo))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSpinner2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(qButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(778, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qButton)
                    .addComponent(gravar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1146, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(Breve)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nBreve, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Fone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(registroProf))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Endereco)
                                        .addComponent(Nome))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nome)
                                        .addComponent(endereco)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(Email)
                                    .addGap(32, 32, 32)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fone)
                                        .addComponent(email))))
                            .addGap(221, 221, 221))
                        .addComponent(jSeparator3)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(Registro)
                                .addComponent(jLabel4)
                                .addComponent(pButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4)
                    .addGap(4, 4, 4)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nome))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Endereco))
                    .addGap(5, 5, 5)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Registro)
                        .addComponent(fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Email))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Fone)
                        .addComponent(nBreve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Breve)
                        .addComponent(registroProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(pButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addContainerGap()))
        );

        jScrollPane2.setViewportView(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pButtonActionPerformed
        // TODO add your handling code here:

        nomePiloto = nome.getText();
        enderecoPiloto = endereco.getText();
        fonePiloto = fone.getText();
        emailPiloto = email.getText();
        breve = nBreve.getText();
        registro = registroProf.getText();
   
        if (Persistencia.checkCad(breve, registro)) {
            JOptionPane.showMessageDialog(null, "Este Breve/Registro Já consta no Sistema", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (((nomePiloto.equals(""))) || ((enderecoPiloto.equals(""))) || ((fonePiloto.equals("(  )    -    ")))
                    || ((emailPiloto.equals(""))) || ((breve.equals(""))) || ((registro.equals("")))) {
                //Verifica se existem campos vazios. Se existirem mostra a mensagem abaixo ao usuário.
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos para continuar o cadastro", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {

                piloto = new Piloto(nomePiloto, enderecoPiloto, fonePiloto, emailPiloto, breve, registro);
                Persistencia.addPiloto(piloto);

                nome.setEditable(false); //Retira a função de edição do campo de texto
                endereco.setEditable(false); //Retira a função de edição do campo de texto
                fone.setEditable(false); //Retira a função de edição do campo de texto
                nBreve.setEditable(false); //Retira a função de edição do campo de texto
                email.setEditable(false); //Retira a função de edição do campo de texto
                registroProf.setEditable(false); //Retira a função de edição do campo de texto
                pButton.setEnabled(false); //Desabilita o botão
                jPanel1.setVisible(true); //Deixa o jPanel visível
            }
        }

    }//GEN-LAST:event_pButtonActionPerformed

    private void sButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonActionPerformed

        ano = anoConc.getText();
        nomeInstituicao = nomeInt.getText();
        cidadePiloto = cidade.getText();
        ufPiloto = uf.getText();


        if (Persistencia.checkDataTit(ano)) {
            JOptionPane.showMessageDialog(null, "O ano usado não é possível", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (((anoConc.getText().equals(""))) || ((nomeInt.getText().equals("")))
                    || ((cidade.getText().equals(""))) || ((uf.getText().equals("")))) { //Verifica se existem campos vazios. Se existirem mostra a mensagem abaixo ao usuário.
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos para continuar o cadastro", "Erro", JOptionPane.ERROR_MESSAGE);
            } else { //Se os campos estiverem preenchidos realiza o código abaixo

                titulacao = new CHT(Integer.parseInt(ano), nomeInstituicao, cidadePiloto, ufPiloto); //tratar excecao
                piloto.addTitulacao(titulacao);
                //titulacao = null;

                String[] opcoes = {"Sim", "Não"}; //Array utilizado no JOptionPane
                resposta = JOptionPane.showOptionDialog(
                        null // Centraliza tela
                        , "Deseja cadastrar mais titulações?" // Mensagem
                        , "Cadastro"// Titulo
                        , JOptionPane.YES_NO_OPTION // Tipo de opção
                        , JOptionPane.INFORMATION_MESSAGE // Tipo de mensagem
                        , null // Icone
                        , opcoes // Texto dos botões(opcoes)
                        , "botoes" // Label default dos botões
                        );
                if (resposta == 0) { //Usuário deseja realizar um novo cadastro em titulação

                    anoConc.setText(""); //Limpa o campo
                    nomeInt.setText(""); //Limpa o campo
                    cidade.setText(""); //Limpa o campo
                    uf.setText(""); //Limpa o campo
                } else { //usuário não deseja realizar mais cadastros

                    anoConc.setEditable(false); //Retira a função de edição do campo de texto
                    nomeInt.setEditable(false); //Retira a função de edição do campo de texto
                    cidade.setEditable(false); //Retira a função de edição do campo de texto
                    uf.setEditable(false); //Retira a função de edição do campo de texto
                    sButton.setEnabled(false); //Retira a função de edição do campo de texto
                    jPanel2.setVisible(true); //Deixa o jPanel visível
                }
            }
        }

    }//GEN-LAST:event_sButtonActionPerformed

    private void tButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tButtonActionPerformed

        data = dInicio.getText();
        dataT = dTermino.getText();
        descricaoAtividade = descricao.getText();
        empresaExperiencia = empresa.getText();
        cidadeExperiencia = nCidade.getText();
        estadoExperiencia = estado.getText();

        //falta data termino
        if (((dInicio.getText().equals("  /  /    ")))
                || ((descricao.getText().equals(""))) || ((empresa.getText().equals("")))
                || ((nCidade.getText().equals(""))) || ((estado.getText().equals("")))) { //Verifica se existem campos vazios. Se existirem mostra a mensagem abaixo ao usuário.
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos para continuar o cadastro", "Erro", JOptionPane.ERROR_MESSAGE);
        } else { //Se os campos estiverem preenchidos realiza o código abaixo
            if(dTermino.getText().equals("  /  /    ")){
                dTermino.setValue("00/00/0000");
                dataT = dTermino.getText();
            }
            expProfissional = new ExpProfissional(data, dataT, descricaoAtividade, empresaExperiencia,
                    cidadeExperiencia, estadoExperiencia);
            piloto.addExpProfissional(expProfissional);
            //expProfissional = null;

            String[] opcoes = {"Sim", "Não"}; //Array utilizado no JOptionPane
            resposta = JOptionPane.showOptionDialog(
                    null // Centraliza tela
                    , "Deseja continuar cadastrando?" // Mensagem
                    , "Cadastro"// Titulo
                    , JOptionPane.YES_NO_OPTION // Tipo de opção
                    , JOptionPane.INFORMATION_MESSAGE // Tipo de mensagem
                    , null // Icone
                    , opcoes // Texto dos botões(opcoes)
                    , "botoes" // Label default dos botões
                    );

            if (resposta == 0) {  //Usuário deseja realizar um novo cadastro em experiência profissional

                dInicio.setText(""); //Limpa o campo
                dTermino.setText(""); //Limpa o campo
                descricao.setText(""); //Limpa o campo
                empresa.setText(""); //Limpa o campo
                nCidade.setText(""); //Limpa o campo
                estado.setText(""); //Limpa o campo
            } else { //usuário não deseja realizar mais cadastros

                dInicio.setEditable(false); //Retira a função de edição do campo de texto
                dTermino.setEditable(false); //Retira a função de edição do campo de texto
                descricao.setEditable(false); //Retira a função de edição do campo de texto
                empresa.setEditable(false); //Retira a função de edição do campo de texto
                nCidade.setEditable(false); //Retira a função de edição do campo de texto
                estado.setEditable(false); //Retira a função de edição do campo de texto
                tButton.setEnabled(false); //Retira a função de edição do campo de texto
                jPanel3.setVisible(true); //Deixa o jPanel visível
            }
        }
    }//GEN-LAST:event_tButtonActionPerformed

    private void nBreveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nBreveActionPerformed
        // Adicionado por engano
    }//GEN-LAST:event_nBreveActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // Adicionado por engano
    }//GEN-LAST:event_nomeActionPerformed

    private void qButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qButtonActionPerformed
        // TODO add your handling code here:

        modeloAeronave = modelo.getText();
        passageiros = jSpinner1.getValue().toString();
        horasVoo = jSpinner2.getValue().toString();

        if (((modelo.getText().equals(""))) || ((jSpinner1.getValue().equals("0")))
                || ((jSpinner2.getValue().equals("0")))) { //Verifica se existem campos vazios. Se existirem mostra a mensagem abaixo ao usuário.
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos para continuar o cadastro", "Erro", JOptionPane.ERROR_MESSAGE);
        } else { //Se os campos estiverem preenchidos realiza o código abaixo

            tipoAeronave = new TipoAeronave(modeloAeronave, Integer.parseInt(passageiros),
                    Integer.parseInt(horasVoo));
            piloto.addTipoAeronave(tipoAeronave);
            //tipoAeronave = null;

            String[] opcoes = {"Sim", "Não"}; //Array utilizado no JOptionPane
            resposta = JOptionPane.showOptionDialog(
                    null // Centraliza tela
                    , "Deseja continuar cadastrando?" // Mensagem
                    , "Cadastro"// Titulo
                    , JOptionPane.YES_NO_OPTION // Tipo de opção
                    , JOptionPane.INFORMATION_MESSAGE // Tipo de mensagem
                    , null // Icone
                    , opcoes // Texto dos botões(opcoes)
                    , "botoes" // Label default dos botões
                    );
            if (resposta == 0) { //Usuário deseja realizar um novo cadastro em tipo de aeronave

                modelo.setText(""); //Limpa o campo
                jSpinner1.setValue(0); //Limpa o campo
                jSpinner2.setValue(1); //Limpa o campo
            } else { //usuário não deseja realizar mais cadastros

                qButton.setEnabled(false);
                gravar.setEnabled(true); //Habilita o botão
            }
        }
    }//GEN-LAST:event_qButtonActionPerformed

    private void gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarActionPerformed
         gravar.setEnabled(false); //Desabilita o botão
    }//GEN-LAST:event_gravarActionPerformed

    private void dInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dInicioActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Breve;
    private javax.swing.JLabel Breve1;
    private javax.swing.JLabel Breve2;
    private javax.swing.JLabel Breve3;
    private javax.swing.JLabel Breve4;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Fone;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Registro;
    private javax.swing.JFormattedTextField anoConc;
    private javax.swing.JTextField cidade;
    private javax.swing.JFormattedTextField dInicio;
    private javax.swing.JFormattedTextField dTermino;
    private javax.swing.JTextArea descricao;
    private javax.swing.JTextField email;
    private javax.swing.JTextField empresa;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField estado;
    private javax.swing.JFormattedTextField fone;
    private javax.swing.JButton gravar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nBreve;
    private javax.swing.JTextField nCidade;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nomeInt;
    private javax.swing.JButton pButton;
    private javax.swing.JButton qButton;
    private javax.swing.JTextField registroProf;
    private javax.swing.JButton sButton;
    private javax.swing.JButton tButton;
    private javax.swing.JFormattedTextField uf;
    // End of variables declaration//GEN-END:variables
    private int resposta; // Continuação do cadastro
}
