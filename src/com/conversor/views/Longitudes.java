package com.conversor.views;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Longitudes extends javax.swing.JPanel {
    String[] unidades = {
        " ",
        "Km",
        "m",
        "cm",
        "mm",
        "mi",
        "yd",
        "ft",
        "in"
    };
    //Distacias tomadas en base a 1 metro
    double Km = 0.001;
    double m = 1;
    double cm = 100;
    double mm = 1000;
    double mi = 0.0006;
    double yd = 1.0936;
    double ft = 3.2808;
    double in = 39.3701; 
     
    
    public Longitudes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxEntrada = new javax.swing.JComboBox<>();
        cbxSalida = new javax.swing.JComboBox<>();
        lblResultado = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(528, 368));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(90, 90));
        jPanel1.setMinimumSize(new java.awt.Dimension(90, 90));
        jPanel1.setPreferredSize(new java.awt.Dimension(90, 90));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Cantidad");

        txtLongitud.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLongitudActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("=");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tipo de entrada");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tipo de salida");

        cbxEntrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opciones....", "Km - Kilometro", "m - Metro", "cm - Centimetro", "mm - Milimetro", "mi - Millas", "yd - Yardas", "ft - Pies", "in - Pulgadas" }));

        cbxSalida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opciones....", "Km - Kilometro", "m - Metro", "cm - Centimetro", "mm - Milimetro", "mi - Millas", "yd - Yardas", "ft - Pies", "in - Pulgadas" }));
        cbxSalida.setPreferredSize(new java.awt.Dimension(183, 26));

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnConvertir)
                                .addComponent(cbxEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cbxSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvertir)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLongitudActionPerformed
        
    }//GEN-LAST:event_txtLongitudActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        cbxEntrada.setSelectedIndex(0);
        cbxSalida.setSelectedIndex(0);
        txtLongitud.setText(null);
        lblResultado.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
               
        try{
            //Se tratan 3 tipos de errores
            //1: Si no se ingreso texto
            //2: Si en algun ComboBox no fue seleccionada alguna opción
            //3: Si el valor ingresado no es un numero
            if(cbxEntrada.getSelectedIndex() == 0 || cbxSalida.getSelectedIndex() == 0 || 
                        txtLongitud.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,
                        "Debe seleccionar ambas opciones e ingresar una cantidad",
                        "Error",
                        JOptionPane.INFORMATION_MESSAGE
                        );
                return;
            }
            
            double valorIngresado = Double.parseDouble(txtLongitud.getText());
            if (valorIngresado <= 0){
                JOptionPane.showMessageDialog(null,
                        "El valor ingresado no puede ser negativo",
                        "Error",
                        JOptionPane.INFORMATION_MESSAGE
                        );
                return;
            }
            convertirLongitud(valorIngresado);
            
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this,
                    "Ingrese un Número válido",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                    
                    );
        }            
    }//GEN-LAST:event_btnConvertirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbxEntrada;
    private javax.swing.JComboBox<String> cbxSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtLongitud;
    // End of variables declaration//GEN-END:variables

    private void convertirLongitud(double longitudIngresada) {

        double longitudConvertida = 0.0;
        double longitudAConvertir = 0.0;
         
        longitudConvertida = switch (cbxEntrada.getSelectedItem().toString()) {
            case "Km - Kilometro" -> longitudIngresada / Km;
            case "m - Metro" -> longitudIngresada / m;
            case "cm - Centimetro" -> longitudIngresada / cm;
            case "mm - Milimetro" -> longitudIngresada / mm;
            case "mi - Millas" -> longitudIngresada / mi;
            case "yd - Yardas" -> longitudIngresada / yd;
            case "ft - Pies" -> longitudIngresada / ft;
            case "in - Pulgadas" -> longitudIngresada / in;
                
            default -> 0.0;
        };
         
        longitudAConvertir = switch(cbxSalida.getSelectedItem().toString()){
            case "Km - Kilometro" -> longitudConvertida * Km;
            case "m - Metro" -> longitudConvertida * m;
            case "cm - Centimetro" -> longitudConvertida * cm;
            case "mm - Milimetro" -> longitudConvertida * mm;
            case "mi - Millas" -> longitudConvertida * mi;
            case "yd - Yardas" -> longitudConvertida * yd;
            case "ft - Pies" -> longitudConvertida * ft;
            case "in - Pulgadas" -> longitudConvertida * in;
                
            default -> longitudConvertida * 0.0;
        };
        
        numerosDecimales(longitudAConvertir);
    }
     
    
    private void numerosDecimales(double longitud){
        String value;
        int posicion = cbxSalida.getSelectedIndex();
        
        // Si la longitud a convertir supera los 4 digitos, mostrar con notación cientifica
        if (Math.abs(longitud) < 0.0001 || Math.abs(longitud) > 10000) {
            DecimalFormat scientificFormat = new DecimalFormat("0.####E0");
            value = scientificFormat.format(longitud);
        } else {
            
            // Si la longitud a convertir tiene menos de 4 decimales, mostrar sin decimales
            if (Math.abs(longitud - Math.floor(longitud)) < 0.0001) {
                DecimalFormat noDecimalFormat = new DecimalFormat("0");
                value = noDecimalFormat.format(longitud);
            } else {
                
                // Si la longitud a convertir tiene más de 4 decimales, mostrar con 4 decimales
                DecimalFormat decimalFormat = new DecimalFormat("#.####");
                value = decimalFormat.format(longitud);
            }
        }
        
        
        lblResultado.setText(value + " " +  unidades[posicion]);

    }
    
}

