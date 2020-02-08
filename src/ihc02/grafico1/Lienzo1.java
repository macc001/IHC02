/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc02.grafico1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author macc
 */
public class Lienzo1 extends Canvas {

    private int n, m;

    public Lienzo1(int n, int m) {
        this.n = n;
        this.m = m;
        this.setSize(n, m);
    }

    public void paint(Graphics g) {
        // g.setColor(Color.CYAN.yellow);
        dibujar(0, 0, n, m, 3, g);
    }

    private void dibujar(int x, int y, int n, int m, int nivel, Graphics g) {
        if (nivel == 0) {
            g.fillRect(x, y, n, m);
            g.setColor(Color.red);
            // g.fillOval(x, y, n, m);
            return;
        }
        int ancho = m / 3;
        int alto = m / 3;
        g.setColor(Color.BLUE);
        dibujar(x, y, ancho, alto, nivel - 1, g);
      //   g.setColor(Color.BLUE);
        dibujar(x + ancho, y, ancho, alto, nivel - 1, g);
        //   g.setColor(Color.CYAN); 
        g.setColor(Color.BLUE);
        dibujar(x + 2 * ancho, y, ancho, alto, nivel - 1, g);
        //   g.setColor(Color.red);
       // dibujar(x, y + alto, ancho, alto, nivel - 1, g);
        //    g.setColor(Color.black);
      //  dibujar(x + 2 * ancho, y + alto, ancho, alto, nivel - 1, g);
        //    g.setColor(Color.yellow);
        dibujar(x, y + 2 * alto, ancho, alto, nivel - 1, g);
        //    g.setColor(Color.GRAY);
        dibujar(x + ancho, y + 2 * alto, ancho, alto, nivel - 1, g);
        //   g.setColor(Color.pink);
        g.setColor(Color.BLUE);
        dibujar(x + 2 * ancho, y + 2 * alto, ancho, alto, nivel - 1, g);
    }

}
