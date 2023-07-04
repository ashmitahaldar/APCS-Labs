//(c) A+ Computer Science
//www.apluscompsci.com

/* This is the main class for the Starfighter game
 * It basically creates an instance of the OuterSpace
 * class and goes from there.
 */

import javax.swing.JFrame;
import java.awt.Component;

public class StarFighter extends JFrame
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public StarFighter()
    {
        super("STARFIGHTER");
        setSize(WIDTH,HEIGHT);

        OuterSpace theGame = new OuterSpace();
        ((Component)theGame).setFocusable(true);

        getContentPane().add(theGame);

        setVisible(true);
    }

    public static void main( String args[] )
    {
        StarFighter run = new StarFighter();
    }
}