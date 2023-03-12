package org.example;

import java.awt.*;

public class Triangulo extends ObjetoGrafico {
    protected int base, altura;


    public Triangulo(Color color, int x, int y, int base, int altura) {
        super(color, x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void pintar(Graphics g) {
        g.setColor(color);
        int[] xPoints = {x, x + base / 2, x + base};
        int[] yPoints = {y + altura, y, y + altura};
        g.drawPolygon(xPoints, yPoints, 3);
    }
}
