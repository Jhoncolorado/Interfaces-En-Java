package com.mycompany.desactivarcomponentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosDeTeclado extends JFrame {
    private JTextField txtNombre;
    private JTextField txtCiudad;
    private JLabel txtFrase;
    private JButton btnAceptar;
    private JButton btnDesactivar;
    private JButton btnActivar;

    public EventosDeTeclado() {
        setTitle("Desactivar Componentes");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

     
        txtNombre = new JTextField();
        txtCiudad = new JTextField();
        txtFrase = new JLabel("");
        btnAceptar = new JButton("Aceptar");
        btnDesactivar = new JButton("Desactivar");
        btnActivar = new JButton("Activar");

        
        txtNombre.setBounds(50, 30, 250, 25);
        txtCiudad.setBounds(50, 70, 250, 25);
        txtFrase.setBounds(50, 110, 300, 25);
        btnAceptar.setBounds(50, 150, 100, 30);
        btnDesactivar.setBounds(160, 150, 100, 30);
        btnActivar.setBounds(270, 150, 100, 30);


        Font font = new Font("SansSerif", Font.PLAIN, 14);
        txtNombre.setFont(font);
        txtCiudad.setFont(font);
        txtFrase.setFont(font);
        btnAceptar.setFont(font);
        btnDesactivar.setFont(font);
        btnActivar.setFont(font);

        txtFrase.setForeground(new Color(70, 130, 180)); 
        btnAceptar.setBackground(new Color(255, 255, 255)); 
        btnAceptar.setForeground(new Color(70, 130, 180)); 

        btnDesactivar.setBackground(new Color(255, 255, 255)); 
        btnDesactivar.setForeground(new Color(70, 130, 180)); 

        btnActivar.setBackground(new Color(255, 255, 255));
        btnActivar.setForeground(new Color(70, 130, 180)); 

        
        add(txtNombre);
        add(txtCiudad);
        add(txtFrase);
        add(btnAceptar);
        add(btnDesactivar);
        add(btnActivar);

        
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String ciudad = txtCiudad.getText();
                txtFrase.setText("Usted se llama " + nombre + " y vive en " + ciudad + ".");
            }
        });

      
        btnDesactivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setEnabled(false);
                txtCiudad.setEnabled(false);
            }
        });

        
        btnActivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setEnabled(true);
                txtCiudad.setEnabled(true);
            }
        });
    }

    public static void main(String[] args) {
        EventosDeTeclado ventana = new EventosDeTeclado();
        ventana.setVisible(true);
    }
}