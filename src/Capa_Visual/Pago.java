/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Visual;

import Capa_Logica.Logica;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Leonardo
 */
public class Pago extends javax.swing.JFrame {

    public int AÑO, MES, DIA, HORA, MINUTO;
    public String FFecha;

    public Pago() {
        initComponents();
        desaparecer();
    }

    public void desaparecer() {
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jLabel11.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jButton2.setVisible(false);
        
           Fecha.setVisible(false);
            Hora.setVisible(false);
            NombreC.setVisible(false);
            DPI.setVisible(false);
            Placa.setVisible(false);
            Año.setVisible(false);
            Marca.setVisible(false);;
            Modelo.setVisible(false);
            Descripcion.setVisible(false);
            Tarifa.setVisible(false);
            
             barra.setVisible(false);
    }

    public void fecha() {

        Calendar fecha = new GregorianCalendar();

        AÑO = fecha.get(Calendar.YEAR);
        String Año = String.valueOf(AÑO);

        MES = 1 + fecha.get(Calendar.MONTH);
        String Mes = String.valueOf(MES);
        DIA = fecha.get(Calendar.DAY_OF_MONTH);
        String Dia = String.valueOf(DIA);
        HORA = fecha.get(Calendar.HOUR);

        MINUTO = fecha.get(Calendar.MINUTE);
        FFecha = Dia + "-" + Mes + "-" + Año;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        NombreC = new javax.swing.JLabel();
        DPI = new javax.swing.JLabel();
        Placa = new javax.swing.JLabel();
        Año = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        Marca = new javax.swing.JLabel();
        Modelo = new javax.swing.JLabel();
        Descripcion = new javax.swing.JLabel();
        Tarifa = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        barra = new javax.swing.JProgressBar();
        porcentaje = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(473, 511));
        setMinimumSize(new java.awt.Dimension(473, 511));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 33, -1, -1));

        Fecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 100, 20));

        Hora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 100, 20));

        NombreC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 100, 20));

        DPI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(DPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 100, 20));

        Placa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 100, 20));

        Año.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 100, 20));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 23, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 24, 129, -1));

        Marca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 100, 20));

        Modelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 100, 20));

        Descripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 100, 20));

        Tarifa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Tarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 100, 20));

        jLabel11.setText("Marca:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 242, -1, -1));

        jLabel13.setText("Modelo:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 274, -1, -1));

        jLabel14.setText("Fecha:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 64, -1, -1));

        jLabel15.setText("Descripción");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 338, -1, -1));

        jLabel16.setText("Hora:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 89, -1, -1));

        jLabel17.setText("Nombre:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 121, -1, -1));

        jLabel18.setText("Tarifa de Pago:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 306, -1, -1));

        jLabel19.setText("DPI:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 153, -1, -1));

        jLabel20.setText("Placa");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 185, -1, -1));

        jLabel21.setText("Año:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 217, -1, -1));

        jLabel2.setText("Total a Pagar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 100, 20));

        jButton2.setText("Cancelado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

        barra.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                barraAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 210, -1));
        getContentPane().add(porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 50, 20));

        jLabel4.setText("Ingrese DPI");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Logica Log = new Logica("");
        Log.BDPI = jTextField1.getText();
        String Retorno = Log.BBuscar();
        if (!Retorno.equals("")) {
            String[] Separa = Retorno.split(";", 12);
            String[] Fecha = Separa[0].split("-", 5);

            this.Fecha.setText(Fecha[2] + "/" + Fecha[3] + "/" + Fecha[4]);
            Hora.setText(Fecha[1] + ":" + Fecha[0]);
            NombreC.setText(Separa[1] + " " + Separa[2]);
            DPI.setText(Separa[3]);
            Placa.setText(Separa[4] + " " + Separa[5]);
            Año.setText(Separa[6]);
            Marca.setText(Separa[7]);
            Modelo.setText(Separa[8]);
            Descripcion.setText(Separa[9]);
            Tarifa.setText(Separa[10]);
            //Calculo de Pago
            fecha();
            Double Total = 0.0, horam, HoraActual;
            Double Horah;
            Double Hora = Double.parseDouble(Fecha[1]);
            Double Minuto = Double.parseDouble(Fecha[0]);
            Horah = Minuto + (Hora * 60);
            horam = Horah / 60;
            Double HORA = Double.valueOf(this.HORA);
            Double MINUTO = Double.valueOf(this.MINUTO);
            HoraActual = ((HORA * 60) + MINUTO) / 60;
            Double HoraCalculo = HoraActual - horam;
//            if (Fecha[2].equals("" + DIA)) {

            if (Separa[10].equals("VIP")) {
                Total = HoraCalculo * 20;
            } else if (Separa[10].equals("Normal")) {
                Total = HoraCalculo * 10;

//                }
//            } else {
//                Double Dia = Double.valueOf(DIA);
//                Double DiaEntro = Double.valueOf(Fecha[2]);
//                Double Dias = Dia - DiaEntro;
//                Double Tiempo = 24 * Dias;
//                Double Tiempolisto = Tiempo + HoraCalculo;
//                if (D) {
//                    
//                }
//                if (Separa[10].equals("VIP")) {
//                    Total = Tiempolisto * 20;
//                }
//                else if(Separa[10].equals("Normal")) {
//                    Total = Tiempolisto * 10;
//                }
            }
            jLabel3.setText("" + Total);
            verlabel();
        } else {
            Fecha.setText("");
            Hora.setText("");
            NombreC.setText("");
            DPI.setText("");
            Placa.setText("");
            Año.setText("");
            Marca.setText("");
            Modelo.setText("");
            Descripcion.setText("");
            Tarifa.setText("");
            desaparecer();
            JOptionPane.showMessageDialog(null, "No Existe en la base de Datos", "Aviso", ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Barra();
        fecha();
        Logica Lo = new Logica(FFecha, Fecha.getText(), Hora.getText(), NombreC.getText(), DPI.getText(), Placa.getText(), Año.getText(), Marca.getText(),
                Modelo.getText(), Tarifa.getText(), Descripcion.getText(), jLabel3.getText());
        String Respuesta = Lo.PGuardar();
        if (!Respuesta.equals("")) {
            JOptionPane.showMessageDialog(null, "Pago Guardado Correctamente", "Aviso", INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "Hubo un Error al intentar Guardar", "Aviso", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void barraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_barraAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_barraAncestorAdded

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
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Año;
    private javax.swing.JLabel DPI;
    private javax.swing.JLabel Descripcion;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Modelo;
    private javax.swing.JLabel NombreC;
    private javax.swing.JLabel Placa;
    private javax.swing.JLabel Tarifa;
    public javax.swing.JProgressBar barra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel porcentaje;
    // End of variables declaration//GEN-END:variables

    private void verlabel() {
        jLabel13.setVisible(true);
        jLabel14.setVisible(true);
        jLabel15.setVisible(true);
        jLabel16.setVisible(true);
        jLabel17.setVisible(true);
        jLabel18.setVisible(true);
        jLabel19.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel11.setVisible(true);
        
jLabel13.setVisible(true);
        jLabel14.setVisible(true);
        jLabel15.setVisible(true);
        jLabel16.setVisible(true);
        jLabel17.setVisible(true);
        jLabel18.setVisible(true);
        jLabel19.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel11.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jButton2.setVisible(true);
        
           Fecha.setVisible(true);
            Hora.setVisible(true);
            NombreC.setVisible(true);
            DPI.setVisible(true);
            Placa.setVisible(true);
            Año.setVisible(true);
            Marca.setVisible(true);
            Modelo.setVisible(true);
            Descripcion.setVisible(true);
            Tarifa.setVisible(true);
            barra.setVisible(true);

    }

    private void Barra() {
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(10);
                porcentaje.setText(Integer.toString(i) + "%");
                barra.setValue(i);

                if (i == 100) {
                    porcentaje.setVisible(false);
                }
            }
        } catch (Exception e) {
        }
    }

}
