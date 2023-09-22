package com.conversor.views;

public class Temperaturas extends javax.swing.JPanel {
    
    double valor = 1;
    String de = "°C - Celsius", a = "°C - Celsius";
    double temperatura = 0.0;
    
    
    public Temperaturas() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        sldGrados = new javax.swing.JSlider();
        lblValor = new javax.swing.JLabel();
        cbxDe = new javax.swing.JComboBox<>();
        cbxA = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(528, 368));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Valor");

        sldGrados.setMinimum(1);
        sldGrados.setPaintLabels(true);
        sldGrados.setPaintTicks(true);
        sldGrados.setToolTipText("");
        sldGrados.setValue(1);
        sldGrados.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldGradosStateChanged(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor.setText("1");
        lblValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbxDe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°C - Celsius", "°F - Fahrenheit", "K - Kelvin", " " }));
        cbxDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDeActionPerformed(evt);
            }
        });

        cbxA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°C - Celsius", "°F - Fahrenheit", "K - Kelvin", " " }));
        cbxA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("De:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("A:");

        lblResultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(sldGrados, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(411, 411, 411))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cbxDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sldGrados, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxDe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbxA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sldGradosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldGradosStateChanged
        valor = sldGrados.getValue();
        lblValor.setText(""+valor);
        convertirTemperatura();
    }//GEN-LAST:event_sldGradosStateChanged

    private void cbxDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDeActionPerformed
        de = cbxDe.getSelectedItem().toString();
        convertirTemperatura();
        
    }//GEN-LAST:event_cbxDeActionPerformed

    private void cbxAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAActionPerformed
        a = cbxA.getSelectedItem().toString();
        convertirTemperatura();
    }//GEN-LAST:event_cbxAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxA;
    private javax.swing.JComboBox<String> cbxDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblValor;
    private javax.swing.JSlider sldGrados;
    // End of variables declaration//GEN-END:variables

    public double redondear(double temp){
        return Math.round(temp*100.0)/100.0;
    }
    private void convertirTemperatura() {
        switch(de){
            case "°C - Celsius" -> {
                temperatura = switch (a) {
                case "°F - Fahrenheit" -> ((9*valor)/5)+32;
                case "K - Kelvin" -> valor + 273.15;
                default -> valor;
            };
            }
            case "°F - Fahrenheit" -> {
                temperatura = switch (a) {
                case "°C - Celsius" -> (5*(valor-32))/9;
                case "K - Kelvin" -> ((5*(valor-32))/9)+273.15;
                default -> valor;
            };
            }
            case "K - Kelvin" -> {
                temperatura = switch (a) {
                case "°F - Fahrenheit" -> ((9*(valor-273.15))/5)+32;
                case "°C - Celsius" -> valor - 273.15;
                default -> valor;
            };
            }  
        }
        
        lblResultado.setText(valor +" "+ de +" -> "+ redondear(temperatura) +" "+ a.substring(0, 2));
    }
}
