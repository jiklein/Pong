import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.Color;
/**
 * Write a description of class Ball2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Graphic
{
    public static final int DIAMETER = 30;
    private Timer timer;
    private double vx,vy;
    public Ball(double xInit, double vInit, Color color)
    {
        super(xInit,GUI.MIN_BALL_HEIGHT+1,color);
        vx = vy = vInit;
        timer = new Timer(GUI.TIMER_DELAY,new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if (x<0)
                {
                    x=0;
                    vx=-vx;
                }
                else if (x>GUI.GAME_WIDTH-1.25*DIAMETER)
                {    
                    x=GUI.GAME_WIDTH-1.25*DIAMETER;
                    vx=-vx;
                }
                else
                    x+=vx;
                if (y<GUI.MIN_BALL_HEIGHT)
                {
                    y=GUI.MIN_BALL_HEIGHT;
                    vy=-vy;
                }
                else
                    y+=vy;
            }
        });
        timer.start();
    }
    public void hitPaddle(int direction)
    {
        vx = Math.abs(vx)*direction;
        vy=-vy;
        y = GUI.PADDLE_HEIGHT-DIAMETER-Math.abs(vy);
    }
    public int getV()
    {
        return Math.abs((int)vx);
    }
    public void setV(double v)
    {
        vx+=v;
        vy+=v;
    }
}
