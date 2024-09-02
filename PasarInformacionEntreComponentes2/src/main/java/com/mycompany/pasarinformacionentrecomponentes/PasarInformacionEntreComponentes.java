package com.mycompany.pasarinformacionentrecomponentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasarInformacionEntreComponentes extends JFrame {
    private JTextField txtTexto;
    private JLabel etiTexto1;
    private JLabel etiTexto2;
    private JButton btnTraspasa1;
    private JButton btnTraspasa2;

    public PasarInformacionEntreComponentes() {
        setTitle("Pasar Información entre los Componentes Graficos");
        setSize(350, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        getContentPane().setBackground(new Color(240, 248, 255)); 

        txtTexto = new JTextField();
        etiTexto1 = new JLabel("");
        etiTexto2 = new JLabel("");
        btnTraspasa1 = new JButton("Traspasa 1");
        btnTraspasa2 = new JButton("Traspasa 2");

        txtTexto.setBounds(50, 30, 250, 25); 
        etiTexto1.setBounds(50, 70, 250, 25); 
        etiTexto2.setBounds(50, 100, 250, 25); 
        btnTraspasa1.setBounds(50, 130, 120, 25); 
        btnTraspasa2.setBounds(180, 130, 120, 25); 

        Font font = new Font("SansSerif", Font.PLAIN, 14);
        txtTexto.setFont(font);
        etiTexto1.setFont(font);
        etiTexto2.setFont(font);
        btnTraspasa1.setFont(font);
        btnTraspasa2.setFont(font);

        txtTexto.setBackground(new Color(255, 255, 255)); 
        txtTexto.setForeground(new Color(70, 70, 70)); 
        etiTexto1.setForeground(new Color(70, 130, 180)); 
        etiTexto2.setForeground(new Color(70, 130, 180)); 

        btnTraspasa1.setBackground(new Color(255, 255, 255)); 
        btnTraspasa1.setForeground(new Color(70, 130, 180)); 

        btnTraspasa2.setBackground(new Color(255, 255, 255)); 
        btnTraspasa2.setForeground(new Color(70, 130, 180)); 

        add(txtTexto);
        add(etiTexto1);
        add(etiTexto2);
        add(btnTraspasa1);
        add(btnTraspasa2);

        btnTraspasa1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = txtTexto.getText();
                etiTexto1.setText(texto);
            }
        });

        btnTraspasa2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = txtTexto.getText();
                etiTexto2.setText(texto);
            }
        });
    }

    public static void main(String[] args) {
        PasarInformacionEntreComponentes ventana = new PasarInformacionEntreComponentes();
        ventana.setVisible(true);
    }
}


