/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fmoli
 */
public class cad_clientes_frm extends javax.swing.JFrame {
 private final int NAVEGACAO_NAV = 1;
    private final int NAVEGACAO_NOVO = 2;
    private final int NAVEGACAO_EDITAR = 3;
    private final int NAVEGACAO_EXCLUIR = 4;
    private final int NAVEGACAO_SELECAO = 5;
    
    private int navegacaoDpto;
    private DAO dao;
    /**
     * Creates new form cad_clientes
     */
    public cad_clientes_frm() {
        initComponents();
        
        dao = new DAO();
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"id","Nome", "Bairro", "CEP", "CNPJ CPF", "Complemento", "Email", "Endereço", "Num", "Telefone"}, 0);
        tabCliente.setModel(modelo);
        tabCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabCliente.getColumnModel().getColumn(1).setPreferredWidth(200);        
        ArrayList<clientes> arrayDpto = dao.getDepartamento();
        for(int i = 0; i < arrayDpto.size(); i++){
            Object linha[] = new Object[] {
                arrayDpto.get(i).getIdCliente(),                
                arrayDpto.get(i).getNome(),
                arrayDpto.get(i).getBairro(),                
                arrayDpto.get(i).getCep(),                
                arrayDpto.get(i).getCnpjcpf(),                
                arrayDpto.get(i).getComplemento(),                
                arrayDpto.get(i).getEmail(),                
                arrayDpto.get(i).getEndereco(),             
                 arrayDpto.get(i).getNumero(),             
                  arrayDpto.get(i).getTelefone()
                                
            };
            modelo.addRow(linha);
        }
    }
    
      /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtCPFCNPJ = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIDUsuario = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabCliente = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtPesq = new javax.swing.JButton();
        txtCampoPesq = new javax.swing.JTextField();

        jScrollPane2.setViewportView(jTextPane1);

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("Cadastro");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jCheckBox6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jCheckBox6.setText("Inativo");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("CPF/CNPJ:");

        txtCPFCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFCNPJActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setText("Complemento:");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel12.setText("CEP:");

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel13.setText("Cidade:");

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel14.setText("Estado:");

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel15.setText("E-mail:");

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel16.setText("Telefone:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel20.setText("Status:");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setText("Endereço:");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setText("Nº");

        jButton2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton3.setText("Desistir");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel11.setText("Bairro:");

        jScrollPane1.setViewportView(txtIDUsuario);

        jLabel3.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jButton2)
                .addGap(67, 67, 67)
                .addComponent(jButton4)
                .addGap(65, 65, 65)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF CNPJ", "Endereço", "Número", "Complemento", "Bairro", "Cidade", "UF", "E-mail", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabCliente);

        jLabel5.setText("Pesquisar por ID:");

        txtPesq.setText("Pesquisar");
        txtPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCampoPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPesq)
                            .addComponent(txtCampoPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFCNPJActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int  numero =0;
            String  bairro= txtBairro.getText();
            String  cep= txtCEP.getText();
            String  cpfcpnj= txtCPFCNPJ.getText();
            String  cidade= txtCidade.getText();
            String  complemento= txtComplemento.getText();
            String  email= txtEmail.getText();
            String  endereco= txtEndereco.getText();
            String  nome= txtNome.getText();
            if ("".equals(txtNumero.getText())) {
                    
             }else{
              numero = Integer.parseInt(txtNumero.getText());
            }
             
            String telefone = txtTelefone.getText();
            String uf = txtUF.getText();
            
            
            
             if (txtBairro.getText() == "" || txtCEP.getText() == "" || txtCPFCNPJ.getText() == "" || txtCidade.getText() == ""
                || txtCidade.getText() == "" || txtComplemento.getText() == "" || txtEmail.getText() == "" || txtEndereco.getText() == ""
                    || txtNome.getText() == "" || numero == 0 || txtTelefone.getText() == "" || txtUF.getText() == ""){
                 
                JOptionPane.showMessageDialog(rootPane, "ERRO: Todos os Campos nao inserido.");
                
             }else{
                 
            
            boolean inserir = dao.inserirCliente(bairro,cep,cpfcpnj,cidade,complemento,email,endereco,nome,numero,telefone,uf );
            if(inserir == true){
//                DefaultTableModel modelo = (DefaultTableModel) tabCliente.getModel();
//                Object linha[] = new Object[] {bairro,cep,cpfcpnj,cidade,complemento,email,endereco,nome,numero,telefone,uf};
//                modelo.addRow(linha);
                JOptionPane.showMessageDialog(rootPane, "efetuada.");
                 DefaultTableModel modelo = new DefaultTableModel(new Object[]{"id","Nome", "Bairro", "CEP", "CNPJ CPF", "Complemento", "Email", "Endereço", "Num", "Telefone"}, 0);
                tabCliente.setModel(modelo);
                tabCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
                tabCliente.getColumnModel().getColumn(1).setPreferredWidth(200);        
                ArrayList<clientes> arrayDpto = dao.getDepartamento();
                for(int i = 0; i < arrayDpto.size(); i++){
                    Object linha[] = new Object[] {
                        arrayDpto.get(i).getIdCliente(),                
                        arrayDpto.get(i).getNome(),
                        arrayDpto.get(i).getBairro(),                
                        arrayDpto.get(i).getCep(),                
                        arrayDpto.get(i).getCnpjcpf(),                
                        arrayDpto.get(i).getComplemento(),                
                        arrayDpto.get(i).getEmail(),                
                        arrayDpto.get(i).getEndereco(),             
                        arrayDpto.get(i).getNumero(),             
                        arrayDpto.get(i).getTelefone()

                    };
                    modelo.addRow(linha);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "ERRO: Inserção não efetuada.");
            }
        }
        
//        else if (navegacaoDpto == NAVEGACAO_EDITAR) {
//            boolean update = dao.atualizarDepartamento(departamento);
//            if(update == true){
//                int index = tabDpto.getSelectedRow();
//                DefaultTableModel modelo = (DefaultTableModel) tabDpto.getModel();
//                modelo.setValueAt(departamento.getCodigo(), index, 0);
//                modelo.setValueAt(departamento.getNome(), index, 1);            
//            } else {
//                JOptionPane.showMessageDialog(rootPane, "ERRO: Atualização não efetuada.");                
//            }
//        }
        navegacaoDpto = NAVEGACAO_NAV;
        //navegacaoInterfaceDpto();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabClienteMouseClicked
        int index = tabCliente.getSelectedRow();
        if (index >= 0 &&  index < tabCliente.getRowCount()){
//            int codigoDepartamento = Integer.parseInt(tabCliente.getModel().getValueAt(index, 0).toString());
//            Departamento departamento = dao.getDepartamento(codigoDepartamento);
//            textDptoCodigo.setText(String.valueOf(departamento.getCodigo()));
//            textDptoNome.setText(departamento.getNome());
//            navegacaoDpto = NAVEGACAO_SELECAO;
//            navegacaoInterfaceDpto();
        }
    }//GEN-LAST:event_tabClienteMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int codigo = Integer.parseInt(txtIDUsuario.getText());
        
        clientes Clientes = new clientes();    
        Clientes.setIdCliente(codigo);
        Clientes.setNome(txtNome.getText());
        boolean update = dao.atualizarClientes(Clientes);
            if(update == true){
                JOptionPane.showMessageDialog(rootPane, "efetuada.");
                 DefaultTableModel modelo = new DefaultTableModel(new Object[]{"id","Nome", "Bairro", "CEP", "CNPJ CPF", "Complemento", "Email", "Endereço", "Num", "Telefone"}, 0);
                tabCliente.setModel(modelo);
                tabCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
                tabCliente.getColumnModel().getColumn(1).setPreferredWidth(200);        
                ArrayList<clientes> arrayDpto = dao.getDepartamento();
                for(int i = 0; i < arrayDpto.size(); i++){
                    Object linha[] = new Object[] {
                        arrayDpto.get(i).getIdCliente(),                
                        arrayDpto.get(i).getNome(),
                        arrayDpto.get(i).getBairro(),                
                        arrayDpto.get(i).getCep(),                
                        arrayDpto.get(i).getCnpjcpf(),                
                        arrayDpto.get(i).getComplemento(),                
                        arrayDpto.get(i).getEmail(),                
                        arrayDpto.get(i).getEndereco(),             
                        arrayDpto.get(i).getNumero(),             
                        arrayDpto.get(i).getTelefone()

                    };
                    modelo.addRow(linha);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "ERRO: Atualização não efetuada.");                
            }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqActionPerformed
         // TODO add your handling code here:
        int  numero =0;
            String  bairro= txtBairro.getText();
            String  cep= txtCEP.getText();
            String  cpfcpnj= txtCPFCNPJ.getText();
            String  cidade= txtCidade.getText();
            String  complemento= txtComplemento.getText();
            String  email= txtEmail.getText();
            String  endereco= txtEndereco.getText();
            String  nome= txtNome.getText();
            if ("".equals(txtNumero.getText())) {
                    
             }else{
              numero = Integer.parseInt(txtNumero.getText());
            }
             
            String telefone = txtTelefone.getText();
            String uf = txtUF.getText();
            
            
            
             if (txtBairro.getText() == "" || txtCEP.getText() == "" || txtCPFCNPJ.getText() == "" || txtCidade.getText() == ""
                || txtCidade.getText() == "" || txtComplemento.getText() == "" || txtEmail.getText() == "" || txtEndereco.getText() == ""
                    || txtNome.getText() == "" || numero == 0 || txtTelefone.getText() == "" || txtUF.getText() == ""){
                 
                JOptionPane.showMessageDialog(rootPane, "ERRO: Todos os Campos nao inserido.");
                
             }else{
                 
            
            boolean inserir = dao.inserirCliente(bairro,cep,cpfcpnj,cidade,complemento,email,endereco,nome,numero,telefone,uf );
            if(inserir == true){
//                DefaultTableModel modelo = (DefaultTableModel) tabCliente.getModel();
//                Object linha[] = new Object[] {bairro,cep,cpfcpnj,cidade,complemento,email,endereco,nome,numero,telefone,uf};
//                modelo.addRow(linha);
                JOptionPane.showMessageDialog(rootPane, "efetuada.");
                 DefaultTableModel modelo = new DefaultTableModel(new Object[]{"id","Nome", "Bairro", "CEP", "CNPJ CPF", "Complemento", "Email", "Endereço", "Num", "Telefone"}, 0);
                tabCliente.setModel(modelo);
                tabCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
                tabCliente.getColumnModel().getColumn(1).setPreferredWidth(200);        
                ArrayList<clientes> arrayDpto = dao.getDepartamento();
                for(int i = 0; i < arrayDpto.size(); i++){
                    Object linha[] = new Object[] {
                        arrayDpto.get(i).getIdCliente(),                
                        arrayDpto.get(i).getNome(),
                        arrayDpto.get(i).getBairro(),                
                        arrayDpto.get(i).getCep(),                
                        arrayDpto.get(i).getCnpjcpf(),                
                        arrayDpto.get(i).getComplemento(),                
                        arrayDpto.get(i).getEmail(),                
                        arrayDpto.get(i).getEndereco(),             
                        arrayDpto.get(i).getNumero(),             
                        arrayDpto.get(i).getTelefone()

                    };
                    modelo.addRow(linha);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "ERRO: Inserção não efetuada.");
            }
    }//GEN-LAST:event_txtPesqActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cad_clientes_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cad_clientes_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cad_clientes_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cad_clientes_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cad_clientes_frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable tabCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPFCNPJ;
    private javax.swing.JTextField txtCampoPesq;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextPane txtIDUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JButton txtPesq;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}
