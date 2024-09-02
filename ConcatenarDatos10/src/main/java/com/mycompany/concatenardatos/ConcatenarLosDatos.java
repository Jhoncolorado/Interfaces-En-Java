package com.mycompany.concatenardatos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConcatenarLosDatos extends JFrame {
    private JTextField txtPalabra1;
    private JTextField txtPalabra2;
    private JLabel etiTexto;
    private JButton btnConcatena;

    public ConcatenarLosDatos() {
        setTitle("Concatenar Datos");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        
        txtPalabra1 = new JTextField();
        txtPalabra2 = new JTextField();

        
        etiTexto = new JLabel("Resultado:");

        
        btnConcatena = new JButton("Concatena");

      
        txtPalabra1.setBounds(50, 30, 150, 30);
        txtPalabra2.setBounds(50, 70, 150, 30);
        btnConcatena.setBounds(220, 50, 120, 30);
        etiTexto.setBounds(50, 110, 300, 30);

        
        add(txtPalabra1);
        add(txtPalabra2);
        add(btnConcatena);
        add(etiTexto);

        
        btnConcatena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String palabra1 = txtPalabra1.getText();
                String palabra2 = txtPalabra2.getText();

                
                String resultado = palabra1 + palabra2;
                etiTexto.setText("Resultado: " + resultado);
            }
        });
    }

    public static void main(String[] args) {
        
        ConcatenarLosDatos ventana = new ConcatenarLosDatos();
        ventana.setVisible(true);
    }
}