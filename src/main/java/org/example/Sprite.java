package org.example;

import java.awt.*;

// Clase que representa un sprite
public class Sprite extends ObjetoGrafico {
    private Image imagen;


    public Sprite(Color color, int x, int y, Image imagen) {
        super(color, x, y);
        this.imagen = imagen;
    }


    @Override
    public void pintar(Graphics g) {
        g.drawImage(imagen, x, y, null);
    }
}
