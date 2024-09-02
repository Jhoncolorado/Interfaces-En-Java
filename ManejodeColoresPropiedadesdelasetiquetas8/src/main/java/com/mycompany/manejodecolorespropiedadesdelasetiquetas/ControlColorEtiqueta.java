
package com.mycompany.manejodecolorespropiedadesdelasetiquetas;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlColorEtiqueta extends JFrame {
    private JLabel etiTexto;
    private JButton btnAzul;
    private JButton btnRojo;
    private JButton btnVerde;
    private JButton btnFondoAzul;
    private JButton btnFondoRojo;
    private JButton btnFondoVerde;
    private JButton btnTransparente;
    private JButton btnOpaca;

    public ControlColorEtiqueta() {
        setTitle("Control del Color y Opacidad de Etiqueta");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

       
        etiTexto = new JLabel("Realizar las interfacez para este viernes");
        etiTexto.setOpaque(true); 
        etiTexto.setBackground(Color.WHITE); 
        etiTexto.setPreferredSize(new Dimension(200, 50));
        etiTexto.setHorizontalAlignment(SwingConstants.CENTER);

        
        btnAzul = new JButton("Azul");
        btnRojo = new JButton("Rojo");
        btnVerde = new JButton("Verde");
        btnFondoAzul = new JButton("Fondo Azul");
        btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoVerde = new JButton("Fondo Verde");
        btnTransparente = new JButton("Transparente");
        btnOpaca = new JButton("Opaca");

        
        btnAzul.setBounds(10, 10, 120, 30);
        btnRojo.setBounds(140, 10, 120, 30);
        btnVerde.setBounds(270, 10, 120, 30);
        btnFondoAzul.setBounds(10, 50, 120, 30);
        btnFondoRojo.setBounds(140, 50, 120, 30);
        btnFondoVerde.setBounds(270, 50, 120, 30);
        btnTransparente.setBounds(10, 90, 120, 30);
        btnOpaca.setBounds(140, 90, 120, 30);

       
        etiTexto.setBounds(10, 130, 540, 50);

        
        add(etiTexto);
        add(btnAzul);
        add(btnRojo);
        add(btnVerde);
        add(btnFondoAzul);
        add(btnFondoRojo);
        add(btnFondoVerde);
        add(btnTransparente);
        add(btnOpaca);

        
        btnAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.BLUE);
            }
        });

        btnRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.RED);
            }
        });

        btnVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.GREEN);
            }
        });

        btnFondoAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.BLUE);
            }
        });

        btnFondoRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.RED);
            }
        });

        btnFondoVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.GREEN);
            }
        });

        btnTransparente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(false);
            }
        });

        btnOpaca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(true);
            }
        });
    }

    public static void main(String[] args) {
        ControlColorEtiqueta ventana = new ControlColorEtiqueta();
        ventana.setVisible(true);
    }
}