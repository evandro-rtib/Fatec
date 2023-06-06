package fatec.poo.view;

public class GuiMenu extends javax.swing.JFrame {

    /**
     * Creates new form GuiMenu
     */
    public GuiMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuItemClientes = new javax.swing.JMenuItem();
        menuItemVendedores = new javax.swing.JMenuItem();
        menuItemProdutos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemSair = new javax.swing.JMenuItem();
        menuPedido = new javax.swing.JMenu();
        menuItemEmitirPedido = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de vendas");

        menuCadastros.setText("Cadastros");

        menuItemClientes.setText("Clientes");
        menuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClientesActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemClientes);

        menuItemVendedores.setText("Vendedores");
        menuItemVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVendedoresActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemVendedores);

        menuItemProdutos.setText("Produtos");
        menuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProdutosActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemProdutos);
        menuCadastros.add(jSeparator1);

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemSair);

        jMenuBar1.add(menuCadastros);

        menuPedido.setText("Pedido");

        menuItemEmitirPedido.setText("Emitir pedido");
        menuPedido.add(menuItemEmitirPedido);

        jMenuBar1.add(menuPedido);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClientesActionPerformed
        new GuiCliente().setVisible(true);
    }//GEN-LAST:event_menuItemClientesActionPerformed

    private void menuItemVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVendedoresActionPerformed
        new GuiVendedor().setVisible(true);
    }//GEN-LAST:event_menuItemVendedoresActionPerformed

    private void menuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProdutosActionPerformed
        new GuiProduto().setVisible(true);
    }//GEN-LAST:event_menuItemProdutosActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        dispose();
    }//GEN-LAST:event_menuItemSairActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuItemClientes;
    private javax.swing.JMenuItem menuItemEmitirPedido;
    private javax.swing.JMenuItem menuItemProdutos;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemVendedores;
    private javax.swing.JMenu menuPedido;
    // End of variables declaration//GEN-END:variables
}