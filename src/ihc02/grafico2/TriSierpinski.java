/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc02.grafico2;

import java.applet.Applet;

/**
 *
 * @author macc
 */
public class TriSierpinski extends Applet {

    private Lienzo2 ma = new Lienzo2(900, 900);

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        this.add(ma);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
