package com.mycompany.ocultarvisualizarcomponente;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private JLabel etiNombre;
    private JLabel etiCiudad;
    private JButton btnOcultarNombre;
    private JButton btnVisuNombre;
    private JButton btnOcultarCiudad;
    private JButton btnVisuCiudad;

    public VentanaPrincipal() {
        
        setTitle("Ocultar y Visualizar Componentes");
        setSize(400,200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        etiNombre = new JLabel("Nombre: Jhon stiven colorado");
        etiCiudad = new JLabel("Ciudad: Armenia, Quindio");
        btnOcultarNombre = new JButton("Ocultar Nombre");
        btnVisuNombre = new JButton("Visualizar Nombre");
        btnOcultarCiudad = new JButton("Ocultar Ciudad");
        btnVisuCiudad = new JButton("Visualizar Ciudad");

        
        etiNombre.setBounds(50, 30, 200, 20);
        etiCiudad.setBounds(50, 60, 200, 20);
        btnOcultarNombre.setBounds(50, 100, 150, 30);
        btnVisuNombre.setBounds(210, 100, 150, 30);
        btnOcultarCiudad.setBounds(50, 140, 150, 30);
        btnVisuCiudad.setBounds(210, 140, 150, 30);

        
        add(etiNombre);
        add(etiCiudad);
        add(btnOcultarNombre);
        add(btnVisuNombre);
        add(btnOcultarCiudad);
        add(btnVisuCiudad);

        
        btnOcultarNombre.addActionListener(this);
        btnVisuNombre.addActionListener(this);
        btnOcultarCiudad.addActionListener(this);
        btnVisuCiudad.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOcultarNombre) {
            etiNombre.setVisible(false);
        } else if (e.getSource() == btnVisuNombre) {
            etiNombre.setVisible(true);
        } else if (e.getSource() == btnOcultarCiudad) {
            etiCiudad.setVisible(false);
        } else if (e.getSource() == btnVisuCiudad) {
            etiCiudad.setVisible(true);
        }
    }
}
    

