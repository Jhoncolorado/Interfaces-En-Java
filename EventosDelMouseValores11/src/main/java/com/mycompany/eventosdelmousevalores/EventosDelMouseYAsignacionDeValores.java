package com.mycompany.eventosdelmousevalores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventosDelMouseYAsignacionDeValores extends JFrame {

    private JTextField txtNumero;
    private JButton btnBorrar;

    public EventosDelMouseYAsignacionDeValores() {
        setTitle("Eventos del Mouse y Asignación de Valores");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        
        txtNumero = new JTextField(20);
        txtNumero.setEditable(false);
        txtNumero.setFont(new Font("Arial", Font.PLAIN, 18));
        txtNumero.setHorizontalAlignment(SwingConstants.CENTER);

        
        btnBorrar = new JButton("Borrar");

        
        JPanel panelEtiquetas = new JPanel();
        panelEtiquetas.setLayout(new GridLayout(2, 5, 5, 5)); 

        for (int i = 0; i < 10; i++) {
            JLabel etiqueta = new JLabel(String.valueOf(i), SwingConstants.CENTER);
            etiqueta.setPreferredSize(new Dimension(50, 30));
            etiqueta.setOpaque(true);
            etiqueta.setBackground(Color.LIGHT_GRAY);
            etiqueta.setFont(new Font("Arial", Font.PLAIN, 16));
            etiqueta.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    
                    txtNumero.setText(txtNumero.getText() + etiqueta.getText());
                }
            });
            panelEtiquetas.add(etiqueta);
        }

        
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumero.setText("");
            }
        });

       
        add(panelEtiquetas);
        add(txtNumero);
        add(btnBorrar);
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventosDelMouseYAsignacionDeValores().setVisible(true);
            }
        });
    }
}
