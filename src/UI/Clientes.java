/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import bll.ClienteBLL;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author NunoM
 */
public class Clientes extends javax.swing.JPanel {
    
     private Cliente cl;
     
     
    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
       cl = new Cliente();
      
        actualizaDados();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelRecebeFunc1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCli = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        CliMorada = new javax.swing.JTextField();
        CliNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btNovo1 = new javax.swing.JButton();
        btEdit1 = new javax.swing.JButton();
        btElim1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(879, 478));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Cliente");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Funcionário:");

        tableCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Morada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCliMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableCliMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tableCli);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Nome:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Morada:");

        btNovo1.setText("Novo");
        btNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovo1ActionPerformed(evt);
            }
        });

        btEdit1.setText("Editar");
        btEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEdit1ActionPerformed(evt);
            }
        });

        btElim1.setText("Eliminar");
        btElim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btElim1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(labelRecebeFunc1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(25, 25, 25)
                                .addComponent(CliNome, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CliMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btNovo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btElim1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEdit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelRecebeFunc1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNovo1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEdit1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btElim1)
                    .addComponent(CliMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovo1ActionPerformed
       
           if( CliNome.getText().isEmpty() || CliMorada.getText().isEmpty()){
            String messag = "Campos Vazios!!";
            String titl = "Insira Nome e Morada";
            int reply = JOptionPane.showConfirmDialog(null, messag, titl, JOptionPane.DEFAULT_OPTION);
           }
         else{
     
        
        cl.setNome(CliNome.getText());
        cl.setMorada(CliMorada.getText());
        ClienteBLL.create(cl);
        
     
        actualizaDados();
        
         
     
                 }
        
        
    }//GEN-LAST:event_btNovo1ActionPerformed

    private void tableCliMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCliMouseReleased
       
    }//GEN-LAST:event_tableCliMouseReleased

    private void btEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEdit1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableCli.getModel();
        if(tableCli.getSelectedRow()==-1){
            if(tableCli.getRowCount()==0){
                    String messag = "Tabela Vazia!!";
                    String titl = "Sem dados";
                    int reply = JOptionPane.showConfirmDialog(null, messag, titl, JOptionPane.DEFAULT_OPTION);
            }else{
                    String messag = "Aviso!!";
                    String titl = "Selecione um Cliente";
                    int reply = JOptionPane.showConfirmDialog(null, messag, titl, JOptionPane.DEFAULT_OPTION);
            }   
        }
        else{
            model.setValueAt(CliNome.getText(),tableCli.getSelectedRow(),0);
            model.setValueAt(CliMorada.getText(),tableCli.getSelectedRow(),1);
            
        }
    }//GEN-LAST:event_btEdit1ActionPerformed

    private void tableCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCliMouseClicked
        DefaultTableModel model = (DefaultTableModel) tableCli.getModel();
        CliNome.setText(model.getValueAt(tableCli.getSelectedRow(),0).toString());
        CliMorada.setText(model.getValueAt(tableCli.getSelectedRow(),1).toString());
    }//GEN-LAST:event_tableCliMouseClicked

    private void btElim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btElim1ActionPerformed
         DefaultTableModel model = (DefaultTableModel) tableCli.getModel();
        if(tableCli.getSelectedRow()==-1){
            if(tableCli.getRowCount()==0){
            String messag = "Tabela Vazia!!";
            String titl = "Sem dados";
            int reply = JOptionPane.showConfirmDialog(null, messag, titl, JOptionPane.DEFAULT_OPTION);
            }else{
            String messag = "Aviso!!";
            String titl = "Selecione um Cliente";
            int reply = JOptionPane.showConfirmDialog(null, messag, titl, JOptionPane.DEFAULT_OPTION);
            }
        }
        else{
            model.removeRow(tableCli.getSelectedRow());
            ClienteBLL.delete(cl);
          
           
        }
    }//GEN-LAST:event_btElim1ActionPerformed

    public void limparJTable(){
        javax.swing.table.DefaultTableModel model2 = (javax.swing.table.DefaultTableModel)tableCli.getModel();
        model2.setRowCount(0);
    }
 
    public void actualizaDados(){
    ArrayList<Cliente> clis = new ArrayList<>();
    
    limparJTable();
    if(ClienteBLL.retrieveALL()!=null){
        javax.swing.table.DefaultTableModel model1 = (javax.swing.table.DefaultTableModel)tableCli.getModel();
        for(Cliente a: ClienteBLL.retrieveALL()){
                 model1.addRow(new Object[]{a.getNome(), a.getMorada()});
        }
    }
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CliMorada;
    private javax.swing.JTextField CliNome;
    private javax.swing.JButton btEdit1;
    private javax.swing.JButton btElim1;
    private javax.swing.JButton btNovo1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelRecebeFunc1;
    private javax.swing.JTable tableCli;
    // End of variables declaration//GEN-END:variables
}
