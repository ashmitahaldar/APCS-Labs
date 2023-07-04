//(c) A+ Computer Science
//www.apluscompsci.com

/* This class represents "space" which is made up of ships and aliens.
 ** This is used to draw all the things on the screen and handle key presses
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Rectangle;
import java.awt.Font;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
    private Ship ship;
    //private Alien alienOne;
    //private Alien alienTwo;
    
    //private Ammo b;

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    /* uncomment once you finish the AlienHorde and Bullets classes
     * */
    private AlienHorde horde;
    private Bullets shots;
    
    private boolean left;
    private boolean lose;

    private boolean[] keys;
    private BufferedImage back;

    public OuterSpace()
    {
        setBackground(Color.black);

        keys = new boolean[5];

        // instantiate other instance variables
        // ship (after Task 3 complete)
        ship = new Ship(400,300,50,50,1);
        // alien(s) (after Task 4 complete)    
        //alienOne = new Alien(450,150,50,50,1);
        //alienTwo = new Alien(350,150,50,50,1);    
        //b = new Ammo();
        shots = new Bullets();
        
        horde = new AlienHorde(10);
        //horde.add(new Alien(80,150,50,50,1));
        for (int x = 10; x < 800; x += 80)
        {
            for (int y = 50; y <= 100; y += 50)
            {
                horde.add(new Alien(x,y,50,50,1));
            }
        }
        
        left = false;
        lose = false;
        
        this.addKeyListener(this);
        new Thread(this).start();

        setVisible(true);
    }

    public void update(Graphics window)
    {
        paint(window);
    }

    public void paint( Graphics window )
    {
        //set up the double buffering to make the game animation nice and smooth
        Graphics2D twoDGraph = (Graphics2D)window;

        //take a snap shop of the current screen and same it as an image
        //that is the exact same width and height as the current screen
        if(back==null)
            back = (BufferedImage)(createImage(getWidth(),getHeight()));

        //create a graphics reference to the back ground image
        //we will draw all changes on the background image
        Graphics graphToBack = back.createGraphics();

        graphToBack.setColor(Color.BLUE);
        graphToBack.drawString("StarFighter ", 25, 50 );
        graphToBack.setColor(Color.BLACK);
        graphToBack.fillRect(0,0,800,600);

        // look at the keys array and see which key was pressed
        // see the function keyPressed to see which entry corresponds
        // to which key
        if(keys[0] == true)
        {
            //uncomment after you complete
            //the constructor - must make
            //a new Ship before you can make
            //ship move left            
            ship.move("LEFT");
            if (ship.getX() < 0) ship.setX(0);
        }
        //else if right check
        else if (keys[1] == true)
        {
            ship.move("RIGHT");
            if (ship.getX() > WIDTH-50) ship.setX(WIDTH-50);
        }
        //else if up check
        else if (keys[2] == true)
        {
            ship.move("UP");
            if (ship.getY() < 0) ship.setY(0);
        }
        //else if down check
        else if (keys[3] == true)
        {
            ship.move("DOWN");
            if (ship.getY() > HEIGHT-50) ship.setY(HEIGHT-50);//*** */
        }

        //uncomment to draw the ship on the screen
        ship.draw(graphToBack);

        //add code to move Alien(s), Bullets, etc.
        //aliens
        horde.moveEmAll();
        
        //bullets
        if (keys[4] == true)
        {
            shots.add(new Ammo(ship.getX(), ship.getY(), 3));
        }
        if (shots.getList().size() > 0) shots.moveEmAll();
        
        //add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
        //HINT: you know the x/y coordinates and sizes of everything!
        if (shots.getList().size() > 0) horde.removeDeadOnes(shots.getList());
        for (int a = horde.getList().size()-1; a >= 0; a--)
        {
            Rectangle shiprect = new Rectangle(ship.getX(), ship.getY(), 50, 50);
            Rectangle alienrect = new Rectangle(horde.getList().get(a).getX(), horde.getList().get(a).getY(), 50, 50);
            if (shiprect.intersects(alienrect))
            {
                lose = true;
                break;
            }
        }
        
        //checking if win or lose
        if (lose)
        {
            Font f = new Font("Dialog", Font.PLAIN, 24);
            graphToBack.setColor(Color.RED);
            graphToBack.setFont(f);
	    graphToBack.drawString("GAME OVER!", 400, 300);
        }
        else if (horde.getList().size() == 0)
        {
            Font f = new Font("Dialog", Font.PLAIN, 24);
            graphToBack.setColor(Color.YELLOW);
            graphToBack.setFont(f);
            graphToBack.drawString("VICTORY!", 400, 300);   
        }

        //alienOne.draw(graphToBack);
        //alienTwo.draw(graphToBack);
        horde.drawEmAll(graphToBack);
        if (shots.getList().size() > 0) shots.drawEmAll(graphToBack);
        twoDGraph.drawImage(back, null, 0, 0);
    }

    // update the keys array based on which key was pressed
    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            keys[0] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            keys[1] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP)
        {
            keys[2] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            keys[3] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            keys[4] = true;
        }
        repaint();
    }

    public void keyReleased(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            keys[0] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            keys[1] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP)
        {
            keys[2] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            keys[3] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            keys[4] = false;
        }
        repaint();
    }

    public void keyTyped(KeyEvent e)
    {
        //no code needed here
    }

    public void run()
    {
        try
        {
            while(true)
            {
                Thread.currentThread().sleep(5);
                repaint();
            }
        }catch(Exception e)
        {
        }
    }
}

/*for (int s = shots.getList().size(); s >= 0; s--)
            {
                Rectangle alienrect = new Rectangle(alienOne.getX(), alienOne.getY(), 50, 50);
        Rectangle shotrect = new Rectangle(shots.getList().get(s).getX(), shots.getList().get(s).getY(), 50, 50);
        if (alienrect.intersects(shotrect))
        {
            alienOne = new Alien();
          }
            }
            
for (int s = shots.getList().size()-1; s >= 0; s--)
        {
            Rectangle shiprect = new Rectangle(ship.getX(), ship.getY(), 50, 50);
            Rectangle shotrect = new Rectangle(shots.getList().get(s).getX(), shots.getList().get(s).getY(), 50, 50);
            if (shiprect.intersects(shotrect))
            {
                lose = true;
            }
        }  */

