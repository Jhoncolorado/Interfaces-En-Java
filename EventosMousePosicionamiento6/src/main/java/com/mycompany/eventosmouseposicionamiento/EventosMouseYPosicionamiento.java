
package com.mycompany.eventosmouseposicionamiento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventosMouseYPosicionamiento extends JFrame {
    private JLabel etiNombre;
    private JButton btnEsquina;
    private JButton btnCentro;
    private JButton btnAgrandar;
    private JButton btnAchicar;

    public EventosMouseYPosicionamiento() {
        setTitle("Eventos del Mouse y Posicionamiento");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        
        etiNombre = new JLabel("Jhon Stiven");
        etiNombre.setOpaque(true);
        etiNombre.setBackground(Color.CYAN);
        etiNombre.setPreferredSize(new Dimension(150, 50));
        etiNombre.setHorizontalAlignment(SwingConstants.CENTER);

        
        btnEsquina = new JButton("Esquina");
        btnCentro = new JButton("Centro");
        btnAgrandar = new JButton("Agrandar");
        btnAchicar = new JButton("Achicar");

        
        btnEsquina.setBounds(10, 10, 120, 30);
        btnCentro.setBounds(140, 10, 120, 30);
        btnAgrandar.setBounds(270, 10, 120, 30);
        btnAchicar.setBounds(400, 10, 120, 30);

        
        etiNombre.setBounds(10, 60, 150, 50);
        add(etiNombre);

     
        add(btnEsquina);
        add(btnCentro);
        add(btnAgrandar);
        add(btnAchicar);

        
        btnEsquina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                etiNombre.setLocation(10, 60);
            }
        });

        btnCentro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mover la etiqueta al centro
                int x = (getWidth() - etiNombre.getWidth()) / 2;
                int y = (getHeight() - etiNombre.getHeight()) / 2;
                etiNombre.setLocation(x, y);
            }
        });

        btnAgrandar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Dimension size = etiNombre.getSize();
                etiNombre.setSize(size.width + 20, size.height + 10);
            }
        });

        btnAchicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                Dimension size = etiNombre.getSize();
                if (size.width > 50 && size.height > 20) { 
                    etiNombre.setSize(size.width - 20, size.height - 10);
                }
            }
        });

        
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JButton btn = (JButton) e.getSource();
                btn.setSize(btn.getWidth() + 10, btn.getHeight() + 5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                JButton btn = (JButton) e.getSource();
                btn.setSize(btn.getWidth() - 10, btn.getHeight() - 5);
            }
        };

        btnEsquina.addMouseListener(mouseAdapter);
        btnCentro.addMouseListener(mouseAdapter);
        btnAgrandar.addMouseListener(mouseAdapter);
        btnAchicar.addMouseListener(mouseAdapter);
    }

    public static void main(String[] args) {
        EventosMouseYPosicionamiento ventana = new EventosMouseYPosicionamiento();
        ventana.setVisible(true);
    }
}