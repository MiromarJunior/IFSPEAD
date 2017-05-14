package View;

import DAO.DisciplinaDAO;
import Model.Disciplina;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miromar
 */
public class ListaDisciplinasForm extends javax.swing.JFrame {

    public ListaDisciplinasForm() {
        initComponents();
        listaDisciplinas();
    }

    /**
     * Este método listaDisciplinas inicia os valores da tabela buscando no
     * banco de Dados
     */
    private void listaDisciplinas() {
        DisciplinaDAO dao = new DisciplinaDAO();

        ArrayList<Disciplina> lista = dao.select();
        for (Disciplina disc : lista) {
            Object[] obj = {disc.getIdDisciplina(), disc.getCurso(),
                disc.getNomeDisciplina(), disc.getPeriodo(), disc.getCargaHoraria(),
                disc.getNumeroVagas()};

            ((DefaultTableModel) jTableListaDisciplinas.getModel()).addRow(obj);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaDisciplinas = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCadastrarNovaDisciplina = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableListaDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Curso", "Disciplina", "Período", "Carga Horária", "Número de Vagas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListaDisciplinas);

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCadastrarNovaDisciplina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCadastrarNovaDisciplina.setText("Cadastrar Nova Disciplina");
        jButtonCadastrarNovaDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarNovaDisciplinaActionPerformed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setToolTipText("");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadastrarNovaDisciplina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCadastrarNovaDisciplina)
                    .addComponent(jButtonSair))
                .addGap(167, 167, 167))
        );

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Lista de Disciplinas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        if (jTableListaDisciplinas.getSelectedRow() != -1) {
            
            String msg = (String) jTableListaDisciplinas.getValueAt(jTableListaDisciplinas.getSelectedRow(),2);

            int confirma = JOptionPane.showConfirmDialog(rootPane, "Deseja Excluir a Disciplina : \n"+msg.toUpperCase(), "Exclusão de Disciplina", JOptionPane.YES_NO_OPTION);

            if (confirma == JOptionPane.YES_OPTION) {

                Disciplina disc = new Disciplina();
                DisciplinaDAO dao = new DisciplinaDAO();
                disc.setIdDisciplina((int) jTableListaDisciplinas.getValueAt(jTableListaDisciplinas.getSelectedRow(), 0));

                if (dao.delete(disc)) {

                    JOptionPane.showMessageDialog(rootPane, "Excluido com Sucesso");

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao Excluir");
                }
            }
            ((DefaultTableModel) jTableListaDisciplinas.getModel()).setNumRows(0);
            listaDisciplinas();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma Disciplina");
        }


    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCadastrarNovaDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarNovaDisciplinaActionPerformed
        dispose();
        new CadastrarDisciplinasForm().setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarNovaDisciplinaActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        int confirma = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair?", "Sair do Listagem!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(ListaDisciplinasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDisciplinasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDisciplinasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDisciplinasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDisciplinasForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarNovaDisciplina;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaDisciplinas;
    // End of variables declaration//GEN-END:variables
}
