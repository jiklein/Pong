import java.awt.Color;
/**
 * Write a description of class Ball2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graphic
{
    protected double x,y;
    private Color color;
    public Graphic(double xInit, double yInit, Color color)
    {
        x=xInit;
        y=yInit;
        this.color = color;
    }
    public int getX()
    {
        return (int)x;
    }
    public int getY()
    {
        return (int)y;
    }
    public Color getColor()
    {
        return color;
    }
}

