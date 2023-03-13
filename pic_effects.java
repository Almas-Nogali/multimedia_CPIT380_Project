/*

 */
package Final_380_project;

import cpit380practice.FileChooser;
import cpit380practice.Picture;
import cpit380practice.Pixel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;
import javax.swing.ImageIcon;

/**
 *
 * @author almas
 */
public class pic_effects extends javax.swing.JFrame {

    Picture pic1 = new Picture();
    Picture pic3 = new Picture();
    Picture pic2 ;
    int x1, y1, x2, y2;

    public pic_effects() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jSlider3 = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jSlider4 = new javax.swing.JSlider();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSlider5 = new javax.swing.JSlider();
        jSlider6 = new javax.swing.JSlider();
        jLabel16 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        blind = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(172, 210, 204));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\almas\\OneDrive\\سطح المكتب\\CPIT 380_LAB\\IN LAB\\lab3\\cpit380practice\\src\\Untitled.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Browse Image1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Output Image");

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Input Image1");

        jButton3.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 153));
        jButton5.setText("Grayscale");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 153, 153));
        jButton6.setText("Negative");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 153, 153));
        jButton7.setText("Lightning");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 153, 153));
        jButton8.setText("Darkening");
        jButton8.setPreferredSize(new java.awt.Dimension(140, 50));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 153, 153));
        jButton9.setText("Binary");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Start X:");

        jLabel6.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Start Y:");

        jLabel9.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("End Y:");

        jLabel7.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("End X:");

        jLabel20.setFont(new java.awt.Font("MV Boli", 1, 60)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Effects");

        jTextField1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 153, 153));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 153, 153));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 153, 153));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 153, 153));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jSlider1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMaximum(255);
        jSlider1.setMinimum(10);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jSlider2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jSlider2.setMajorTickSpacing(10);
        jSlider2.setMaximum(255);
        jSlider2.setMinimum(10);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setToolTipText("");
        jSlider2.setValue(0);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        jSlider3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jSlider3.setMajorTickSpacing(10);
        jSlider3.setMaximum(255);
        jSlider3.setMinimum(10);
        jSlider3.setPaintLabels(true);
        jSlider3.setPaintTicks(true);
        jSlider3.setValue(0);
        jSlider3.setAlignmentX(5.0F);
        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("RED:");

        jLabel10.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("GREEN:");

        jLabel11.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("BLUE:");

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 153, 153));
        jButton10.setText("Blending");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 102, 102));
        jButton11.setText("Browse Image2");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Input Image2");

        jButton12.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 153, 153));
        jButton12.setText("Vertical Reflection");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 153, 153));
        jButton13.setText("horizontal Reflection");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jSlider4.setMajorTickSpacing(90);
        jSlider4.setMaximum(360);
        jSlider4.setMinimum(-360);
        jSlider4.setPaintLabels(true);
        jSlider4.setPaintTicks(true);
        jSlider4.setSnapToTicks(true);
        jSlider4.setValue(0);
        jSlider4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider4StateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Right Rotation:");

        jLabel15.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Left Rotation:");

        jSlider5.setMajorTickSpacing(90);
        jSlider5.setMaximum(360);
        jSlider5.setMinimum(-360);
        jSlider5.setPaintLabels(true);
        jSlider5.setPaintTicks(true);
        jSlider5.setSnapToTicks(true);
        jSlider5.setValue(0);
        jSlider5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider5StateChanged(evt);
            }
        });

        jSlider6.setMajorTickSpacing(2);
        jSlider6.setMaximum(10);
        jSlider6.setMinimum(-10);
        jSlider6.setPaintLabels(true);
        jSlider6.setPaintTicks(true);
        jSlider6.setValue(0);
        jSlider6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider6StateChanged(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Scaling:");

        jButton14.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 153, 153));
        jButton14.setText("Hestogram");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 153, 153));
        jButton15.setText("Median");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 102, 102));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton16.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 153, 153));
        jButton16.setText("Laplacian");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 153, 153));
        jButton19.setText("Sunset");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton20.setForeground(new java.awt.Color(0, 153, 153));
        jButton20.setText("Max");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setText("Averaging");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 153, 153));
        jButton17.setText("Copy and crop");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 153, 153));
        jButton18.setText("Constract");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel17.setText("Histogram informations:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(blind)))
                                    .addComponent(jLabel17)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider5, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider4, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSlider6, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(727, 727, 727))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSlider6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSlider4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(207, 207, 207)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(182, 182, 182)
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11)))
                                    .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(blind))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Main c = null;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (c == null) {
            c = new Main();
        }
        c.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String file = FileChooser.pickAFile();
        pic1 = new Picture(file);
        jLabel1.setIcon(new ImageIcon(pic1.getImage()));

        
        pic2 = new Picture(pic1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //GRAYSCALE
        pic2.grayscale();
        jLabel2.setIcon(new ImageIcon(pic2.getImage()));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // CLEAR
        pic2 = new Picture(pic1);
        
        jLabel2.setIcon(new ImageIcon(pic2.getImage()));
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //NEGATIVE
        pic2.negate();
        jLabel2.setIcon(new ImageIcon(pic2.getImage()));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //LIGHTNING
        pic2.lighten();
        jLabel2.setIcon(new ImageIcon(pic2.getImage()));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //DARKENING
        pic2.darken();
        jLabel2.setIcon(new ImageIcon(pic2.getImage()));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //thresholding
        
        int n = Integer.valueOf(jTextField5.getText()).intValue();

        Pixel pix = null;
        
        for (int i = 0; i < pic1.getWidth(); i++) {
            for (int j = 0; j < pic1.getHeight(); j++) {

                pix = pic2.getPixel(i, j);

                if (pix.getAverage() >= n) {
                    pic2.getPixel(i, j).setColor(Color.WHITE);
                } else {
                    pic2.getPixel(i, j).setColor(Color.BLACK);
                }
            }
        }
        jLabel2.setIcon(new ImageIcon(pic2.getImage()));
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        //change red
        int red = jSlider1.getValue();
        
        Pixel[] pix = pic2.getPixels();
        for (int i = 0; i < pix.length; i++) {
            pix[i].setRed(red);
        }
        jLabel2.setIcon(new ImageIcon(pic2.getImage()));

    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        //change green
        int green = jSlider2.getValue();
        Pixel[] pix = pic2.getPixels();
        for (int i = 0; i < pix.length; i++) {
            pix[i].setGreen(green);
        }
        jLabel2.setIcon(new ImageIcon(pic2.getImage()));
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged
        //change blue
        int blue = jSlider3.getValue();
        Pixel[] pix = pic2.getPixels();
        for (int i = 0; i < pix.length; i++) {
            pix[i].setBlue(blue);
        }
        jLabel2.setIcon(new ImageIcon(pic2.getImage()));
    }//GEN-LAST:event_jSlider3StateChanged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        x1 = evt.getX();
        y1 = evt.getY();
        jTextField1.setText(Integer.toString(y1));
        jTextField2.setText(Integer.toString(x1));
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        x2 = evt.getX();
        y2 = evt.getY();
        jTextField3.setText(Integer.toString(x2));
        jTextField4.setText(Integer.toString(y2));
    }//GEN-LAST:event_jLabel1MouseReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //blending
        double blindVal = Double.parseDouble(blind.getText());
        blindVal = blindVal/100;
        jLabel2.setIcon(new ImageIcon(((pic2.blendPictures(pic3, blindVal)).getImage())));
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        //read picture2
        String file = FileChooser.pickAFile();
        pic3 = new Picture(file);
        jLabel12.setIcon(new ImageIcon(pic3.getImage()));
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        //vertical reflict
        jLabel2.setIcon(new ImageIcon((pic2.mirrorAllVertical()).getImage()));
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        //horizontal reclict
        jLabel2.setIcon(new ImageIcon((pic2.mirrorAllHorizontal()).getImage()));
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jSlider4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider4StateChanged
        //right rotation
        if (jSlider4.getValue() == 0 || jSlider4.getValue() == 360 || jSlider4.getValue() == -360) {
            jLabel2.setIcon(new ImageIcon(pic2.getImage()));
            pic2 = new Picture(pic1);
        } else if (jSlider4.getValue() == 90) {
            jLabel2.setIcon(new ImageIcon((pic2.rotateRight()).getImage()));
            pic2 = new Picture(pic1);
        } else if (jSlider4.getValue() == 180) {
            jLabel2.setIcon(new ImageIcon(pic2.rotateRight().rotateRight().getImage()));
            pic2 = new Picture(pic1);
        } else if (jSlider4.getValue() == 270) {
            jLabel2.setIcon(new ImageIcon(pic2.rotateRight().rotateRight().rotateRight().getImage()));
            pic2 = new Picture(pic1);
        } else if (jSlider4.getValue() == -90) {
            jLabel2.setIcon(new ImageIcon((pic2.rotateLeft()).getImage()));
            pic2 = new Picture(pic1);
        } else if (jSlider4.getValue() == -180) {
            jLabel2.setIcon(new ImageIcon((pic2.rotateLeft().rotateLeft()).getImage()));
            pic2 = new Picture(pic1);
        } else if (jSlider4.getValue() == -270) {
            jLabel2.setIcon(new ImageIcon((pic2.rotateLeft().rotateLeft().rotateLeft()).getImage()));
            pic2 = new Picture(pic1);
        }


    }//GEN-LAST:event_jSlider4StateChanged

    private void jSlider5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider5StateChanged
        //left rotaton
        if (jSlider5.getValue() == 0 || jSlider5.getValue() == 360 || jSlider5.getValue() == -360) {
            jLabel2.setIcon(new ImageIcon(pic2.getImage()));
            pic2 = new Picture(pic1);
        } else if (jSlider5.getValue() == -90) {
            jLabel2.setIcon(new ImageIcon((pic2.rotateRight()).getImage()));
            pic2 = new Picture(pic1);
        } else if (jSlider5.getValue() == -180) {
            jLabel2.setIcon(new ImageIcon(pic2.rotateRight().rotateRight().getImage()));
            pic2 = new Picture(pic1);
        } else if (jSlider5.getValue() == -270) {
            jLabel2.setIcon(new ImageIcon(pic2.rotateRight().rotateRight().rotateRight().getImage()));
            pic2 = new Picture(pic1);
        } else if (jSlider5.getValue() == 90) {
            jLabel2.setIcon(new ImageIcon((pic2.rotateLeft()).getImage()));
            pic2 = new Picture(pic1);
        } else if (jSlider5.getValue() == 180) {
            jLabel2.setIcon(new ImageIcon((pic2.rotateLeft().rotateLeft()).getImage()));
            pic2 = new Picture(pic1);
        } else if (jSlider5.getValue() == 270) {
            jLabel2.setIcon(new ImageIcon((pic2.rotateLeft().rotateLeft().rotateLeft()).getImage()));
            pic2 = new Picture(pic1);
        }


    }//GEN-LAST:event_jSlider5StateChanged

    private void jSlider6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider6StateChanged
        //scaleing up and down
        if (jSlider6.getValue() == 0) {
            jLabel2.setIcon(new ImageIcon(pic2.getImage()));
            pic2 = new Picture(pic1);
            
        } else if (jSlider6.getValue() < 0) {

            int n = (jSlider6.getValue()) * -1;
            jLabel2.setIcon(new ImageIcon((pic2.scaleDown(n)).getImage()));
            pic2 = new Picture(pic1);

        } else if (jSlider6.getValue() > 0) {
            jLabel2.setIcon(new ImageIcon((pic2.scaleUp(jSlider6.getValue())).getImage()));
            pic2 = new Picture(pic1);
        }

    }//GEN-LAST:event_jSlider6StateChanged

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        //histogram
        int[] Rhis = new int[256];
        int[] Ghis = new int[256];
        int[] Bhis = new int[256];

        
        for (int i = 0; i < pic2.getWidth(); i++) {
            for (int j = 0; j < pic2.getHeight(); j++) {
                for (int h = 0; h < 256; h++) {
                    //Red
                    if (pic2.getPixel(i, j).getRed() == h) {
                        Rhis[h]++;
                    }

                    //green
                    if (pic2.getPixel(i, j).getGreen() == h) {
                        Ghis[h]++;
                    }

                    //blue
                    if (pic2.getPixel(i, j).getBlue() == h) {
                        Bhis[h]++;
                    }

                }
            }
        }

        
        System.out.println(Arrays.toString(Rhis));
        System.out.println(Arrays.toString(Ghis));
        System.out.println(Arrays.toString(Bhis));

        boolean retval = Arrays.equals(Rhis, Ghis);
        boolean retval2 = Arrays.equals(Bhis, Ghis);
        boolean retval3 = Arrays.equals(Bhis, Rhis);

        
        if (retval == false || retval2 == false || retval3 == false) {

            int maxR = Rhis[0];
            for (int j = 1; j < Rhis.length; j++) {
                if (Rhis[j] > maxR) {
                    maxR = Rhis[j];
                }
            }
            int maxG = Ghis[0];
            for (int j = 1; j < Ghis.length; j++) {
                if (Ghis[j] > maxG) {
                    maxG = Ghis[j];
                }
            }
            int maxB = Bhis[0];
            for (int j = 1; j < Bhis.length; j++) {
                if (Bhis[j] > maxB) {
                    maxB = Bhis[j];
                }
            }

            
            int numR = maxR / 400;
            
            Picture PR = new Picture(500, 600);
            int x = 122, y = 500;
            Graphics g = PR.getGraphics();
            g.setColor(Color.red);
            for (int i = 0; i <= 255; i++) {
                g.drawLine(x, y, x, y - (Rhis[i] / numR));
                x += 1;
            }
            PR.show();

            int numG = maxG / 400;
            Picture PG = new Picture(500, 600);
            int x1 = 122, y1 = 500;
            Graphics gG = PG.getGraphics();
            gG.setColor(Color.green);
            for (int i = 0; i <= 255; i++) {
                gG.drawLine(x1, y1, x1, y1 - (Ghis[i] / numG));
                x1 += 1;
            }
            PG.show();

            int numB = maxR / 400;
            Picture PB = new Picture(500, 600);
            int x2 = 122, y2 = 500;
            Graphics gB = PB.getGraphics();
            gB.setColor(Color.blue);

            for (int i = 0; i <= 255; i++) {
                gB.drawLine(x2, y2, x2, y2 - (Bhis[i] / numB));
                x2 += 1;
            }
            PB.show();

             jTextArea1.setText("Green max value :" + maxG + " \n" +Arrays.toString(Ghis) + " \n" +
             "Blue max value :" + maxB + " \n" +Arrays.toString(Bhis) + " \n"+
                     "Red max value :" + maxR + " \n" +Arrays.toString(Rhis) + " \n"
             );
             
        } else {

            int maxGr = Rhis[0];
            for (int j = 1; j < Rhis.length; j++) {
                if (Rhis[j] > maxGr) {
                    maxGr = Rhis[j];
                }
            }

            int numGr = maxGr / 600;
            Picture PGr = new Picture(500, 600);
            int x = 122, y = 500;
            Graphics gGr = PGr.getGraphics();
            gGr.setColor(Color.gray);
            for (int i = 0; i <= 255; i++) {
                gGr.drawLine(x, y, x, y - (Rhis[i] / numGr));
                x += 1;
            }
            PGr.show();

            jTextArea1.setText("Green max value : " + maxGr + " \n" +Arrays.toString(Ghis) + " \n");
            
        }
        
        
        
       
        
        


    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        //median
        int[] pixel = new int[9];//16
        //pic2 = new Picture(pic1);
        for (int i = 1; i < pic1.getWidth() - 1; i++) {
            for (int j = 1; j < pic1.getHeight() - 1; j++) {

                pixel[0] = (int) pic1.getPixel(i - 1, j - 1).getAverage();
                pixel[1] = (int) pic1.getPixel(i - 1, j + 1).getAverage();
                pixel[2] = (int) pic1.getPixel(i - 1, j).getAverage();

                pixel[3] = (int) pic1.getPixel(i + 1, j - 1).getAverage();
                pixel[4] = (int) pic1.getPixel(i + 1, j + 1).getAverage();
                pixel[5] = (int) pic1.getPixel(i + 1, j).getAverage();

                pixel[6] = (int) pic1.getPixel(i, j - 1).getAverage();
                pixel[7] = (int) pic1.getPixel(i, j + 1).getAverage();
                pixel[8] = (int) pic1.getPixel(i, j).getAverage();

                Arrays.sort(pixel);

                pic2.getPixel(i, j).setColor(new Color(pixel[4], pixel[4], pixel[4]));
            }
        }
        jLabel2.setIcon(new ImageIcon(pic2.getImage()));
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        //Lablacian
        
        int result1;
        int[] p = new int[9];
        for (int i = 1; i < pic1.getWidth() - 1; i++) {
            for (int j = 1; j < pic1.getHeight() - 1; j++) {
                
                
                //   0     1    0
                //   0     -2   0
                //   0     1    0
                
                

                // Task 1
                p[0] = (int) pic1.getPixel(i - 1, j - 1).getBlue() * 0;
                p[1] = (int) pic1.getPixel(i, j - 1).getBlue() * 1;
                p[2] = (int) pic1.getPixel(i + 1, j - 1).getBlue() * 0;
                p[3] = (int) pic1.getPixel(i - 1, j).getBlue() * 1;
                p[4] = (int) pic1.getPixel(i, j).getBlue() * (-4);
                p[5] = (int) pic1.getPixel(i + 1, j).getBlue() * 1;
                p[6] = (int) pic1.getPixel(i - 1, j + 1).getBlue() * 0;
                p[7] = (int) pic1.getPixel(i, j + 1).getBlue() * 1;
                p[8] = (int) pic1.getPixel(i + 1, j + 1).getBlue() * 0;

                result1 = p[0] + p[1] + p[2] + p[3] + p[4] + p[5] + p[6] + p[7] + p[8];

                if (result1 < 0) {
                    result1 = 0;
                } else if (result1 > 255) {
                    result1 = 255;
                }
                pic2.getPixel(i, j).setColor(new Color(result1, result1, result1));
            }
        }

        jLabel2.setIcon(new ImageIcon(pic2.getImage()));

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        //sunset
        pic2.makeSunset();
        jLabel2.setIcon(new ImageIcon(pic2.getImage()));
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        //Max
        int[] pixelR = new int[9];
        int[] pixelG = new int[9];
        int[] pixelB = new int[9];

        for (int i = 1; i < pic1.getWidth() - 1; i++) {
            for (int j = 1; j < pic1.getHeight() - 1; j++) {

                pixelR[0] = (int) pic1.getPixel(i - 1, j - 1).getRed();
                pixelR[1] = (int) pic1.getPixel(i - 1, j + 1).getRed();
                pixelR[2] = (int) pic1.getPixel(i - 1, j).getRed();

                pixelR[3] = (int) pic1.getPixel(i + 1, j - 1).getRed();
                pixelR[4] = (int) pic1.getPixel(i + 1, j + 1).getRed();
                pixelR[5] = (int) pic1.getPixel(i + 1, j).getRed();

                pixelR[6] = (int) pic1.getPixel(i, j - 1).getRed();
                pixelR[7] = (int) pic1.getPixel(i, j + 1).getRed();
                pixelR[8] = (int) pic1.getPixel(i, j).getRed();

                Arrays.sort(pixelR);

                pixelG[0] = (int) pic1.getPixel(i - 1, j - 1).getGreen();
                pixelG[1] = (int) pic1.getPixel(i - 1, j + 1).getGreen();
                pixelG[2] = (int) pic1.getPixel(i - 1, j).getGreen();

                pixelG[3] = (int) pic1.getPixel(i + 1, j - 1).getGreen();
                pixelG[4] = (int) pic1.getPixel(i + 1, j + 1).getGreen();
                pixelG[5] = (int) pic1.getPixel(i + 1, j).getGreen();

                pixelG[6] = (int) pic1.getPixel(i, j - 1).getGreen();
                pixelG[7] = (int) pic1.getPixel(i, j + 1).getGreen();
                pixelG[8] = (int) pic1.getPixel(i, j).getGreen();

                Arrays.sort(pixelG);

                pixelB[0] = (int) pic1.getPixel(i - 1, j - 1).getBlue();
                pixelB[1] = (int) pic1.getPixel(i - 1, j + 1).getBlue();
                pixelB[2] = (int) pic1.getPixel(i - 1, j).getBlue();

                pixelB[3] = (int) pic1.getPixel(i + 1, j - 1).getBlue();
                pixelB[4] = (int) pic1.getPixel(i + 1, j + 1).getBlue();
                pixelB[5] = (int) pic1.getPixel(i + 1, j).getBlue();

                pixelB[6] = (int) pic1.getPixel(i, j - 1).getBlue();
                pixelB[7] = (int) pic1.getPixel(i, j + 1).getBlue();
                pixelB[8] = (int) pic1.getPixel(i, j).getBlue();

                Arrays.sort(pixelB);

                pic2.getPixel(i, j).setColor(new Color(pixelR[8], pixelG[8], pixelB[8]));

            }
        }
        jLabel2.setIcon(new ImageIcon(pic2.getImage()));

    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Averaging
        for (int i = 1; i < pic1.getWidth() - 1; i++) {
            for (int j = 1; j < pic1.getHeight() - 1; j++) {

                int red = 0;
                int green = 0;
                int blue = 0;

                red =     ((1) * pic1.getPixel(i - 1, j - 1).getRed())
                        + ((1) * pic1.getPixel(i, j - 1).getRed())
                        + ((1) * pic1.getPixel(i + 1, j - 1).getRed())
                        + ((1) * pic1.getPixel(i - 1, j).getRed())
                        + ((-8) * pic1.getPixel(i, j).getRed())
                        + ((1) * pic1.getPixel(i + 1, j).getRed())
                        + ((1) * pic1.getPixel(i - 1, j + 1).getRed())
                        + ((1) * pic1.getPixel(i, j + 1).getRed())
                        + ((1) * pic1.getPixel(i + 1, j + 1).getRed());

                red = red / 9;
                
                if (red < 0) {
                    red = 0;
                } else if (red > 255) {
                    red = 255;
                }

                green = ((1) * pic1.getPixel(i - 1, j - 1).getGreen())
                        + ((1) * pic1.getPixel(i, j - 1).getGreen())
                        + ((1) * pic1.getPixel(i + 1, j - 1).getGreen())
                        + ((1) * pic1.getPixel(i - 1, j).getGreen())
                        + ((-8) * pic1.getPixel(i, j).getGreen())
                        + ((1) * pic1.getPixel(i + 1, j).getGreen())
                        + ((1) * pic1.getPixel(i - 1, j + 1).getGreen())
                        + ((1) * pic1.getPixel(i, j + 1).getGreen())
                        + ((1) * pic1.getPixel(i + 1, j + 1).getGreen());

                green = green / 9;

                if (green < 0) {
                    green = 0;
                } else if (green > 255) {
                    green = 255;
                }

                blue = ((1) * pic1.getPixel(i - 1, j - 1).getBlue())
                        + ((1) * pic1.getPixel(i, j - 1).getBlue())
                        + ((1) * pic1.getPixel(i + 1, j - 1).getBlue())
                        + ((1) * pic1.getPixel(i - 1, j).getBlue())
                        + ((-8) * pic1.getPixel(i, j).getBlue())
                        + ((1) * pic1.getPixel(i + 1, j).getBlue())
                        + ((1) * pic1.getPixel(i - 1, j + 1).getBlue())
                        + ((1) * pic1.getPixel(i, j + 1).getBlue())
                        + ((1) * pic1.getPixel(i + 1, j + 1).getBlue());

                blue = blue / 9;

                if (blue < 0) {
                    blue = 0;
                } else if (blue > 255) {
                    blue = 255;
                }

                pic2.getPixel(i, j).setColor(new Color(red, green, blue));

            }
        }

        jLabel2.setIcon(new ImageIcon(pic2.getImage()));


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        //Copy and Crop

        double W = (pic1.getWidth() * 1.00 / jLabel1.getWidth());
        double H = (pic1.getHeight() * 1.00 / jLabel1.getHeight());

        x1 = (int) (W * x1);
        x2 = (int) (W * x2);
        y1 = (int) (H * y1);
        y2 = (int) (H * y2);

        Picture newPic = new Picture(pic1.getWidth(), pic1.getHeight());
        
        Pixel sourcePixel = null;
        Pixel targetPixel = null;

        for (int x = x1, tx = x1; x < x2 && x < pic1.getWidth() && tx < pic1.getWidth(); x++, tx++) {
            
            for (int y = y1, ty = y1; y < y2 && y < pic1.getHeight() && ty < pic1.getHeight(); y++, ty++) {

                sourcePixel = pic1.getPixel(x, y);
                targetPixel = newPic.getPixel(tx, ty);
                targetPixel.setColor(sourcePixel.getColor());
            }
        }

        pic2 = newPic;
        jLabel2.setIcon(new ImageIcon(pic2.getImage()));

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        //Constract
        //con=max-min/max+min
        
         Pixel[] pixels = pic1.getPixels();

            int Contrast;
            
            double max_val = 0;
            double min_val = pixels[0].getAverage();

            for (int i = 0; i < pixels.length; i++) {

            
                Contrast = (int) ((pixels[i].getRed() + pixels[i].getGreen() + pixels[i].getBlue()) / 3);
                
                if (Contrast > max_val) {
                    max_val = Contrast;
                }
                if (Contrast < min_val) {
                    min_val = Contrast;
                }
            } 
            
            double contrast = ((max_val - min_val) / (max_val + min_val));
            
            jTextField6.setText(String.valueOf(contrast));
            
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(pic_effects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pic_effects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pic_effects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pic_effects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pic_effects().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField blind;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JSlider jSlider4;
    private javax.swing.JSlider jSlider5;
    private javax.swing.JSlider jSlider6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
