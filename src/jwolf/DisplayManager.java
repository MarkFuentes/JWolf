
package jwolf;

import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;


public class DisplayManager {
    
    private static final int SCREEN_WIDTH = 1280;
    private static final int SCREEN_HEIGHT = 720;
    private static final int FPS_CAP = 120;
    
    public static void createDisplay(){
        
        ContextAttribs attribs = new ContextAttribs(3,2).withForwardCompatible(true).withProfileCore(true);
        
        try {
            Display.setDisplayMode(new DisplayMode(SCREEN_WIDTH, SCREEN_HEIGHT));
            Display.create(new PixelFormat(), attribs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        GL11.glViewport(0,0, SCREEN_WIDTH, SCREEN_WIDTH);
    }
    public static void updateDisplay(){
        Display.sync(FPS_CAP);
        Display.update();
    }
    public static void closeDisplay() {
        Display.destroy();
    }
}
