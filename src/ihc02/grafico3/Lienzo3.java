/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc02.grafico3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author macc
 */
public class Lienzo3 extends Canvas {

    double sin60 = Math.sin(3.14 / 3.);
    private int n, m;

    public Lienzo3(int n, int m) {
        this.n = n;
        this.m = m;
        this.setSize(n, m);
    }

    public void paint(Graphics g) {
        dibujar(g, 2, 600, 600, 100, 600);
    }

    private void dibujar(Graphics g, int nivel, double x1, double y1, double x2, double y2) {
        double dx = (x2 - x1) / 3.;
        double dy = (y2 - y1) / 3.;
        double xx = x1 + 3 * dx / 2. - dy * sin60;
        double yy = y1 + 3 * dy / 2. + dx * sin60;
        if (nivel <= 0) {
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        } else {
            dibujar(g, nivel - 1, x1, y1, x1 + dx, y1 + dy);
            g.setColor(Color.red);
            dibujar(g, nivel - 1, x1 + dx, y1 + dy, xx, yy);
            dibujar(g, nivel - 1, xx, yy, x2 - dx, y2 - dy);
            g.setColor(Color.blue);
            dibujar(g, nivel - 1, x2 - dx, y2 - dy, x2, y2);
        }
    }
}
