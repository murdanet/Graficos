package org.example;

import javax.swing.*;
import java.awt.*;

public class Pantalla extends JFrame {

    private ObjetoGrafico[] objetos;


    public Pantalla(ObjetoGrafico[] objetos) {
        this.objetos = objetos;

        // Configuración de la ventana
        setTitle("Objetos gráficos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (ObjetoGrafico objeto : objetos) {
            objeto.pintar(g);
        }
    }
}