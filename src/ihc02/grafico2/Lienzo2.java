/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc02.grafico2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author macc
 */
public class Lienzo2 extends Canvas {

    double sin60 = Math.sin(3.14 / 3.);
    private int n, m;

    public Lienzo2(int n, int m) {
        this.n = n;
        this.m = m;
        this.setSize(n, m);
    }

    @Override
    public void paint(Graphics g) {
        System.out.println(sin60);
        dibujar(g, 5, 600, 600, 100, 600);
       //  g.drawLine(600, 600, 100, 600);
    }

    private void dibujar(Graphics g, int nivel, double x1, double y1, double x2, double y2) {

        double dx = (x2 - x1) / 2.;
        double dy = (y2 - y1) / 2.;
        double xp32 = x1 + dx - 2 * dy * sin60;
        double yp32 = y1 + dy + 2 * dx * sin60;

        double dx1 = (x2 + x1) / 2.;
        double dy1 = (y2 + y1) / 2.;
        double dx2 = (xp32 + x2) / 2.;
        double dy2 = (yp32 + y2) / 2.;
        double dx3 = (x1 + xp32) / 2.;
        double dy3 = (y1 + yp32) / 2.;
        if (nivel == 0) {
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
            g.drawLine((int) x2, (int) y2, (int) xp32, (int) yp32);
            g.drawLine((int) xp32, (int) yp32, (int) x1, (int) y1);
        } else {
            dibujar(g, nivel - 1, x1, y1, dx1, dy1);
            dibujar(g, nivel - 1, dx1, dy1, x2, y2);
            g.setColor(Color.red);
            dibujar(g, nivel - 1, dx3, dy3, dx2, dy2);
        }
    }

}
