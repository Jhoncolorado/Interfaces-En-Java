package com.mycompany.eventosdelmouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventosDelMouse extends JFrame {
    private JLabel etiPal1;
    private JLabel etiPal2;
    private JLabel etiPal3;
    private JLabel etiPal4;
    private JLabel etiOcultar;

    public EventosDelMouse() {
        setTitle("Eventos del Mouse");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        
        etiPal1 = new JLabel("Palabra 1");
        etiPal2 = new JLabel("Palabra 2");
        etiPal3 = new JLabel("Palabra 3");
        etiPal4 = new JLabel("Palabra 4");

        
        etiOcultar = new JLabel("Ocultar");
        etiOcultar.setOpaque(true); 
        etiOcultar.setBackground(Color.YELLOW); 
        etiOcultar.setFont(new Font("SansSerif", Font.BOLD, 20)); 
        etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);

        
        etiPal1.setBounds(50, 30, 100, 30);
        etiPal2.setBounds(50, 70, 100, 30);
        etiPal3.setBounds(50, 110, 100, 30);
        etiPal4.setBounds(50, 150, 100, 30);
        etiOcultar.setBounds(200, 30, 150, 150);

       
        add(etiPal1);
        add(etiPal2);
        add(etiPal3);
        add(etiPal4);
        add(etiOcultar);

        
        etiOcultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
              
                etiPal1.setVisible(false);
                etiPal2.setVisible(false);
                etiPal3.setVisible(false);
                etiPal4.setVisible(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                etiPal1.setVisible(true);
                etiPal2.setVisible(true);
                etiPal3.setVisible(true);
                etiPal4.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        EventosDelMouse ventana = new EventosDelMouse();
        ventana.setVisible(true);
    }
}