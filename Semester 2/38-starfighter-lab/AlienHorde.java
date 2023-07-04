//(c) A+ Computer Science
//www.apluscompsci.com

/* This class represents a "horde" (or group) of
 ** aliens. A horde all behaves the same (i.e. moves together)
 ** so you can use this to your advantage!
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;
import java.awt.Rectangle;

public class AlienHorde
{
    private List<Alien> aliens;
    private boolean left;
    private int goingDownTimerKinda;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public AlienHorde(int size)
    {
        left = false;
        aliens = new ArrayList(size);
        //for (int i = 0; i < size; i++)
        //{
            //aliens.add(new);
        //}
        goingDownTimerKinda = 0;
    }

    public void add(Alien al)
    {
        aliens.add(al);
    }

    public void drawEmAll( Graphics window )
    {
        for (Alien a : aliens)
        {
            a.draw(window);
        }
    }

    public void moveEmAll()
    {
        for (Alien a : aliens)
        {
            if (a.getX() > WIDTH-50) 
            {
                a.setX(WIDTH-50);
                left = true;
            } else if (a.getX() < 0)
            {
                a.setX(0);
                left = false;
            }
        
            if (!left)
            {   
                a.move("RIGHT");
            } else {
                a.move("LEFT");
            }
            
            if (goingDownTimerKinda == 5)
            {
                a.move("DOWN");
            }
        }
        if (goingDownTimerKinda == 10) goingDownTimerKinda = 0;
        goingDownTimerKinda++;
    }

    public void removeDeadOnes(List<Ammo> shots)
    {
        // given a list of "shots" (Ammo objects), see if any of them
        // have collided with any of the aliens in this horde, if so,
        // remove them from the list
        if (shots.size() > 0){
            for (int a = aliens.size()-1; a >= 0; a--)
            {
                for (int s = shots.size()-1; s >= 0; s--)
                {
                    Rectangle alienrect = new Rectangle(aliens.get(a).getX(), aliens.get(a).getY(), 50, 50);
                    Rectangle shotrect = new Rectangle(shots.get(s).getX(), shots.get(s).getY(), 50, 50);
                    if (alienrect.intersects(shotrect))
                    {
                        aliens.remove(a);
                    }
                }
            }
        }
    }
    
    public List<Alien> getList()
    {
        return aliens;
    }

    public String toString()
    {
        return "";
    }
}