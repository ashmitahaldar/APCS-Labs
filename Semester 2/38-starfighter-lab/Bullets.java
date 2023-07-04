//(c) A+ Computer Science
//www.apluscompsci.com

/* This class keeps track of all the "bullets" (or shots)
 ** that are currently on the screen. Once a bullet leaves the screen
 ** (or impacts with an alien) it should be removed from the list
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Bullets
{
    private List<Ammo> ammo;

    public Bullets()
    {
        ammo = new ArrayList<Ammo>();
    }

    public void add(Ammo al)
    {
        ammo.add(al);
    }

    public void drawEmAll( Graphics window )
    {
        for (Ammo a : ammo)
        {
            a.draw(window);
        }
    }

    public void moveEmAll()
    {
        for (Ammo a : ammo)
        {
            a.move("UP");
        }
    }

    public void cleanEmUp()
    {
        for (int i = ammo.size(); i >= 0; i--)
        {
            ammo.remove(i);
        }
    }

    public List<Ammo> getList()
    {
        return ammo;
    }

    public String toString()
    {
        return "";
    }
}
