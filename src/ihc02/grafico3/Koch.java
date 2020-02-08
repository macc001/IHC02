/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc02.grafico3;

import java.applet.Applet;

/**
 *
 * @author macc
 */
public class Koch extends Applet {

    Lienzo3 l=new Lienzo3(600, 600);
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        this.add(l);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
