package org.example;

import java.awt.*;


public abstract class ObjetoGrafico {
    protected Color color;
    protected int x, y;


    public ObjetoGrafico(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void pintar(Graphics g);
}

