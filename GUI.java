import javax.swing.JFrame;
/**
 * Write a description of class GUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GUI extends JFrame
{
    public static final int MIN_BALL_HEIGHT = 0;
    public static final int PADDLE_HEIGHT = 700;
    public static final int GAME_WIDTH = 600;
    public static final int GAME_HEIGHT = 800;
    public static final int TIMER_DELAY = 1;
    public static final int HEIGHT = 800;
    public static final int WIDTH = 600;
    public GUI()
    {
        setBounds(10,10,WIDTH,HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        
        Game game = new Game();
        game.setVisible(true);
        add(game);
        validate();
        game.start();
    }
}
