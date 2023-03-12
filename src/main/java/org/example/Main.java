package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ObjetoGrafico[] objetos = new ObjetoGrafico[4];
        objetos[0] = new Circulo(Color.BLUE, 100, 100, 50);
        objetos[1] = new Triangulo(Color.RED, 300, 200, 100, 100);
        objetos[2] = new Elipse(Color.GREEN, 500, 300, 100, 50);
        ImageIcon imagen = new ImageIcon("sprite.png");
        objetos[3] = new Sprite(Color.BLACK, 200, 300, imagen.getImage());

        Pantalla pantalla = new Pantalla(objetos);
        pantalla.repaint();
    }
}