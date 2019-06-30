package transmitancja;

import java.awt.Color;
import transmitancja.Sinus;
import transmitancja.Triangle;
import java.awt.Graphics;
import transmitancja.Animacja;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */


public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public Window() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jCheckBoxAnimacja = new javax.swing.JCheckBox();
        a0Param = new javax.swing.JTextField();
        a1Param = new javax.swing.JTextField();
        b0Param = new javax.swing.JTextField();
        b1Param = new javax.swing.JTextField();
        b2Param = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        delay = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        frequency = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("Sinus");
        jRadioButton1.setAutoscrolls(true);
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Trójkąt");
        jRadioButton2.setAutoscrolls(true);
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Prostokąt");
        jRadioButton3.setAutoscrolls(true);
        jRadioButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jButton1.setText("Generuj");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.lightGray));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );

        jCheckBoxAnimacja.setText("Animacja");

        a0Param.setText("1");
        a0Param.setToolTipText("");
        a0Param.setName(""); // NOI18N
        a0Param.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a0ParamActionPerformed(evt);
            }
        });

        a1Param.setText("1");
        a1Param.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ParamActionPerformed(evt);
            }
        });

        b0Param.setText("1");

        b1Param.setText("1");
        b1Param.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ParamActionPerformed(evt);
            }
        });

        b2Param.setText("1");
        b2Param.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ParamActionPerformed(evt);
            }
        });

        jLabel2.setText("a0");

        jLabel3.setText("a1");

        jLabel4.setText("b0");

        jLabel5.setText("b1");

        jLabel6.setText("b2");

        delay.setText("0");

        jLabel7.setText("Opóźnienie");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Pobudzenie");
        jRadioButton4.setAutoscrolls(true);
        jRadioButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton4StateChanged(evt);
            }
        });
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        frequency.setText("1000");

        jLabel8.setText("Częstotliwość");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a1Param, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b0Param, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2Param, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1Param, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a0Param, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(285, 285, 285))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(297, 297, 297))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addGap(33, 33, 33)
                                .addComponent(jCheckBoxAnimacja)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(469, 469, 469))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jRadioButton1, jRadioButton2, jRadioButton3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a0Param, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a1Param, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(b0Param, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b1Param, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(b2Param, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(72, 72, 72)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jCheckBoxAnimacja))
                .addGap(21, 21, 21)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jRadioButton1, jRadioButton2, jRadioButton3});

        jPanel1.setOpaque(true);
        jPanel1.setBackground(Color.white);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    
     
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed

    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged

    }//GEN-LAST:event_jRadioButton1StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //String[] parameters = new String[5];
        Animacja animuj = new Animacja();
        Graphics g = jPanel1.getGraphics();
        g.setColor(Color.white);        //zmiana koloru malowania na biały to zrobienia tła
        g.fillRect(2, 2, jPanel1.getWidth()-2, jPanel1.getHeight()-2);    //"czyszczenie", malowanie tła jak będzie czas to można to zrobic lepiej
        g.setColor(Color.black);        //przywrócenie pędzlowi czarnego koloru
        g.drawLine(20, jPanel1.getHeight()/2, jPanel1.getWidth(), jPanel1.getHeight()/2);  //rysowanie linii poziomej - osi x
        g.drawString("0", 10, jPanel1.getHeight()/2+5);                                    //oraz oznaczenie "0"
       
        try{                                                //
        int temp = jPanel1.getWidth();              //oraz konwertowanie wartości długośći sygnału ze stringa na inta
        Transmitancja transform = new Transmitancja();
        transform.getParameters(a0Param.getText(), 0);
        transform.getParameters(a1Param.getText(), 1);
        transform.getParameters(b0Param.getText(), 2);
        transform.getParameters(b1Param.getText(), 3);
        transform.getParameters(b2Param.getText(), 4);
        double freq = Double.parseDouble(frequency.getText());      //Pobranie częstotliwości
           
            if (jRadioButton1.isSelected()){
                Sinus element = new Sinus(temp);
                element.generateSinus(freq);
                
                element.sinusTransformation(Double.parseDouble(a0Param.getText()), Double.parseDouble(a1Param.getText()),
                            Double.parseDouble(b0Param.getText()), Double.parseDouble(b1Param.getText()), 
                            Double.parseDouble(b2Param.getText()),Integer.parseInt(delay.getText()));
                
                    for (int a=1; a <= temp - 1; a++){
                       // System.out.println(a);
                        int y1, y2;
                        y1 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwa.get(a-1)*(1/element.scaleToBiggest()) );
                        y2 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwa.get(a)*(1/element.scaleToBiggest()) );
                     //   System.out.println(a-1 + " " + ((jPanel1.getHeight()/2) - y1) + " " +  a + " " + ((jPanel1.getHeight()/2) - y2 ));
                        g.drawLine(a-1 + 20, (jPanel1.getHeight()/2) - y1, a + 20, (jPanel1.getHeight()/2) - y2);
                        if(jCheckBoxAnimacja.isSelected())
                        animuj.Animacja();
                    }
                   
                   
                    
                   for (int a=1; a <= temp - 1; a++){
                       // System.out.println(a);
                       g.setColor(Color.BLUE);
                        int y1, y2;
                        y1 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwaT.get(a-1)*(1/element.scaleToBiggest()));
                        y2 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwaT.get(a)*(1/element.scaleToBiggest()) );
                     //   System.out.println(y1 + "     " + y2);
                     //   System.out.println(a-1 + " " + ((jPanel1.getHeight()/2) - y1) + " " +  a + " " + ((jPanel1.getHeight()/2) - y2 ));
                        g.drawLine(a-1 + 20, (jPanel1.getHeight()/2) - y1, a + 20, (jPanel1.getHeight()/2) - y2);
                        if(jCheckBoxAnimacja.isSelected())
                        animuj.Animacja();
                    }
            }
            else if (jRadioButton2.isSelected()){
                       
                        Triangle element = new Triangle(temp);
                        element.generateTriangle(freq); 
                         element.triangleTransformation(Double.parseDouble(a0Param.getText()), Double.parseDouble(a1Param.getText()), 
                                        Double.parseDouble(b0Param.getText()), Double.parseDouble(b1Param.getText()), 
                                        Double.parseDouble(b2Param.getText()), Integer.parseInt(delay.getText()));
                  
                        
                                for (int a=1; a <= temp - 1; a++){
                               // System.out.println(a);
                                int y1, y2;
                                y1 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwa3.get(a-1)*(1/element.scaleToBiggest()) );
                                y2 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwa3.get(a)*(1/element.scaleToBiggest()) );
                                g.drawLine(a-1 + 20, (jPanel1.getHeight()/2) - y1, a + 20, (jPanel1.getHeight()/2) - y2);
                                if(jCheckBoxAnimacja.isSelected())
                                animuj.Animacja();
                    }
                               for (int a=1; a <= temp - 1; a++){
                       g.setColor(Color.BLUE);
                        int y1, y2;
                        y1 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwa3T.get(a-1)*(1/element.scaleToBiggest()) );
                        y2 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwa3T.get(a)*(1/element.scaleToBiggest()) );
                        System.out.println(y1 + "     " + y2);
                         g.drawLine(a-1 + 20, (jPanel1.getHeight()/2) - y1, a + 20, (jPanel1.getHeight()/2) - y2);
                        if(jCheckBoxAnimacja.isSelected())
                        animuj.Animacja();
                    }
                        
                     }
            else if(jRadioButton3.isSelected()){
                       
                        Square element = new Square(temp);
                        element.generateSquare(freq); 
                        element.squareTransformation(Double.parseDouble(a0Param.getText()), Double.parseDouble(a1Param.getText()),
                                        Double.parseDouble(b0Param.getText()), Double.parseDouble(b1Param.getText()),
                                        Double.parseDouble(b2Param.getText()), Integer.parseInt(delay.getText()));
                 
                                for (int a=1; a <= temp - 1; a++){
                                int y1, y2;
                                y1 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwa2.get(a-1)*(1/element.scaleToBiggest())  );
                                y2 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwa2.get(a)*(1/element.scaleToBiggest())  );
                              //  System.out.println(a-1 + " " + ((jPanel1.getHeight()/2) - y1) + " " +  a + " " + ((jPanel1.getHeight()/2) - y2 ));
                                
                                    if ( a == 1 )
                                        g.drawLine(a + 20, jPanel1.getHeight()/2, a + 20, (jPanel1.getHeight()/2) - y2);
                                        if (a%50 == 0)
                                        g.drawLine(a + 20, (jPanel1.getHeight()/2) - y1, a + 20, (jPanel1.getHeight()/2) - y2);  //łączenie dwóch punktów o tej samej współrzędniej x - pionowa kreska przy zmianie stanu
                                        else g.drawLine(a-1 + 20, (jPanel1.getHeight()/2) - y1, a + 20, (jPanel1.getHeight()/2) - y2);
                                    
                                if(jCheckBoxAnimacja.isSelected())
                                animuj.Animacja();
                                }
                                
                                 for (int a=1; a <= temp - 1; a++){

                       g.setColor(Color.BLUE);
                        int y1, y2;
                        y1 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwaT2.get(a-1)*(1/element.scaleToBiggest())  );
                        y2 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwaT2.get(a)*(1/element.scaleToBiggest())  );
                        System.out.println(y1 + "     " + y2);
                        g.drawLine(a-1 + 20, (jPanel1.getHeight()/2) - y1, a + 20, (jPanel1.getHeight()/2) - y2);
                        if(jCheckBoxAnimacja.isSelected())
                        animuj.Animacja();
                    }
                    }
            else{
                
                Pobudzenie element = new Pobudzenie(temp);
                element.generatePobudzenie();
                        element.pobudzenieTransformation(Double.parseDouble(a0Param.getText()), Double.parseDouble(a1Param.getText()),
                                        Double.parseDouble(b0Param.getText()), Double.parseDouble(b1Param.getText()),
                                        Double.parseDouble(b2Param.getText()), Integer.parseInt(delay.getText()));
                 
                                for (int a=1; a <= temp - 1; a++){
                                int y1, y2;
                                y1 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwa.get(a-1)*(1/element.scaleToBiggest())  );
                                y2 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwa.get(a)*(1/element.scaleToBiggest())  );
                              //  System.out.println(a-1 + " " + ((jPanel1.getHeight()/2) - y1) + " " +  a + " " + ((jPanel1.getHeight()/2) - y2 ));
                                
                                    if ( a == 1 )
                                        g.drawLine(a + 20, jPanel1.getHeight()/2, a + 20, (jPanel1.getHeight()/2) - y2);
                                        if (a%50 == 0)
                                        g.drawLine(a + 20, (jPanel1.getHeight()/2) - y1, a + 20, (jPanel1.getHeight()/2) - y2);  //łączenie dwóch punktów o tej samej współrzędniej x - pionowa kreska przy zmianie stanu
                                        else g.drawLine(a-1 + 20, (jPanel1.getHeight()/2) - y1, a + 20, (jPanel1.getHeight()/2) - y2);
                                    
                                if(jCheckBoxAnimacja.isSelected())
                                animuj.Animacja();
                                }
                                
                                 for (int a=1; a <= temp - 1; a++){

                       g.setColor(Color.BLUE);
                        int y1, y2;
                        y1 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwaT.get(a-1)*(1/element.scaleToBiggest())  );
                        y2 = (int) Math.round( 0.45 * jPanel1.getHeight() * element.jakasNazwaT.get(a)*(1/element.scaleToBiggest())  );
                        System.out.println(y1 + "     " + y2);
                        g.drawLine(a-1 + 20, (jPanel1.getHeight()/2) - y1, a + 20, (jPanel1.getHeight()/2) - y2);
                        if(jCheckBoxAnimacja.isSelected())
                        animuj.Animacja();
                    }
                
            }
        }
     catch(Exception e){
         System.out.println("Wpisałeś: - to nie liczba całkowita");
     }       
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void b2ParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ParamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ParamActionPerformed

    private void a0ParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a0ParamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a0ParamActionPerformed

    private void a1ParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ParamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a1ParamActionPerformed

    private void b1ParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ParamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ParamActionPerformed

    private void jRadioButton4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton4StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4StateChanged

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {     
                new Window().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a0Param;
    private javax.swing.JTextField a1Param;
    private javax.swing.JTextField b0Param;
    private javax.swing.JTextField b1Param;
    private javax.swing.JTextField b2Param;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField delay;
    private javax.swing.JTextField frequency;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxAnimacja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private static volatile javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}