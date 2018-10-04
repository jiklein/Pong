import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.Color;
/**
 * Write a description of class Ball2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Graphic
{
    public static final int HEIGHT = 30;
    public static final int WIDTH = 100;
    private double lastX;
    public Paddle(JPanel panel,Color color)
    {
        super(0,GUI.PADDLE_HEIGHT,color);
        lastX=0;
        panel.addMouseMotionListener(new MouseMotionListener(){
            public void mouseMoved(MouseEvent e)
            {
                lastX=x;
                x=e.getX();
            }
            public void mouseDragged(MouseEvent e) {}
        });
    }
    public int getDirection()
    {
        if (x-lastX<=0)
            return -1;
        else
            return 1;
    }
}