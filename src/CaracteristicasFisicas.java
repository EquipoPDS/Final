
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PC Mateo
 */
public class CaracteristicasFisicas extends javax.swing.JFrame {

    /**
     * Creates new form DatosPersonales
     */
    int xMouse, yMouse;
    public CaracteristicasFisicas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private String disease;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        LogoNombre = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Logo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pesoLabel = new javax.swing.JLabel();
        pesoTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        alturaLabel = new javax.swing.JLabel();
        alturaTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        enfermedadLabel = new javax.swing.JLabel();
        ingresarBtn = new javax.swing.JPanel();
        ingresarTxt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        generoCmb = new javax.swing.JComboBox<>();
        generoLabel = new javax.swing.JLabel();
        enfermedadCmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoNombre.setFont(new java.awt.Font("Poppins Black", 1, 24)); // NOI18N
        LogoNombre.setForeground(new java.awt.Color(28, 28, 28));
        LogoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoNombre.setText("Alimentus");
        bg.add(LogoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 290, -1));

        Logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.png"))); // NOI18N
        bg.add(Logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 290, -1));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo1.png"))); // NOI18N
        bg.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 0, 300, 500));

        Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2.png"))); // NOI18N
        bg.add(Logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Poppins Black", 1, 20)); // NOI18N
        jLabel1.setText("Características Físicas");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        pesoLabel.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        pesoLabel.setText("Peso(Kg)");
        bg.add(pesoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        pesoTxt.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        pesoTxt.setForeground(new java.awt.Color(204, 204, 204));
        pesoTxt.setText("71.");
        pesoTxt.setBorder(null);
        pesoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pesoTxtMousePressed(evt);
            }
        });
        pesoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoTxtActionPerformed(evt);
            }
        });
        bg.add(pesoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 380, 30));

        jSeparator1.setAutoscrolls(true);
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 380, 10));

        alturaLabel.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        alturaLabel.setText("Altura(Cm)");
        bg.add(alturaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        alturaTxt.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        alturaTxt.setForeground(new java.awt.Color(204, 204, 204));
        alturaTxt.setText("183.");
        alturaTxt.setBorder(null);
        alturaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                alturaTxtMousePressed(evt);
            }
        });
        alturaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaTxtActionPerformed(evt);
            }
        });
        bg.add(alturaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 380, 30));

        jSeparator2.setAutoscrolls(true);
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 380, 10));

        enfermedadLabel.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        enfermedadLabel.setText("Enfermedad");
        bg.add(enfermedadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        ingresarBtn.setBackground(new java.awt.Color(17, 77, 77));

        ingresarTxt.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        ingresarTxt.setForeground(new java.awt.Color(255, 255, 255));
        ingresarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresarTxt.setText("SIGUIENTE");
        ingresarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ingresarBtnLayout = new javax.swing.GroupLayout(ingresarBtn);
        ingresarBtn.setLayout(ingresarBtnLayout);
        ingresarBtnLayout.setHorizontalGroup(
            ingresarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        ingresarBtnLayout.setVerticalGroup(
            ingresarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(ingresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 100, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Poppins Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 786, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        generoCmb.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        generoCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));
        generoCmb.setBorder(null);
        bg.add(generoCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, 30));

        generoLabel.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        generoLabel.setText("Género");
        bg.add(generoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        enfermedadCmb.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        enfermedadCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Azúcar alto", "Colesterol alto", "Anemia", "Problemas digestivos" }));
        bg.add(enfermedadCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        btnExit.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        btnExit.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void ingresarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarTxtMouseExited
        ingresarBtn.setBackground(new Color(17,77,77));
    }//GEN-LAST:event_ingresarTxtMouseExited

    private void ingresarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarTxtMouseEntered
        ingresarBtn.setBackground(new Color(35,122,112));
    }//GEN-LAST:event_ingresarTxtMouseEntered

    private void ingresarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarTxtMouseClicked
        this.disease=enfermedadCmb.getSelectedItem().toString();
        
        double pesoNum = Double.parseDouble(pesoTxt.getText());
        double alturaNum = Double.parseDouble(alturaTxt.getText());
        double alturaMetros = alturaNum/100;
        double imc = pesoNum / Math.pow(alturaMetros, 2);
        
        if (!validarNumeros(pesoTxt.getText().trim())) {
            JOptionPane.showMessageDialog(rootPane, "El peso no es correcto(Solo puede ingresar números)");
            if (!validarNumeros(alturaTxt.getText().trim())) {
                JOptionPane.showMessageDialog(rootPane, "La altura no es correcta(Solo puede ingresar números)");
            }
        } else if (!validarNumeros(alturaTxt.getText().trim())) {
            JOptionPane.showMessageDialog(rootPane, "La altura no es correcta(Solo puede ingresar números)");
        } else if (this.disease.equalsIgnoreCase("Ninguno")) {
            if (imc < 18.5) {
                javax.swing.JOptionPane.showMessageDialog(this, "Su IMC es: " + String.format("%.2f", imc) + "\nNivel de peso: Bajo");
            }else if(imc >= 18.5 && imc <= 24.9){
                javax.swing.JOptionPane.showMessageDialog(this, "Su IMC es: " + String.format("%.2f", imc) + "\nNivel de peso: Normal");
            }else if(imc >= 25.0 && imc <= 29.9){
                javax.swing.JOptionPane.showMessageDialog(this, "Su IMC es: " + String.format("%.2f", imc) + "\nNivel de peso: Sobrepeso");
            }else if(imc > 30.0){
                javax.swing.JOptionPane.showMessageDialog(this, "Su IMC es: " + String.format("%.2f", imc) + "\nNivel de peso: Obeso");
            }
            Menu m = new Menu();
            m.setVisible(true);
            this.setVisible(false);
            // Guardar información del usuario
            Persistencia p = new Persistencia();
            p.moduloP();
            
        }else {
            if (imc < 18.5) {
                javax.swing.JOptionPane.showMessageDialog(this, "Su IMC es: " + String.format("%.2f", imc) + "\nNivel de peso: Bajo");
            }else if(imc >= 18.5 && imc <= 24.9){
                javax.swing.JOptionPane.showMessageDialog(this, "Su IMC es: " + String.format("%.2f", imc) + "\nNivel de peso: Normal");
            }else if(imc >= 25.0 && imc <= 29.9){
                javax.swing.JOptionPane.showMessageDialog(this, "Su IMC es: " + String.format("%.2f", imc) + "\nNivel de peso: Sobrepeso");
            }else if(imc > 30.0){
                javax.swing.JOptionPane.showMessageDialog(this, "Su IMC es: " + String.format("%.2f", imc) + "\nNivel de peso: Obeso");
            }
            Enfermedad e = new Enfermedad();
            e.setVisible(true);
            this.setVisible(false);
            // Guardar información del usuario
            Persistencia p = new Persistencia();
            p.moduloP();
        }
    }//GEN-LAST:event_ingresarTxtMouseClicked

    private void alturaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaTxtActionPerformed

    private void alturaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alturaTxtMousePressed
        if (pesoTxt.getText().isEmpty()) {
            pesoTxt.setText("71.");
            pesoTxt.setForeground(Color.gray);
        }
        if (alturaTxt.getText().equals("183.")) {
            alturaTxt.setText("");
            alturaTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_alturaTxtMousePressed

    private void pesoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoTxtActionPerformed

    private void pesoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesoTxtMousePressed
        if (pesoTxt.getText().equals("71.")) {
            pesoTxt.setText("");
            pesoTxt.setForeground(Color.black);
        }
        if (alturaTxt.getText().isEmpty()) {
            alturaTxt.setText("183.");
            alturaTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_pesoTxtMousePressed
  
    public static boolean validarNumeros(String datos){
        return datos.matches("[0-9]*");
    }
    
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
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosPersonales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Logo2;
    private javax.swing.JLabel LogoNombre;
    private javax.swing.JLabel alturaLabel;
    public static javax.swing.JTextField alturaTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnExit;
    public static javax.swing.JComboBox<String> enfermedadCmb;
    private javax.swing.JLabel enfermedadLabel;
    private javax.swing.JLabel exitTxt;
    public static javax.swing.JComboBox<String> generoCmb;
    private javax.swing.JLabel generoLabel;
    private javax.swing.JPanel ingresarBtn;
    private javax.swing.JLabel ingresarTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel pesoLabel;
    public static javax.swing.JTextField pesoTxt;
    // End of variables declaration//GEN-END:variables
}