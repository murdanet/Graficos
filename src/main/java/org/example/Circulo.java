package org.example;

import java.awt.*;

// Miguel Urdaneta
public class Circulo extends ObjetoGrafico {
    protected int radio;

    public Circulo(Color color, int x, int y, int radio) {
        super(color, x, y);
        this.radio = radio;
    }

    @Override
    public void pintar(Graphics g) {
        g.setColor(color);
        g.drawOval(x, y, radio * 2, radio * 2);
    }
}
