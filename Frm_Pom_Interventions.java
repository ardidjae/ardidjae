/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

/**
 *
 * @author theo.lelievre2
 */
public class Frm_Pom_Interventions extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Pom_Interventions
     */
    public Frm_Pom_Interventions() {
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

        jlbl_titreGestionPompiers = new javax.swing.JLabel();
        jlbl_pompier = new javax.swing.JLabel();
        jlbl_ville = new javax.swing.JLabel();
        jlbl_numeroBip = new javax.swing.JLabel();
        jlbl_nom = new javax.swing.JLabel();
        jlbl_heureArrive = new javax.swing.JLabel();
        jlbl_dateNaissance = new javax.swing.JLabel();
        jlbl_dbVille = new javax.swing.JLabel();
        jlbl_dbNumeroBip = new javax.swing.JLabel();
        jlbl_dbNom = new javax.swing.JLabel();
        jlbl_dbPrenom = new javax.swing.JLabel();
        jlbl_dbDateNaissance = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jbtn_retournerBureau = new javax.swing.JButton();
        jlbl_codePostal3 = new javax.swing.JLabel();
        jlbl_dbCodePostal1 = new javax.swing.JLabel();
        jlbl_codePostal4 = new javax.swing.JLabel();
        jlbl_dbCodePostal2 = new javax.swing.JLabel();
        jlbl_ListPompier = new javax.swing.JComboBox<>();
        jbtn_retournerBureau1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbl_titreGestionPompiers.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlbl_titreGestionPompiers.setText("Historique interventions");

        jlbl_pompier.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbl_pompier.setText("Interventions :");

        jlbl_ville.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_ville.setText("Heure arrivée :");

        jlbl_numeroBip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_numeroBip.setText("Id d\"intervention :");

        jlbl_nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_nom.setText("Lieu :");

        jlbl_heureArrive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_heureArrive.setText("Date :");

        jlbl_dateNaissance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_dateNaissance.setText("Heure Appel :");

        jlbl_dbVille.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_dbVille.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbl_dbNumeroBip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_dbNumeroBip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbl_dbNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_dbNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbl_dbPrenom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_dbPrenom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbl_dbDateNaissance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_dbDateNaissance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtn_retournerBureau.setBackground(new java.awt.Color(102, 255, 102));
        jbtn_retournerBureau.setText("Revenir au bureau");

        jlbl_codePostal3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_codePostal3.setText("Situation :");

        jlbl_dbCodePostal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_dbCodePostal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbl_codePostal4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_codePostal4.setText("Durée :");

        jlbl_dbCodePostal2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbl_dbCodePostal2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbl_ListPompier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtn_retournerBureau1.setBackground(new java.awt.Color(102, 255, 102));
        jbtn_retournerBureau1.setText("Revenir au Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbl_codePostal3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbl_dbCodePostal1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbl_codePostal4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbl_dbCodePostal2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbl_ville)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbl_dbVille, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbl_dateNaissance)
                                .addGap(18, 18, 18)
                                .addComponent(jlbl_dbDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbl_heureArrive)
                                .addGap(18, 18, 18)
                                .addComponent(jlbl_dbPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbl_nom)
                                .addGap(18, 18, 18)
                                .addComponent(jlbl_dbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jlbl_numeroBip)
                                .addGap(18, 18, 18)
                                .addComponent(jlbl_dbNumeroBip, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn_retournerBureau1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jbtn_retournerBureau, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addComponent(jlbl_titreGestionPompiers))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jlbl_pompier))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jlbl_ListPompier, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbl_dbNumeroBip, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_numeroBip))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_dbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_nom))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_heureArrive)
                    .addComponent(jlbl_dbPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbl_dbDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_dateNaissance))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbl_dbVille, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_ville))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbl_codePostal4)
                    .addComponent(jlbl_dbCodePostal2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_dbCodePostal1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_codePostal3))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_retournerBureau)
                    .addComponent(jbtn_retournerBureau1))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jlbl_titreGestionPompiers, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jlbl_pompier)
                    .addGap(8, 8, 8)
                    .addComponent(jlbl_ListPompier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 261, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Frm_Pom_Interventions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Pom_Interventions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Pom_Interventions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Pom_Interventions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Pom_Interventions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtn_retournerBureau;
    private javax.swing.JButton jbtn_retournerBureau1;
    private javax.swing.JComboBox<String> jlbl_ListPompier;
    private javax.swing.JLabel jlbl_codePostal3;
    private javax.swing.JLabel jlbl_codePostal4;
    private javax.swing.JLabel jlbl_dateNaissance;
    private javax.swing.JLabel jlbl_dbCodePostal1;
    private javax.swing.JLabel jlbl_dbCodePostal2;
    private javax.swing.JLabel jlbl_dbDateNaissance;
    private javax.swing.JLabel jlbl_dbNom;
    private javax.swing.JLabel jlbl_dbNumeroBip;
    private javax.swing.JLabel jlbl_dbPrenom;
    private javax.swing.JLabel jlbl_dbVille;
    private javax.swing.JLabel jlbl_heureArrive;
    private javax.swing.JLabel jlbl_nom;
    private javax.swing.JLabel jlbl_numeroBip;
    private javax.swing.JLabel jlbl_pompier;
    private javax.swing.JLabel jlbl_titreGestionPompiers;
    private javax.swing.JLabel jlbl_ville;
    // End of variables declaration//GEN-END:variables
}
