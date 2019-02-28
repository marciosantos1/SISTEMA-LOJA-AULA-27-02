/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sisloj.views;

import br.senai.sc.sisloj.dao.ClienteDao;
import br.senai.sc.sisloj.modelo.Cliente;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class ListagemCliente extends javax.swing.JPanel {

    private CardLayout cl;
   
    public ListagemCliente() {
        initComponents();
      this.add(painelListagem, "painelListagem");
      this.add(painelEdicao, "painelEdicao");
      
      this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "painelListagem");

    }

    private void popularTabela() {
        ClienteDao cli = new ClienteDao();
        List<Cliente> listaCliente = null;
        try {

            listaCliente = cli.listarClientes();
            
            DefaultTableModel model = (DefaultTableModel) tblCliente.getModel();
            List<Object> lista = new ArrayList<Object>();// cria um objeto "lista" que é uma Arraylist

            for (int i = 0; i < listaCliente.size(); i++) {
                Cliente c = listaCliente.get(i);
                lista.add(new Object[]{c.getCodcli(), c.getNomcli(), c.getEndcli(), c.getBaicli(), c.getComcli(),
                    c.getCepcli(), c.getCelcli()});
            }
            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }
            

        } catch (SQLException ex) {
            String msg = "Ocorreu um erro ao obter os clientes do banco de dados";
            JOptionPane.showMessageDialog(null, msg);
            Logger.getLogger(ListagemCliente.class.getName()).log(Level.SEVERE, null, ex);
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

        painelListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        painelEdicao = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCadastroCliente = new javax.swing.JLabel();
        cpNome = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        cpEndereco = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        cpBairro = new javax.swing.JTextField();
        jLabelCep = new javax.swing.JLabel();
        cpformatadoCep = new javax.swing.JFormattedTextField();
        jLabelComplemento = new javax.swing.JLabel();
        cpComplemento = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabelContato = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        cpformatadoCelular = new javax.swing.JFormattedTextField();
        botaoSalvar = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        painelListagem.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                painelListagemComponentShown(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereço", "Bairro", "Complemento", "Cep", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        tblCliente.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblClienteComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        javax.swing.GroupLayout painelListagemLayout = new javax.swing.GroupLayout(painelListagem);
        painelListagem.setLayout(painelListagemLayout);
        painelListagemLayout.setHorizontalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelListagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelListagemLayout.setVerticalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelListagemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(painelListagem, "card3");

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNome.setText("Nome :");

        jLabelCadastroCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCadastroCliente.setText("Cadastro de Cliente ");

        cpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeActionPerformed(evt);
            }
        });

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEndereco.setText("Endereço :");

        cpEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpEnderecoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Localização");

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelBairro.setText("Bairro :");

        jLabelCep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCep.setText("Cep :");

        try {
            cpformatadoCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##### - ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelComplemento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelComplemento.setText("Complemento :");

        jLabelContato.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelContato.setText("Contato");

        jLabelCelular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCelular.setText("Celular :");

        try {
            cpformatadoCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(0, 0, 153));
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelEdicaoLayout = new javax.swing.GroupLayout(painelEdicao);
        painelEdicao.setLayout(painelEdicaoLayout);
        painelEdicaoLayout.setHorizontalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(jLabelCelular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpformatadoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelContato)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(jLabelComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCadastroCliente)
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEndereco)
                                    .addComponent(jLabelBairro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdicaoLayout.createSequentialGroup()
                                        .addComponent(cpBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelCep)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpformatadoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelEdicaoLayout.setVerticalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCadastroCliente)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(cpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro)
                    .addComponent(cpBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCep)
                    .addComponent(cpformatadoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComplemento)
                    .addComponent(cpComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCelular)
                    .addComponent(cpformatadoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSalvar)
                .addContainerGap())
        );

        add(painelEdicao, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void cpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeActionPerformed

    private void cpEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpEnderecoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // TODO add your handling code here:
        Cliente cli = new Cliente();

        cli.setNomcli(cpNome.getText());// seta o conteudo para dentro do botao salvar em nome.
        cli.setEndcli(cpEndereco.getText());
        cli.setBaicli(cpBairro.getText());
        cli.setComcli(cpComplemento.getText());

        String cep = cpformatadoCep.getText();
        cep = cep.replaceAll("[^0-9]", "");// formatação para remover caracteres que não são numeros.

        String celular = cpformatadoCelular.getText();
        celular = celular.replaceAll("[^0-9]", "");

        cli.setCepcli(Long.parseLong(cep));// faz a conversão da string cep para inteiro

        cli.setCelcli(Long.parseLong(celular));

        //inseri o cliente no banco de dados.
        ClienteDao cliDao = new ClienteDao();
        try {
            cliDao.inserir(cli);
            JOptionPane.showMessageDialog(null, "CLIENTE INSERIDO COM SUCESSO!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "FALHA AO INSERIR CLIENTE !!!");
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void painelListagemComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_painelListagemComponentShown
        this.popularTabela();
    }//GEN-LAST:event_painelListagemComponentShown

    private void tblClienteComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblClienteComponentShown
      JOptionPane.showMessageDialog(null, jLabelCadastroCliente);
    }//GEN-LAST:event_tblClienteComponentShown

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
       JOptionPane.showMessageDialog(null, "Você clicou na linha: ");
    }//GEN-LAST:event_tblClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField cpBairro;
    private javax.swing.JTextField cpComplemento;
    private javax.swing.JTextField cpEndereco;
    private javax.swing.JTextField cpNome;
    private javax.swing.JFormattedTextField cpformatadoCelular;
    private javax.swing.JFormattedTextField cpformatadoCep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCadastroCliente;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelContato;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel painelEdicao;
    private javax.swing.JPanel painelListagem;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables
}
