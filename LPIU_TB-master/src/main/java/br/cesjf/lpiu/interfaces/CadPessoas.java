/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.interfaces;

import br.cesjf.lpiu.arquivos.ArquivoInCarro;
import br.cesjf.lpiu.arquivos.ArquivoInPessoa;
import br.cesjf.lpiu.arquivos.ArquivoInRelatorio;
import br.cesjf.lpiu.arquivos.ArquivoOutPessoa;
import br.cesjf.lpiu.arquivos.ArquivoOutRelatorio;
import br.cesjf.lpiu.modelo.Automovel;
import br.cesjf.lpiu.modelo.Pessoa;
import br.cesjf.lpiu.modelo.Relatorio;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author claud
 */
public class CadPessoas extends javax.swing.JFrame {

    private ArquivoInCarro arqinCar = new ArquivoInCarro();
    private ArquivoInPessoa arqin = new ArquivoInPessoa();
    private ArquivoInRelatorio arqinRela = new ArquivoInRelatorio();
    private Pessoa pess = null;
    int linha;
    private ArquivoOutPessoa arqout = new ArquivoOutPessoa();
    private ArquivoOutRelatorio arqoutRela = new ArquivoOutRelatorio();

    /**
     * Creates new form CadastroPessoas
     */
    public CadPessoas() {

        pes = new Pessoa();
        try {
            initComponents();
            arqout.abrir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CadPessoas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CadPessoas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Pessoa pes = null;

    public void limpar() {
        txtNome.setText("");
        txtCNH.setText("");
        txtDataNasc.setText("");
        txtCidade.setText("");
        txtBairro.setText("");
        txtCEP.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        comboEstado.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpCadPessoa = new javax.swing.JPanel();
        txtDataNasc = new javax.swing.JFormattedTextField();
        txtCNH = new javax.swing.JFormattedTextField();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbDataNasc = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpEndereço = new javax.swing.JPanel();
        txtNumero = new javax.swing.JFormattedTextField();
        lbRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lbNumero = new javax.swing.JLabel();
        lbComplemento = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lbCEP = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        comboEstado = new javax.swing.JComboBox<>();
        txtComplemento = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btLista = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtModelo = new javax.swing.JTable();
        jpListaPessoa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabelaPessoa = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pessoas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jpCadPessoa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jpCadPessoa.add(txtDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 31, 141, -1));

        try {
            txtCNH.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jpCadPessoa.add(txtCNH, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 31, 126, -1));

        lbNome.setText("Nome:");
        jpCadPessoa.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, -1, -1));
        jpCadPessoa.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 0, 427, -1));

        lbDataNasc.setText("Data de Nascimento:");
        jpCadPessoa.add(lbDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 34, -1, -1));

        jLabel3.setText("CNH:");
        jpCadPessoa.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 34, -1, -1));

        jpEndereço.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        try {
            txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbRua.setText("Rua:");

        lbNumero.setText("Numero:");

        lbComplemento.setText("Complemento:");

        lbBairro.setText("Bairro:");

        lbCidade.setText("Cidade:");

        lbCEP.setText("CEP:");

        lbEstado.setText("Estado:");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Estado", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)", " " }));

        javax.swing.GroupLayout jpEndereçoLayout = new javax.swing.GroupLayout(jpEndereço);
        jpEndereço.setLayout(jpEndereçoLayout);
        jpEndereçoLayout.setHorizontalGroup(
            jpEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEndereçoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpEndereçoLayout.createSequentialGroup()
                        .addComponent(lbRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRua))
                    .addGroup(jpEndereçoLayout.createSequentialGroup()
                        .addComponent(lbComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComplemento))
                    .addGroup(jpEndereçoLayout.createSequentialGroup()
                        .addGroup(jpEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCidade)
                            .addComponent(lbEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jpEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNumero)
                    .addComponent(lbBairro)
                    .addComponent(lbCEP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEndereçoLayout.createSequentialGroup()
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtBairro)
                    .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jpEndereçoLayout.setVerticalGroup(
            jpEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEndereçoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbComplemento)
                    .addComponent(lbBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCEP)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEstado)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpCadPessoa.add(jpEndereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 462, -1));

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        jpCadPessoa.add(btAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 473, -1, -1));

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jpCadPessoa.add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 473, -1, -1));

        btLista.setText("Lista");
        btLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListaActionPerformed(evt);
            }
        });
        jpCadPessoa.add(btLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 473, -1, -1));

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jpCadPessoa.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        jtModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Placa"
            }
        ));
        jtModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtModeloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtModelo);

        jpCadPessoa.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 470, 158));

        jTabbedPane1.addTab("Cadastro de Pessoa", jpCadPessoa);

        tbTabelaPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CNH", "Data de Nascimento"
            }
        ));
        tbTabelaPessoa.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbTabelaPessoa);

        btAlterar.setText("Alterar");

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpListaPessoaLayout = new javax.swing.GroupLayout(jpListaPessoa);
        jpListaPessoa.setLayout(jpListaPessoaLayout);
        jpListaPessoaLayout.setHorizontalGroup(
            jpListaPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpListaPessoaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExcluir)
                .addGap(51, 51, 51))
        );
        jpListaPessoaLayout.setVerticalGroup(
            jpListaPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaPessoaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpListaPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir))
                .addGap(0, 227, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista de Pessoas", jpListaPessoa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        new Principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
        jpListaPessoa.setVisible(true);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed

        List<Automovel> listacar = new ArrayList<>();
        List<Relatorio> listarela = new ArrayList<>();

        Pessoa pes = new Pessoa();
        Relatorio rela = new Relatorio();

        pes.setNome(txtNome.getText());
        pes.setCnh(txtCNH.getText());
        pes.setDataNasc(txtDataNasc.getText());

        rela.setNome(txtNome.getText());
        linha = jtModelo.getSelectedRow();
        rela.setModelo((String) jtModelo.getValueAt(linha, 0));
        rela.setPlaca((String) jtModelo.getValueAt(linha, 1));

        try {
            arqout.Adicionar(pes);
            arqoutRela.Adicionar(rela);
        } catch (IOException ex) {
            Logger.getLogger(CadPessoas.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");

        limpar();

        int cont = 1;

        List<Pessoa> listarpessoa = new ArrayList<>();

        listarpessoa = arqin.getTodasPessoas();
        DefaultTableModel modelopessoa = (DefaultTableModel) tbTabelaPessoa.getModel();

        for (int i = tbTabelaPessoa.getRowCount() - 1; i >= 0; --i) {
            modelopessoa.removeRow(i);
        }

        for (int i = 0; i < listarpessoa.size(); i++) {
            modelopessoa.addRow(listarpessoa.get(i).getpessoa());
            cont++;
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Principal princ = new Principal();
        princ.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int cont = 1;

        List<Pessoa> listarpessoa = new ArrayList<Pessoa>();

        listarpessoa = arqin.getTodasPessoas();
        DefaultTableModel modelopessoa = (DefaultTableModel) tbTabelaPessoa.getModel();

        for (int i = tbTabelaPessoa.getRowCount() - 1; i >= 0; --i) {
            modelopessoa.removeRow(i);
        }

        for (int i = 0; i < listarpessoa.size(); i++) {
            modelopessoa.addRow(listarpessoa.get(i).getpessoa());
            cont++;
        }

        cont = 1;

        List<Automovel> listacar = new ArrayList<Automovel>();

        listacar = arqinCar.getTodosCarros();
        DefaultTableModel modelocar = (DefaultTableModel) jtModelo.getModel();
        for (int j = jtModelo.getRowCount() - 1; j >= 0; --j) {
            modelocar.removeRow(j);
        }

        for (int j = 0; j < listacar.size(); j++) {
            modelocar.addRow(listacar.get(j).getcarro());
            cont++;
        }
    }//GEN-LAST:event_formWindowOpened

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tbTabelaPessoa.getModel();
        List<Pessoa> list = new ArrayList<Pessoa>();
        ArrayList<Pessoa> nova_list = new ArrayList<Pessoa>();
        linha = tbTabelaPessoa.getSelectedRow();
        Object valor = modelo.getValueAt(linha, 0);
        list = arqin.getTodasPessoas();

        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i).getNome().equals(valor))) {
                nova_list.add(list.get(i));
            }
        }
        try {
            arqout.recadastrar_todos(nova_list);
        } catch (IOException ex) {
            Logger.getLogger(CadPessoas.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelo.removeRow(linha);
        JOptionPane.showMessageDialog(null, "Registro apagada com sucesso");

        limpar();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void jtModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtModeloMouseClicked
        linha = jtModelo.getSelectedRow();
    }//GEN-LAST:event_jtModeloMouseClicked

    private void btListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListaActionPerformed
        TelaRelatorio rela = new TelaRelatorio();
        rela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btListaActionPerformed

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
            java.util.logging.Logger.getLogger(CadPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadPessoas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btLista;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpCadPessoa;
    private javax.swing.JPanel jpEndereço;
    private javax.swing.JPanel jpListaPessoa;
    private javax.swing.JTable jtModelo;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbDataNasc;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbRua;
    private javax.swing.JTable tbTabelaPessoa;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNH;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
