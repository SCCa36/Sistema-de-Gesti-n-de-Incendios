package Ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class SistemaExperto extends javax.swing.JFrame {
    private static final long serialVersionUID = -5145297402931070502L;
    int opción, opción1, aviso, aviso1;
    String mensaje;
    ImageIcon fondo;
    Icon icono_fondo;
    public SistemaExperto() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/bandera_de_Galicia.png")).getImage());
        fondo = new ImageIcon(getClass().getResource("/Imágenes/playa_de_Las_Catedrales.jpg"));
        icono_fondo = new ImageIcon(fondo.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(icono_fondo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPanelTítulo = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        jpPanelDiagnóstico = new javax.swing.JPanel();
        lblIndicaciones = new javax.swing.JLabel();
        btnIniciarDiagnóstico = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaDiagnóstico = new javax.swing.JTextArea();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPanelTítulo.setBackground(new java.awt.Color(0, 153, 153));
        jpPanelTítulo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));

        lblTítulo.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("SISTEMA DE GESTIÓN DE INCENDIOS - SISTEMA DE DIAGNÓSTICO");

        javax.swing.GroupLayout jpPanelTítuloLayout = new javax.swing.GroupLayout(jpPanelTítulo);
        jpPanelTítulo.setLayout(jpPanelTítuloLayout);
        jpPanelTítuloLayout.setHorizontalGroup(
            jpPanelTítuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelTítuloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTítulo, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpPanelTítuloLayout.setVerticalGroup(
            jpPanelTítuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelTítuloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTítulo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jpPanelTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jpPanelDiagnóstico.setBackground(new java.awt.Color(0, 153, 153));
        jpPanelDiagnóstico.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));

        lblIndicaciones.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        lblIndicaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblIndicaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndicaciones.setText("Para iniciar el diagnóstico pinche en el botón \"Iniciar Diagnóstico\".");

        btnIniciarDiagnóstico.setBackground(new java.awt.Color(0, 204, 204));
        btnIniciarDiagnóstico.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        btnIniciarDiagnóstico.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarDiagnóstico.setText("Iniciar Diagnóstico");
        btnIniciarDiagnóstico.setBorder(null);
        btnIniciarDiagnóstico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarDiagnósticoActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtareaDiagnóstico.setColumns(20);
        txtareaDiagnóstico.setRows(5);
        jScrollPane1.setViewportView(txtareaDiagnóstico);

        javax.swing.GroupLayout jpPanelDiagnósticoLayout = new javax.swing.GroupLayout(jpPanelDiagnóstico);
        jpPanelDiagnóstico.setLayout(jpPanelDiagnósticoLayout);
        jpPanelDiagnósticoLayout.setHorizontalGroup(
            jpPanelDiagnósticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelDiagnósticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPanelDiagnósticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpPanelDiagnósticoLayout.createSequentialGroup()
                        .addComponent(btnIniciarDiagnóstico, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jpPanelDiagnósticoLayout.setVerticalGroup(
            jpPanelDiagnósticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelDiagnósticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPanelDiagnósticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jpPanelDiagnósticoLayout.createSequentialGroup()
                        .addComponent(lblIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpPanelDiagnósticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIniciarDiagnóstico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))))
                .addContainerGap())
        );

        getContentPane().add(jpPanelDiagnóstico, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 186, 831, -1));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIniciarDiagnósticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarDiagnósticoActionPerformed
        opción = JOptionPane.showConfirmDialog(rootPane, "¿Se sabe cuáles han podido ser las causas del incendio?", null, JOptionPane.YES_NO_OPTION);
        if (opción == 0) {
            menúCausasIncendio();
        }
        else if (opción == 1) {
            opción1 = JOptionPane.showConfirmDialog(rootPane, "¿Se tienen sospechas de cuáles pueden ser las causas del incendio?", null, JOptionPane.YES_NO_OPTION);
            if (opción1 == 0) {
                menúPosiblesCausasIncendio();
            }
            else if (opción1 == 1) {
                JOptionPane.showMessageDialog(rootPane, "No existen indicios suficientes para determinar la causa del incendio.", null, JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnIniciarDiagnósticoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIniciarDiagnóstico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpPanelDiagnóstico;
    private javax.swing.JPanel jpPanelTítulo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIndicaciones;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JTextArea txtareaDiagnóstico;
    // End of variables declaration//GEN-END:variables

    private void menúCausasIncendio() {
        opción = 0;
        String opción_escogida = JOptionPane.showInputDialog(rootPane, "Por favor, indique cuál de las siguientes causas es la que ha provocado el incendio:\n1. Actividad volcánica.\n2. Actividad sísmica.\n3. Caída de algún rayo en la zona durante una tormenta eléctrica.\n4. Sobrecarga eléctrica.\n5. Caída de un cable de alta tensión.\n6. Actividad cinegética.\n7. Fallo o avería en maquinaria agrícola o forestal.\n8. Fallo o avería en vehículos militares o particulares.\n9. Accidente ferroviario.\n10. Accidente de avión.\n11. Accidente de globo aerostático.\n12. Fuegos artificiales.\n13. Pirómano.\n14. Vandalismo.\n15. Intereses económicos.");
        opción = Integer.parseInt(opción_escogida);
        switch(opción) {
            case 1:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue natural.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 2:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue natural.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 3:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue natural.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 4:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 5:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 6:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue intencionado.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 7:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 8:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 9:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 10:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 11:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 12:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 13:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue intencionado.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 14:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue intencionado.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 15:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue intencionado.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "Opción incorrecta.", null, JOptionPane.ERROR);
                break;
        }
    }
    private void menúPosiblesCausasIncendio() {
        opción = 0;
        String opción_escogida = JOptionPane.showInputDialog(rootPane, "Por favor, indique cuál de las siguientes causas es la que se sospecha que ha provocado el incendio:\n1. Actividad volcánica.\n2. Actividad sísmica.\n3. Caída de algún rayo en la zona durante una tormenta eléctrica.\n4. Sobrecarga eléctrica.\n5. Caída de un cable de alta tensión.\n6. Actividad cinegética.\n7. Fallo o avería en maquinaria agrícola o forestal.\n8. Fallo o avería en vehículos militares o particulares.\n9. Accidente ferroviario.\n10. Accidente de avión.\n11. Accidente de globo aerostático.\n12. Fuegos artificiales.\n13. Pirómano.\n14. Vandalismo.\n15. Intereses económicos.");
        opción = Integer.parseInt(opción_escogida);
        switch(opción) {
            case 1:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue natural.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 2:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue natural.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 3:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue natural.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 4:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 5:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 6:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue intencionado.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 7:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 8:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 9:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 10:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 11:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 12:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue accidental.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 13:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue intencionado.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 14:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue intencionado.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            case 15:
                mensaje = "-------------------------------\n" + "SISTEMA EXPERTO DE DIAGNÓSTICO DE INCENDIOS\n" + "--------------------------------------\n" + "Diagnóstico:\n\n" + "El incendio fue intencionado.\n" + "----------------------------------------\n";
                txtareaDiagnóstico.setText(mensaje);
                aviso = JOptionPane.showConfirmDialog(rootPane, "¿Desea enviar un aviso?", null, JOptionPane.YES_NO_OPTION);
                if (aviso == 0) {
                    enviarAviso();
                }
                else if (aviso == 1) {
                    this.dispose();
                }
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "Opción incorrecta.", null, JOptionPane.ERROR);
                break;
        }
    }
    private void enviarAviso() {
        opción = 0;
        String opción_escogida = JOptionPane.showInputDialog(rootPane, "Indique qué método de aviso es el que desea utilizar:\n1. Enviar un SMS.\n2. Enviar un email.");
        opción = Integer.parseInt(opción_escogida);
        switch(opción) {
            case 1:
                LoginSMS login_SMS = new LoginSMS();
                login_SMS.setLocationRelativeTo(null);
                login_SMS.setVisible(true);
                break;
            case 2:
                LoginEmail login_Email = new LoginEmail();
                login_Email.setLocationRelativeTo(null);
                login_Email.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "Sólo puede escoger entre enviar un SMS o enviar un email.", null, JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
        }
    }
}