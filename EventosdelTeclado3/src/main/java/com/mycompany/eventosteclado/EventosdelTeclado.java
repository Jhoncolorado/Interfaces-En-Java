package com.mycompany.eventosteclado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EventosdelTeclado extends JFrame {
    private JTextField txtTexto;
    private JLabel etiTexto;
    private JButton btnVaciar;

    public EventosdelTeclado() {
        setTitle("Eventos del Teclado");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

       
        txtTexto = new JTextField();
        etiTexto = new JLabel("");
        btnVaciar = new JButton("Vaciar");

        
        txtTexto.setBounds(50, 30, 250, 25);
        etiTexto.setBounds(50, 70, 250, 25);
        btnVaciar.setBounds(120, 110, 100, 30);

        
        Font font = new Font("SansSerif", Font.PLAIN, 14);
        txtTexto.setFont(font);
        etiTexto.setFont(font);
        btnVaciar.setFont(font);

        txtTexto.setBackground(new Color(255, 255, 255)); 
        txtTexto.setForeground(new Color(70, 70, 70)); 

        etiTexto.setForeground(new Color(70, 130, 180)); 

        btnVaciar.setBackground(new Color(255, 255, 255)); 
        btnVaciar.setForeground(new Color(70, 130, 180)); 

        
        add(txtTexto);
        add(etiTexto);
        add(btnVaciar);

        
        txtTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String texto = txtTexto.getText();
                etiTexto.setText(texto);
            }
        });

        
        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTexto.setText("");
                etiTexto.setText("");
            }
        });
    }

    public static void main(String[] args) {
        EventosdelTeclado ventana = new EventosdelTeclado();
        ventana.setVisible(true);
    }
}
