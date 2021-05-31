/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeff.recursive;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author jeff
 */
public class Principal extends javax.swing.JFrame {

    private int numero;
    private int [] arreglo;
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    Operaciones op = new Operaciones();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNumero = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnInvertir = new javax.swing.JButton();
        btnCrearArray = new javax.swing.JButton();
        btnMayorArray = new javax.swing.JButton();
        btnMenorArray = new javax.swing.JButton();
        btnContarPares = new javax.swing.JButton();
        btnContarImpares = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArray = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENÚ PRINCIPAL");

        btnNumero.setText("Ingresar número");
        btnNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroActionPerformed(evt);
            }
        });

        btnSumar.setText("Sumar dígitos");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnInvertir.setText("Invertir números");
        btnInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirActionPerformed(evt);
            }
        });

        btnCrearArray.setText("Crear arreglo (100 números enteros)");
        btnCrearArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArrayActionPerformed(evt);
            }
        });

        btnMayorArray.setText("Número y posición del número mayor");
        btnMayorArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayorArrayActionPerformed(evt);
            }
        });

        btnMenorArray.setText("Número y posición del número menor");
        btnMenorArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorArrayActionPerformed(evt);
            }
        });

        btnContarPares.setText("Contar los números pares");
        btnContarPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarParesActionPerformed(evt);
            }
        });

        btnContarImpares.setText("Contar los números impares");
        btnContarImpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarImparesActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("JeffreyMC");

        txtArray.setColumns(20);
        txtArray.setRows(5);
        jScrollPane1.setViewportView(txtArray);

        jLabel3.setText("Número ingresado");

        txtNumero.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNumero)
                        .addComponent(btnInvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNumero))))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnContarImpares, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnContarPares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnMenorArray))
                                    .addComponent(btnMayorArray, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCrearArray, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)))
                        .addGap(31, 31, 31))))
            .addGroup(layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(btnSalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrearArray)
                            .addComponent(btnNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMayorArray)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenorArray))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnContarPares)
                                .addGap(18, 18, 18)
                                .addComponent(btnContarImpares))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSumar)
                                .addGap(18, 18, 18)
                                .addComponent(btnInvertir)))))
                .addGap(41, 41, 41)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroActionPerformed
         String num = JOptionPane.showInputDialog(null, "Por favor ingrese un número entero", "Ingreso número entero",
                 JOptionPane.QUESTION_MESSAGE);
         try{
            
             if(num == null)
                 throw new NullPointerException();
             
             if(Integer.parseInt(num) < 0)
                 
                 JOptionPane.showMessageDialog(null, "Por favor ingrese solo números positivos. Intente de nuevo"); 
             else{
                  //se pasa el número a operaciones
                 numero = Integer.parseInt(num);
                 txtNumero.setText(num);
             }
                

        }
             
         catch(Exception e)
         {
             if(num != null)
                JOptionPane.showMessageDialog(null, "Por favor ingrese solo números enteros. Intente de nuevo");
         }
    }//GEN-LAST:event_btnNumeroActionPerformed

    private void btnContarParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarParesActionPerformed
        
         if(arreglo == null)
            JOptionPane.showMessageDialog(null, "Cree el arreglo primero", "ERROR"
            , JOptionPane.ERROR_MESSAGE);
        else{
            int contador = op.cuentaPares(arreglo, arreglo.length-1, 0);
            
            JOptionPane.showMessageDialog(null, String.format("La cantidad de números pares es: %d",
                    contador),"Cantidad de números pares", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnContarParesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        Object[] opciones = {"SÍ", "NO"};
        Object defecto = opciones[1];
        
         int opcion = JOptionPane.showOptionDialog(null, "¿Está seguro de que desea salir?", "Advertencia",
                JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE, null, opciones, defecto);
         
         if(opcion == 0)
             this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        
        
        if(numero > 0)
        {
            int result = op.suma(numero);
        
            JOptionPane.showMessageDialog(null, String.format("El resultado es: %d", result), "Resultado de suma"
            , JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "Ingrese un número entero primero", "ERROR"
            , JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirActionPerformed
        if(numero > 0)
        {
            int result = op.invertir(numero, "");
        
            JOptionPane.showMessageDialog(null, String.format("El resultado es: %d", result), "Invertir números"
            , JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "Ingrese un número entero primero", "ERROR"
            , JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnInvertirActionPerformed

    private void btnCrearArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArrayActionPerformed
        Random rd = new Random();
        arreglo = new int[100];
        
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = rd.nextInt(500) + 1;
            
            txtArray.append("Posición " + i + " Valor: " + arreglo[i] + "\n");
        }
        
        JOptionPane.showMessageDialog(null, "Arreglo creado exitosamente", "Creación de arreglo",
            JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnCrearArrayActionPerformed

    private void btnMayorArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayorArrayActionPerformed
        
        if(arreglo == null)
            JOptionPane.showMessageDialog(null, "Cree el arreglo primero", "ERROR"
            , JOptionPane.ERROR_MESSAGE);
        else{
            int mayor = op.mayor(arreglo, arreglo.length-1, 1);
            
            JOptionPane.showMessageDialog(null, String.format("El número mayor es el %d y su posición es la %d",
               arreglo[mayor], mayor), "Número mayor del arreglo"
            , JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnMayorArrayActionPerformed

    private void btnMenorArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenorArrayActionPerformed
        
        if(arreglo == null)
            JOptionPane.showMessageDialog(null, "Cree el arreglo primero", "ERROR"
            , JOptionPane.ERROR_MESSAGE);
        else{
            int menor = op.menor(arreglo, arreglo.length-1, 1);
            
            JOptionPane.showMessageDialog(null, String.format("El número menor es el %d y su posición es la %d",
               arreglo[menor], menor), "Número menor del arreglo"
            , JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnMenorArrayActionPerformed

    private void btnContarImparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarImparesActionPerformed
        
        if(arreglo == null)
            JOptionPane.showMessageDialog(null, "Cree el arreglo primero", "ERROR"
            , JOptionPane.ERROR_MESSAGE);
        else{
            int contador = op.cuentaImpares(arreglo, arreglo.length-1, 0);
            
            JOptionPane.showMessageDialog(null, String.format("La cantidad de números impares es: %d",
                    contador),"Cantidad de números impares", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnContarImparesActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContarImpares;
    private javax.swing.JButton btnContarPares;
    private javax.swing.JButton btnCrearArray;
    private javax.swing.JButton btnInvertir;
    private javax.swing.JButton btnMayorArray;
    private javax.swing.JButton btnMenorArray;
    private javax.swing.JButton btnNumero;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArray;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    private void foreach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
