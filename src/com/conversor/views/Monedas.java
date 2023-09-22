
package com.conversor.views;

import javax.swing.JOptionPane;

public class Monedas extends javax.swing.JPanel {
    //Valor de las divisas apartir del Euro.
    double Ars_Peso = 299.86;
    double Brl_Real = 5.23;
    double Usd_Dollar = 1.10;
    double Eur_Euro = 1;
    double Gbp_Libras = 0.86;
    double Jpy_Yen = 156.54;
    double Krw_Won = 1416.15;
    
    
    public Monedas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        monedaOrigen = new javax.swing.JComboBox<>();
        monedaDestino = new javax.swing.JComboBox<>();
        lblResultado = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(528, 368));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Cantidad");

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("=");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Moneda origen");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Moneda destino");

        monedaOrigen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        monedaOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opciones...", "ARS - Peso Argentino", "BRL - Real", "USD - Dólar", "EUR - Euros", "GBP - Libras Esterlinas", "JPY - Yen Japonés", "KRW - Won Surcoreano" }));

        monedaDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        monedaDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opciones...", "ARS - Peso Argentino", "BRL - Real", "USD - Dólar", "EUR - Euros", "GBP - Libras Esterlinas", "JPY - Yen Japonés", "KRW - Won Surcoreano" }));

        lblResultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnConvertir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setMaximumSize(new java.awt.Dimension(95, 29));
        btnReset.setMinimumSize(new java.awt.Dimension(95, 29));
        btnReset.setPreferredSize(new java.awt.Dimension(95, 29));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 29, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(151, 151, 151))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(monedaOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnConvertir))
                                        .addGap(90, 90, 90)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monedaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(monedaOrigen)
                    .addComponent(monedaDestino))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvertir)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        
        
        try{
            //Se tratan 4 tipos de errores
            //1: Si no se ingreso texto
            //2: Si en algun ComboBox no fue seleccionada alguna opción
            //3: Si el valor ingresado no es un numero
            //4: Si el valor ingresado es negativo
            if(monedaOrigen.getSelectedIndex() == 0 || monedaDestino.getSelectedIndex() == 0 || 
                    txtCantidad.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,
                        "Debe seleccionar ambas opciones e ingresar una cantidad",
                        "Error",
                        JOptionPane.INFORMATION_MESSAGE
                        );
                return;
            }
            double valorIngresado = Double.parseDouble(txtCantidad.getText());
            if (valorIngresado <= 0){
                JOptionPane.showMessageDialog(null,
                        "El valor ingresado no puede ser negativo",
                        "Error",
                        JOptionPane.INFORMATION_MESSAGE
                        );
                return;
            }
            
            conversionMonedas(valorIngresado);
            
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this,
                    "Ingrese un Número válido",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                    );
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        monedaOrigen.setSelectedIndex(0);
        monedaDestino.setSelectedIndex(0);
        txtCantidad.setText(null);
        lblResultado.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JComboBox<String> monedaDestino;
    private javax.swing.JComboBox<String> monedaOrigen;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables

    private void conversionMonedas(double valorIngresado){
        
        double cantidadConvertida = 0.0;
        double cantidadDeCambio = 0.0;
        
        cantidadConvertida = switch (monedaOrigen.getSelectedItem().toString()) {
            case "ARS - Peso Argentino" -> valorIngresado / Ars_Peso;
            case "BRL - Real" -> valorIngresado / Brl_Real;
            case "USD - Dólar" -> valorIngresado /  Usd_Dollar;
            case "EUR - Euros" -> valorIngresado /  Eur_Euro;
            case "GBP - Libras Esterlinas" -> valorIngresado /  Gbp_Libras;
            case "JPY - Yen Japonés" -> valorIngresado /  Jpy_Yen;
            case "KRW - Won Surcoreano" -> valorIngresado /  Krw_Won;
            default -> 0.0;
        };

        cantidadDeCambio = switch (monedaDestino.getSelectedItem().toString()) {
            case "ARS - Peso Argentino" -> cantidadConvertida * Ars_Peso;
            case "BRL - Real" -> cantidadConvertida * Brl_Real;
            case "USD - Dólar" -> cantidadConvertida * Usd_Dollar;
            case "EUR - Euros" -> cantidadConvertida * Eur_Euro;
            case "GBP - Libras Esterlinas" -> cantidadConvertida * Gbp_Libras;
            case "JPY - Yen Japonés" -> cantidadConvertida * Jpy_Yen;
            case "KRW - Won Surcoreano" -> cantidadConvertida * Krw_Won;
            default -> cantidadConvertida * 0.0;
        };
        
        String value = String.format("%.2f", cantidadDeCambio);
        
        lblResultado.setText(value);
        
    }
}
