package com.mycompany.notadeestudiantes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotaEstudiantes extends JFrame {
    private JTextField txtPrimerTrimestre;
    private JTextField txtSegundoTrimestre;
    private JTextField txtTercerTrimestre;
    private JLabel etiNotaFinal;
    private JLabel etiResultado;
    private JButton btnCalcular;

    public NotaEstudiantes() {
        setTitle("Calcular Nota Final");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        
        txtPrimerTrimestre = new JTextField();
        txtSegundoTrimestre = new JTextField();
        txtTercerTrimestre = new JTextField();

        
        etiNotaFinal = new JLabel("Nota Final:");
        etiResultado = new JLabel("Resultado:");

        
        btnCalcular = new JButton("Calcular");

        
        txtPrimerTrimestre.setBounds(150, 20, 100, 30);
        txtSegundoTrimestre.setBounds(150, 60, 100, 30);
        txtTercerTrimestre.setBounds(150, 100, 100, 30);

        etiNotaFinal.setBounds(20, 140, 200, 30);
        etiResultado.setBounds(20, 180, 200, 30);

        btnCalcular.setBounds(150, 220, 100, 30);

        
        add(txtPrimerTrimestre);
        add(txtSegundoTrimestre);
        add(txtTercerTrimestre);
        add(etiNotaFinal);
        add(etiResultado);
        add(btnCalcular);

        
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    double primerTrimestre = Double.parseDouble(txtPrimerTrimestre.getText());
                    double segundoTrimestre = Double.parseDouble(txtSegundoTrimestre.getText());
                    double tercerTrimestre = Double.parseDouble(txtTercerTrimestre.getText());

                    
                    double notaFinal = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3;

                    
                    etiNotaFinal.setText("Nota Final: " + String.format("%.2f", notaFinal));

                    
                    if (notaFinal < 5) {
                        etiResultado.setText("Resultado: SUSPENDIDO");
                        etiNotaFinal.setForeground(Color.RED);
                        etiResultado.setForeground(Color.RED);
                    } else {
                        etiResultado.setText("Resultado: APROBADO");
                        etiNotaFinal.setForeground(Color.BLACK);
                        etiResultado.setForeground(Color.BLACK);
                    }

                } catch (NumberFormatException ex) {
                    
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos en todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        NotaEstudiantes ventana = new NotaEstudiantes();
        ventana.setVisible(true);
    }
}
