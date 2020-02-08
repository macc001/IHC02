/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc02.grafico1;

import java.applet.Applet;

/**
 *
 * @author macc
 */
public class Sierpinski extends Applet {

    private Lienzo1 lz;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        lz = new Lienzo1(500, 500);
        this.add(lz);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
