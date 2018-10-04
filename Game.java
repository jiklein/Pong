import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends JPanel
{
    private Ball ball;
    private Paddle paddle;
    public Game()
    {
        ball = new Ball(Math.random()*GUI.WIDTH,1,Color.GREEN);
        paddle = new Paddle(this,Color.BLACK);
    }
    public void start()
    {
        while (ball.getY()<GUI.GAME_HEIGHT)
        {
            if (ball.getX()+Ball.DIAMETER>=paddle.getX()&&ball.getX()<=paddle.getX()+Paddle.WIDTH
                &&Math.abs(ball.getY()+Ball.DIAMETER-paddle.getY())<=ball.getV())
            {
                ball.hitPaddle(paddle.getDirection());
            }
            repaint();
        }
        setVisible(false);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(paddle.getColor());
        g.fillRect(paddle.getX(),paddle.getY(),Paddle.WIDTH,Paddle.HEIGHT);
        g.setColor(ball.getColor());
        g.fillOval(ball.getX(),ball.getY(),Ball.DIAMETER,Ball.DIAMETER);
    }
}
