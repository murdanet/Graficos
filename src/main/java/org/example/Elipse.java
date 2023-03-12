package org.example;

import java.awt.*;

//MU
public class Elipse extends ObjetoGrafico {
    protected int ancho, alto;


    public Elipse(Color color, int x, int y, int ancho, int alto) {
        super(color, x, y);
        this.ancho = ancho;
        this.alto = alto;
    }


    @Override
    public void pintar(Graphics g) {
        g.setColor(color);
        g.drawOval(x, y, ancho, alto);
    }
}
