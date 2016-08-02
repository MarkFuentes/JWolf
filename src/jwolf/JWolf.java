/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwolf;

import org.lwjgl.opengl.Display;

/**
 *
 * @author Mark
 */
public class JWolf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DisplayManager.createDisplay();
        while(!Display.isCloseRequested()){
           DisplayManager.updateDisplay();
        }
        DisplayManager.closeDisplay();
    }
    
}
