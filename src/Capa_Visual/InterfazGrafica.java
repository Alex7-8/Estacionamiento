package Capa_Visual;

import Capa_Logica.Logica;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.control.Spinner;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class InterfazGrafica extends javax.swing.JFrame {

    String FECHA, Tarifa, Calificación;
    int Año;

    public InterfazGrafica() {
        initComponents();
        fecha();
        numerofactura();

    }

    public void fecha() {

        Calendar fecha = new GregorianCalendar();

        int AÑO = fecha.get(Calendar.YEAR);

        int MES = fecha.get(Calendar.MONTH);

        int DIA = fecha.get(Calendar.DAY_OF_MONTH);

        int HORA = fecha.get(Calendar.HOUR);

        int Minuto = fecha.get(Calendar.MINUTE);

        FECHA = (Minuto + "-" + HORA + "-" + DIA + "-" + (MES + 1) + "-" + AÑO);
        jLabelMes.setText(String.valueOf(MES + 1));
        jLabelDia.setText(String.valueOf(DIA));
        jLabelAño.setText(String.valueOf(AÑO));

    }

    public void numerofactura() {
        try {

            File Carpeta = new File("C:\\COMERCIAL");
            if (!Carpeta.exists()) {
                Carpeta.mkdirs();
            }
            File Carpeta2 = new File("C:\\COMERCIAL\\Tickets");
            if (!Carpeta2.exists()) {
                Carpeta2.mkdirs();
            }
            long Lineas = 0;
            FileWriter flwriter = new FileWriter("C:\\COMERCIAL\\Tickets\\No.de.Tickets", true);
            File Reader = new File("C:\\COMERCIAL\\Tickets\\No.de.Tickets");
            FileReader Regis = new FileReader(Reader);
            BufferedReader Total = new BufferedReader(Regis);
            String caden;
            while ((caden = Total.readLine()) != null) {
                Lineas++;
            }
            Total.close();
            flwriter.close();
            jLabelticket.setText(String.valueOf(Lineas + 1));

        } catch (IOException ex) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNOMBRE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAPELLIDO = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JComboBox<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtDPI = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        etiVehiculo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabelMes = new javax.swing.JLabel();
        jLabelDia = new javax.swing.JLabel();
        jLabelAño = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtplaca = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelticket = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Modelo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Cbtn = new javax.swing.JCheckBox();
        Cbtn1 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDOS  A GRAN CENTRO COMERCIAL");

        jToggleButton1.setText("Oscuro");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addComponent(jToggleButton1)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jToggleButton1))
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setText("MES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 13, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel3.setText("DIA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 13, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("AÑO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("NO. DE TICKET");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("NOMBRE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtNOMBRE.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtNOMBRE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 150, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("APELLIDO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        txtAPELLIDO.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtAPELLIDO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtAPELLIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 121, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Marca");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtMarca.setBackground(new java.awt.Color(255, 51, 0));
        txtMarca.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "HONDA", "TOYOTA", "FORD", "KIA", "HYUNDAI", "MITSUBISHI" }));
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));
        jPanel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(961, 333, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("MODELO");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 0, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 99, 1213, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setText("Placa");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, -1, -1));

        txtDPI.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtDPI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtDPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 121, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("DESCRIPCIÓN DE VEHICULO");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        etiVehiculo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        etiVehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(etiVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 145, -1));

        btnAgregar.setBackground(new java.awt.Color(255, 204, 204));
        btnAgregar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(204, 255, 204));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        jLabelMes.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabelMes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabelMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 13, 90, 19));

        jLabelDia.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabelDia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 13, 87, 19));

        jLabelAño.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabelAño.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabelAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 13, 97, 22));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel16.setText("DPI");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        txtplaca.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jPanel2.add(txtplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 58, 130, -1));

        jComboBox1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P0", "M0", "C0" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 58, -1, 30));

        jLabelticket.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jPanel2.add(jLabelticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 170, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("AÑO");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setText("Dulce Carias");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setText("Grupo #2");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel18.setText("Heily Alvarez");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 160, -1, -1));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel19.setText("Vidal Arriola");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, -1, -1));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel20.setText("Jeferson Orellana");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, -1, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel21.setText("Brayan Ruiz");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 250, -1, -1));

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel22.setText("Bryant Hernandez ");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 280, -1, -1));

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel23.setText("Dennis Morales");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 310, -1, -1));

        jSlider1.setMajorTickSpacing(5);
        jSlider1.setMaximum(2020);
        jSlider1.setMinimum(1980);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jPanel2.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 320, -1));

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 190, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 170, 100));

        jPanel2.add(Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 160, -1));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("QUE LE PARECE NUESTRO CENTRO COMERCIAL:");

        buttonGroup1.add(Cbtn);
        Cbtn.setText("EXCELENTE");
        Cbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(Cbtn1);
        Cbtn1.setText("MALO");
        Cbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cbtn1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("INGRESE TARIFA DE PAGO");

        jPanel6.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("Normal Q.10.00");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("VIP Q.20.00");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(Cbtn)
                        .addGap(65, 65, 65)
                        .addComponent(Cbtn1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(32, 32, 32)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Cbtn)
                                    .addComponent(Cbtn1)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes");

        jMenuItem1.setText("No. de Vehiculos en el dia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("No. de Vehiculos dentro del Parqueo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("No. de Ingresos por fecha");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salida De Vehiculo");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Buscar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        String mensaje = " La marca del carro es :";
        String i = (String) txtMarca.getSelectedItem();
        mensaje = mensaje + txtMarca.getSelectedItem().toString();
        Modelo.removeAllItems();
        if (i.equals("HONDA")) {
            Modelo.addItem("SELECCIONAR");
            Modelo.addItem("CIVIC");
            Modelo.addItem("ACCORD");
            Modelo.addItem("CR-V");
        } else if (i.equals("TOYOTA")) {
            Modelo.addItem("SELECCIONAR");
            Modelo.addItem("RAV-4");
            Modelo.addItem("YARIS");
            Modelo.addItem("COROLLA");
        } else if (i.equals("FORD")) {
            Modelo.addItem("SELECCIONAR");
            Modelo.addItem("FOCUS");
            Modelo.addItem("MONDEO");
            Modelo.addItem("FIESTA");

        } else if (i.equals("KIA")) {
            Modelo.addItem("SELECCIONAR");
            Modelo.addItem("RIO");
            Modelo.addItem("STONIC");
            Modelo.addItem("KUGA");
        } else if (i.equals("HYUNDAI")) {
            Modelo.addItem("SELECCIONAR");
            Modelo.addItem("TUCSON");
            Modelo.addItem("KONA");
            Modelo.addItem("GENESIS");
        } else if (i.equals("MITSUBISHI")) {
            Modelo.addItem("SELECCIONAR");
            Modelo.addItem("MIRAGE");
            Modelo.addItem("ECLIPSE");
            Modelo.addItem("LANCER");

        }
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        jTextArea1.setText("" + etiVehiculo.getText());
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fecha();
     try {
        Logica Log = new Logica(FECHA, txtNOMBRE.getText(), txtAPELLIDO.getText(), txtDPI.getText(), jComboBox1.getSelectedItem().toString(), txtplaca.getText(),
                txtMarca.getSelectedItem().toString(), Modelo.getSelectedItem().toString(), Año, jTextArea1.getText(), Tarifa, Calificación);
        String Retorno = Log.CGuardar();
        
        JOptionPane.showMessageDialog(null, "Guardado Correctamente", "Aviso", INFORMATION_MESSAGE);
        }catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Por favor llene los campos", "Aviso", ERROR_MESSAGE);
        }
    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        Año = jSlider1.getValue();
        jLabel24.setText("" + Año);
    }//GEN-LAST:event_jSlider1StateChanged

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jToggleButton1.isSelected()) {
            jPanel1.setBackground(Color.cyan);
            jPanel2.setBackground(Color.BLUE);
            jToggleButton1.setText("Claro");
        }
        if (!jToggleButton1.isSelected()) {
            jPanel1.setBackground(new Color(102, 102, 102));
            jPanel2.setBackground(new Color(153, 255, 255));
            jToggleButton1.setText("Oscuro");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            Tarifa = "Normal";
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton2.isSelected()) {
            Tarifa = "VIP";
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void CbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbtnActionPerformed
        if (Cbtn.isSelected()) {
            Calificación = "Excelente";
        }
    }//GEN-LAST:event_CbtnActionPerformed

    private void Cbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cbtn1ActionPerformed
        if (Cbtn1.isSelected()) {
            Calificación = "Mala";
        }
    }//GEN-LAST:event_Cbtn1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       Pago Pago = new Pago();
        Pago.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       JOptionPane.showMessageDialog(null, "En desarrollo", "Aviso", INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(null, "En desarrollo", "Aviso", INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         JOptionPane.showMessageDialog(null, "En desarrollo", "Aviso", INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazGrafica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Cbtn;
    private javax.swing.JCheckBox Cbtn1;
    private javax.swing.JComboBox<String> Modelo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField etiVehiculo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAño;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JLabel jLabelticket;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtAPELLIDO;
    private javax.swing.JTextField txtDPI;
    private javax.swing.JComboBox<String> txtMarca;
    private javax.swing.JTextField txtNOMBRE;
    private javax.swing.JTextField txtplaca;
    // End of variables declaration//GEN-END:variables

}
