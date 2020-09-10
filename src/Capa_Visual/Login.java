package Capa_Visual;

import Capa_Logica.Logica;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Login extends javax.swing.JFrame {

    public String ya = "", ya1 = "";
    public String Rnombre;

    public Login() {
        initComponents();
        inicio();
    }

    public void inicio() {
        jPanel0.setVisible(false);
        jPanel4.setVisible(false);
        jPanel3.setVisible(false);
        jPanel5.setVisible(false);
        jPanel2.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel0 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextNombreR = new javax.swing.JTextField();
        JtextClaveR = new javax.swing.JPasswordField();
        JtextClaveR1 = new javax.swing.JPasswordField();
        Guarda = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Secreto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextClave = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextNombre1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextRRecuperacion = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        MostrarUsuario = new javax.swing.JLabel();
        MostrarClave = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel0.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("Registrate");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Nombre de Usuario");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("Contraseña");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Confirmación");

        Guarda.setBackground(new java.awt.Color(255, 255, 255));
        Guarda.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Guarda.setText("Guardar");
        Guarda.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Guarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setText("Pregunta de Recuperación");

        jComboBox1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Color favorito", "Nombre de su Última Mascota", "Comida Favorita", "Palabra al Azar", "Escribir mi Pregunta" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setText("Respuesta");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eye.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eye.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel0Layout = new javax.swing.GroupLayout(jPanel0);
        jPanel0.setLayout(jPanel0Layout);
        jPanel0Layout.setHorizontalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel0Layout.createSequentialGroup()
                                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextNombreR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(JtextClaveR, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JtextClaveR1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel0Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Secreto))
                        .addComponent(Guarda, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel0Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        jPanel0Layout.setVerticalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(JtextClaveR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JtextClaveR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Secreto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(Guarda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        getContentPane().add(jPanel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 500));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reactjs.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(86, 82, 152));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de Usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 147, -1, -1));

        jTextNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jPanel2.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 170, 270, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 247, -1, -1));

        jTextClave.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel2.add(jTextClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 270, 270, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 63, -1, -1));

        jLabel4.setBackground(new java.awt.Color(90, 91, 158));
        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registrate");
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel4MouseMoved(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 336, -1, 17));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Iniciar Sesion");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 334, -1, -1));

        jLabel13.setBackground(new java.awt.Color(86, 255, 255));
        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("¿Olvidaste tu Contraseña?");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 297, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setMaximumSize(new java.awt.Dimension(410, 496));
        jPanel3.setMinimumSize(new java.awt.Dimension(410, 496));
        jPanel3.setPreferredSize(new java.awt.Dimension(410, 496));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Recuperación de la Cuenta");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 57, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nombre de Usuario");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jTextNombre1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombre1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 270, -1));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Buscar");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 227, -1, -1));

        jLabel25.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/left-arrow (1).png"))); // NOI18N
        jLabel25.setText("Atras");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 332, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setMaximumSize(new java.awt.Dimension(410, 496));
        jPanel4.setMinimumSize(new java.awt.Dimension(410, 496));
        jPanel4.setPreferredSize(new java.awt.Dimension(410, 496));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("aqui va la pregunta");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 270, 30));
        jPanel4.add(jTextRRecuperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 280, -1));

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Recuperar");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel27.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Recuperación de la Cuenta");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel28.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/left-arrow (1).png"))); // NOI18N
        jLabel28.setText("Atras");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel28MouseExited(evt);
            }
        });
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 334, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(410, 496));
        jPanel5.setMinimumSize(new java.awt.Dimension(410, 496));
        jPanel5.setPreferredSize(new java.awt.Dimension(410, 496));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel23.setText("Recuperación de la Cuenta");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        MostrarUsuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPanel5.add(MostrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 213, 25));

        MostrarClave.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPanel5.add(MostrarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 213, 25));

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel26.setText("¡Recuperada con Exito!");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 21)); // NOI18N
        jLabel24.setText("Listo");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 216, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 410, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        jLabel24.setForeground(Color.black);
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        jLabel24.setForeground(Color.cyan);
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked

        inicio();
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel3.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        jTextNombre.setVisible(true);
        jTextClave.setVisible(true);

        jLabel22.setVisible(true);
        jLabel27.setVisible(true);
        jLabel28.setVisible(true);
        jLabel20.setVisible(true);
        jTextRRecuperacion.setVisible(true);

        jLabel17.setVisible(true);
        jLabel18.setVisible(true);
        jLabel19.setVisible(true);
        jLabel25.setVisible(true);
        jTextNombre1.setVisible(true);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseExited
        jLabel28.setForeground(Color.WHITE);
        jLabel28.setIcon(new ImageIcon("src\\Imagenes\\left-arrow (1).png"));
    }//GEN-LAST:event_jLabel28MouseExited

    private void jLabel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseEntered
        jLabel28.setForeground(Color.CYAN);
        jLabel28.setIcon(new ImageIcon("src\\Imagenes\\left-arrow (4).png"));
    }//GEN-LAST:event_jLabel28MouseEntered

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        jPanel4.setVisible(false);

        jTextRRecuperacion.setText("");
        jLabel17.setVisible(true);
        jLabel18.setVisible(true);
        jLabel19.setVisible(true);
        jLabel25.setVisible(true);
        jTextNombre1.setVisible(true);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        jLabel22.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        jLabel22.setForeground(Color.CYAN);
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        Logica Lo = new Logica(Rnombre, jTextRRecuperacion.getText());
        String respuesta = Lo.BuscarValidar();
        if (!respuesta.equals("")) {

            String separador[] = respuesta.split(";", 4);
            MostrarUsuario.setText("Usuario:   " + separador[0]);
            MostrarClave.setText("Contraseña:  " + separador[1]);
            jPanel5.setVisible(true);
            jLabel22.setVisible(false);
            jLabel27.setVisible(false);
            jLabel28.setVisible(false);
            jLabel20.setVisible(false);
            jTextRRecuperacion.setVisible(false);
            jTextRRecuperacion.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Respuesta Incorrecta", "Aviso", ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
        jLabel25.setForeground(Color.WHITE);
        jLabel25.setIcon(new ImageIcon("src\\Imagenes\\left-arrow (1).png"));
    }//GEN-LAST:event_jLabel25MouseExited

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        jLabel25.setForeground(Color.CYAN);
        jLabel25.setIcon(new ImageIcon("src\\Imagenes\\left-arrow (4).png"));
    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        jTextNombre1.setText("");
        jPanel3.setVisible(false);

        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jTextNombre.setVisible(true);
        jTextClave.setVisible(true);
        jLabel13.setVisible(true);
        jLabel12.setVisible(true);
        jLabel4.setVisible(true);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        jLabel19.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        jLabel19.setForeground(Color.cyan);
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        Logica Lo = new Logica(jTextNombre1.getText());
        String respuesta = Lo.RBuscar();
        if (!respuesta.equals("")) {
            Rnombre = jTextNombre1.getText();
            String separador[] = respuesta.split(";", 4);
            if (separador[3].equals("0")) {
                jLabel20.setText("¿Color favorito?");
            } else if (separador[3].equals("1")) {
                jLabel20.setText("¿Nombre de su ultima mascota?");
            } else if (separador[3].equals("2")) {
                jLabel20.setText("¿Comida Favorita?");
            } else if (separador[3].equals("3")) {
                jLabel20.setText("¿Palabra al Azar?");
            }
            jPanel4.setVisible(true);
            jLabel17.setVisible(false);
            jLabel18.setVisible(false);
            jLabel19.setVisible(false);
            jLabel25.setVisible(false);
            jTextNombre1.setVisible(false);
            jTextNombre1.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Usuario no existe en la base de Datos", "Aviso", ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jTextNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombre1ActionPerformed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MousePressed

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        if (ya1.equals("")) {
            jLabel16.setIcon(new ImageIcon("src\\Imagenes\\eye.png"));
        } else {
            jLabel16.setIcon(new ImageIcon("src\\Imagenes\\hide.png"));

        }
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        if (ya1.equals("")) {
            jLabel16.setIcon(new ImageIcon("src\\Imagenes\\visibility.png"));
        } else {
            jLabel16.setIcon(new ImageIcon("src\\Imagenes\\visibility (1).png"));

        }
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        if (ya1.equals("")) {
            JtextClaveR1.setEchoChar((char) 0);
            jLabel16.setIcon(new ImageIcon("src\\Imagenes\\hide.png"));
            ya1 = "a";
        } else {
            JtextClaveR1.setEchoChar('*');
            jLabel16.setIcon(new ImageIcon("src\\Imagenes\\eye.png"));
            ya1 = "";
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed

    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        if (ya.equals("")) {
            jLabel15.setIcon(new ImageIcon("src\\Imagenes\\eye.png"));
        } else {
            jLabel15.setIcon(new ImageIcon("src\\Imagenes\\hide.png"));

        }
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered

        if (ya.equals("")) {
            jLabel15.setIcon(new ImageIcon("src\\Imagenes\\visibility.png"));
        } else {
            jLabel15.setIcon(new ImageIcon("src\\Imagenes\\visibility (1).png"));

        }
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        if (ya.equals("")) {
            JtextClaveR.setEchoChar((char) 0);
            jLabel15.setIcon(new ImageIcon("src\\Imagenes\\hide.png"));
            ya = "a";
        } else {
            JtextClaveR.setEchoChar('*');
            jLabel15.setIcon(new ImageIcon("src\\Imagenes\\eye.png"));
            ya = "";
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setIcon(new ImageIcon("src\\Imagenes\\close.png"));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel11.setIcon(new ImageIcon("src\\Imagenes\\close (3).png"));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        jPanel0.setVisible(false);
        jTextNombreR.setText("");
        JtextClaveR.setText("");
        JtextClaveR1.setText("");
        Secreto.setText("");
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void GuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardaActionPerformed
        int Eleccion = jComboBox1.getSelectedIndex();
        if (JtextClaveR.getText().equals(JtextClaveR1.getText())) {
            Logica Log = new Logica(jTextNombreR.getText(), JtextClaveR.getText(), JtextClaveR1.getText(), Eleccion, Secreto.getText());
            String Funciona = Log.RevisarExistencia();
            if (!Funciona.equals("")) {
                String Separado[] = Funciona.split("-");
                if (Separado[0].equals("2")) {
                    jTextNombreR.setText("");
                    JtextClaveR.setText("");
                    JtextClaveR1.setText("");
                    Secreto.setText("");
                    JOptionPane.showMessageDialog(null, Separado[1], "Aviso", INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, Separado[1], "Aviso", ERROR_MESSAGE);

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Aviso", ERROR_MESSAGE);

        }
    }//GEN-LAST:event_GuardaActionPerformed

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jLabel13.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        jLabel13.setForeground(new Color(86, 255, 255));
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setForeground(Color.cyan);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        InterfazGrafica Graf = new InterfazGrafica();
        Logica Lo = new Logica(jTextNombre.getText(), jTextClave.getText());
        String respuesta = Lo.Buscar();
        String separador[] = respuesta.split(";", 4);
        if (separador[0].equals("Fdlnoloadivaras")) {
            Graf.setVisible(true);
            this.setVisible(false);
        } else {

            String Separado[] = respuesta.split("-");
            JOptionPane.showMessageDialog(null, Separado[1], "Aviso", ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setForeground(Color.white);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setForeground(Color.cyan);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jPanel0.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved

    }//GEN-LAST:event_jLabel4MouseMoved

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jPanel3.setVisible(true);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jTextNombre.setVisible(false);
        jTextClave.setVisible(false);
        jLabel13.setVisible(false);
        jLabel12.setVisible(false);
        jLabel4.setVisible(false);

    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guarda;
    private javax.swing.JPasswordField JtextClaveR;
    private javax.swing.JPasswordField JtextClaveR1;
    private javax.swing.JLabel MostrarClave;
    private javax.swing.JLabel MostrarUsuario;
    private javax.swing.JTextField Secreto;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jTextClave;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNombre1;
    private javax.swing.JTextField jTextNombreR;
    private javax.swing.JTextField jTextRRecuperacion;
    // End of variables declaration//GEN-END:variables
}
