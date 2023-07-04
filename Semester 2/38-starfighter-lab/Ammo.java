//(c) A+ Computer Science
//www.apluscompsci.com

/* This class represents a "ammo" object, which is
 ** something that a ship shoots at aliens
 */

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
    private int speed;
    private Image image;

    public Ammo()
    {
        this(0,0,1);
    }

    public Ammo(int x, int y)
    {
        //add code
        super(x, y);
    }

    public Ammo(int x, int y, int s)
    {
        //add code
        this(x, y);
        speed = s;
        try
        {
            URL url = getClass().getResource("photon.png");
            image = ImageIO.read(url);
        }
        catch(Exception e)
        {
            System.out.println("Could not open photon image file! Make sure it is there and in the right place.");
        }
    }

    public void setSpeed(int s)
    {
        //add code
        speed = s;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void draw( Graphics window )
    {
        window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
    }

    public void move( String direction )
    {
        //add code to draw the ammo
        if (direction.toUpperCase().equals("UP"))
        {
            this.setY(this.getY()-speed);
        }
    }

    public String toString()
    {
        return "";
    }
}
