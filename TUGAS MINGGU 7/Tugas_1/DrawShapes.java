package Tugas_1;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
    GOL     : TIF B - BONDOWOSO
*/
import java.awt.*;
import java.applet.*;
public class DrawShapes extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    @Override
    public void init(){
    // The font is arial size, 18 and is italicized
    font = new Font("Arial",Font.ITALIC,18);
    
    // Some colors are predefined in the Color class
    redColor = Color.red;
    backgroundColor = Color.ORANGE;
    
    // Color can be created using Red, Green, Blue, Values
    blueColor = new Color(0,0,122);
    
    // She the bacgkround Color of the applet
    setBackground(backgroundColor);
    }
    
    @Override
    public void stop(){
        
    }
    
    // The method pants the shapes to the screen
    @Override
    public void paint(Graphics graph){
        // Set fon
        graph.setFont(font);
        // Create a tittle
        graph.drawString("Draw Shapes", 90, 20);
        graph.setColor(blueColor);    
        // Set the coler for the first shape
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);
        // This will fill a rectangle
        graph.setColor(redColor);
        // Draw a circle using drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        graph.fillArc(110, 110, 50, 50, 0, 360);
        // Set color for next shape
        graph.setColor(Color.CYAN);
        // Draw another rectangle
        graph.drawRect(50, 50, 50, 50);
        // This will fill a rectangle
        graph.fillRect(50, 50, 60, 60);     
    }
}